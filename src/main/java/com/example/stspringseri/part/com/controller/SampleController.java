package com.example.stspringseri.part.com.controller;

import com.example.stspringseri.part.com.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

    // call case 2
    @Autowired SampleService service;

    @Autowired ApplicationContext ctx;

    // call case 4
    SampleService service4;
    SampleController(SampleService service){
        this.service4 = service;
    }

    @GetMapping
    public String test() {
        // call case 1 ==> X
//        SampleService service = new SampleService();

        // call case 2
        service.test();

        // call case 3
        SampleService service2 = ctx.getBean("sampleService", SampleService.class);
        service2.test();

        // call case 4
        service4.test();

        return "good job";
    }
}
