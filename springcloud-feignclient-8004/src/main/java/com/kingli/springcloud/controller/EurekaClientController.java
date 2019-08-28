package com.kingli.springcloud.controller;

import com.kingli.springcloud.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 采坑记录：springboot版本位1.5.9时，引入 feign   2.x时，引入openfeign
 */
@RestController
public class EurekaClientController {
    @Autowired
    FeignService  feignService;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne( name );
    }


}
