package com.kingli.springcloud.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/8002")
public class EurekaClientController {
     @Autowired
     RestTemplate restTemplate;

     @RequestMapping("/client")
     public String client(@RequestParam String name){
         return restTemplate.getForObject("http://SERVICE-HI/hello/name?name="+name,String.class);
     }

     @RequestMapping("/name")
     public String dd(){
          return "helloword";
     }

}
