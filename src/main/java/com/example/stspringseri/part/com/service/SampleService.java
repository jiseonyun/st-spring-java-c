package com.example.stspringseri.part.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    @Autowired OneService serviceOne;

    public String test(){
        return "good job";
    }
}
