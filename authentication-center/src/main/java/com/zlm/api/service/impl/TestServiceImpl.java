package com.zlm.api.service.impl;

import com.zlm.api.service.TestService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * TestServiceImpl
 *
 * @author ZeXin.Chen
 * @time 2021/2/1
 */
@DubboService
public class TestServiceImpl implements TestService {
    /**
     * 测试接口
     *
     * @param str
     * @return
     */
    @Override
    public String test(String str) {
        return "接收到数据："+str;
    }
}
