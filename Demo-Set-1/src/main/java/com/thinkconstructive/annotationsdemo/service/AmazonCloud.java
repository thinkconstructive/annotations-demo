package com.thinkconstructive.annotationsdemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class AmazonCloud implements Cloud{

    @Override
    public void getCloud() {
        System.out.println("Amazon Cloud Provider got invoked");
    }
}
