package com.zlm;

import com.zlm.api.service.TestService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 *
 * @author ZeXin.Chen
 * @time 2021/2/1
 */
@RestController
public class Controller {

    @DubboReference
    private TestService testService;

    /**
     * 测试接口
     * @param str
     * @return
     */
    @RequestMapping("/")
    public String test(String str){
        return testService.test(str);
    }
}
