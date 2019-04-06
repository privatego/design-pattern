package com.dingdang.pattern.ch05.adapter;

/**
 * @author: blessed
 * @Date: 2019/4/5
 */
public class LoginForThirdAdapter extends LoginService implements ILoginForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id, LoginForQQAdapter.class);
    }

    private ResultMsg processLogin(String id, Class<? extends LoginAdapter> clazz) {
        try {
            LoginAdapter adapter = clazz.newInstance();
            if (adapter.support(adapter)){
                return adapter.login(id, adapter);
            }
            return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
