package com.dubbo.nacos.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zz.contract.IUserService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${demo.service.version}")
public class UserService implements IUserService {

    @Value("${demo.service.name}")
    private String serviceName;

    @Override
    public String getUserInfo(String arg) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                arg,
                arg);
    }
}
