package com.dingdang.pattern.ch03.proxy.gpproxy;


import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public class GPProxy {

    //目标类的接口实现不能多于65535，数组长度限制

    public static Object newProxyInstance(GPClassLoader loader,
                                          Class<?>[] interfaces,
                                          GPInvocationHandler h) {
        //生成代码（自己生成 ，自己加载）
        try {
            //1.动态生成源代码
            String src = generateSrc(interfaces);
            //System.out.println(src);
            //2.Java文件输出到磁盘
            String filePath = GPProxy.class.getResource("").getPath();
            File f = new File(filePath + "$Proxy0.java");
            System.out.println(f.getPath());
            FileWriter fw = new FileWriter(f);
            fw.write(src);
            fw.flush();
            fw.close();

            //3.编译
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager manager = compiler.getStandardFileManager(null, null, null);

            Iterable iterable = manager.getJavaFileObjects(f);

            JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, iterable);
            task.call();//编译
            manager.close();
            //4.加载class文件
            Class proxyClass = loader.findClass("$Proxy0");
            Constructor c = proxyClass.getConstructor(GPInvocationHandler.class);
            return c.newInstance(h);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static final String ln = "\r\n";

    private static String generateSrc(Class<?>[] interfaces) {
        //用代码写代码
        StringBuilder sb = new StringBuilder();
        sb.append("package com.dingdang.pattern.ch03.proxy.gpproxy;" + ln);
        sb.append("import com.dingdang.pattern.ch03.proxy.Person;" + ln);
        sb.append("import java.lang.reflect.*;" + ln);
        sb.append("public class $Proxy0 implements " + interfaces[0].getName() + "{" + ln);
        sb.append("     GPInvocationHandler h;" + ln);
        sb.append("     public $Proxy0(GPInvocationHandler h) {" + ln);
        sb.append("         this.h = h;" + ln);
        sb.append("     }" + ln);
        for (Method m : interfaces[0].getMethods()) {
            sb.append("     public " + m.getReturnType() + " " + m.getName() + "() {" + ln);
            sb.append("         try{" + ln);
            sb.append("             Method m = " + interfaces[0].getName() + ".class.getMethod(\"" + m.getName() + "\", new Class[]{});" + ln);
            sb.append("             this.h.invoke(this, m, null);" + ln);
            sb.append("         } catch(Throwable e){" + ln);
            sb.append("             e.printStackTrace();" + ln);
            sb.append("         }" + ln);
            //sb.append("         "+ getReturnEmptyCode(m.getReturnType()));
            sb.append("     }" + ln);
        }

        sb.append("}" + ln);
        return sb.toString();
    }
    private static Map<Class,Class> mappings = new HashMap<>();
    static {
        mappings.put(int.class, Integer.class);
    }
    private static String getReturnEmptyCode(Class<?> returnClass) {
        if (mappings.containsKey(returnClass)){
            return "return 0;";
        }else if (returnClass == Void.class){
            return "";
        }else {
            return "return null;";
        }
    }
}
