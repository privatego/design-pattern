package com.dingdang.pattern.ch03.proxy.gpproxy;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.InvocationHandler;

/**
 * @author: blessed
 * @Date: 2019/3/10
 */
public class GPProxy {
    public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h){
        //生成代码（自己生成 ，自己加载）
     try{
         String src = generateSrc(interfaces);
         System.out.println(src);
         //2.Java文件输出到磁盘
         String filePath = GPProxy.class.getResource("").getPath();
         File f = new File(filePath + "$Proxy0.java");
         FileWriter fw = new FileWriter(f);
         fw.write(src);
         fw.flush();
         fw.close();

         JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
         StandardJavaFileManager manager = compiler.getStandardFileManager(null, null , null);

         Iterable iterable = manager.getJavaFileObjects(f);

         JavaCompiler.CompilationTask task = compiler.getTask(null, manager, null, null, null, null);
         task.call();//编译


     }catch (Exception e){

     }


        return null;
    }

    private static final String ln = "\r\n";
    private static String generateSrc(Class<?>[] interfaces){
        //用代码写代码
        StringBuilder sb = new StringBuilder();
        sb.append("package com.dingdang.pattern.ch03.proxy.gpproxy;" + ln);
        sb.append("import com.dingdang.pattern.ch03.proxy.Person;" + ln);


        return sb.toString();
    }
}
