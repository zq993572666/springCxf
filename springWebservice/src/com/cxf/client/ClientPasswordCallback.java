package com.cxf.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;


/**
 * 客户端身份验证类.
 * @author lw
 * @version v1.0 2012-8-30
 */
public class ClientPasswordCallback implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {
        for(int i=0;i<callbacks.length;i++){
            WSPasswordCallback ps=(WSPasswordCallback) callbacks[i];
            //设置用户登录用户密码
            ps.setPassword("123");
            ps.setIdentifier("test1");
        }
    }
}


