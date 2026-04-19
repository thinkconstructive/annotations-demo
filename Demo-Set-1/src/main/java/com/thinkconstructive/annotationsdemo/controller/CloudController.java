package com.thinkconstructive.annotationsdemo.controller;

import com.thinkconstructive.annotationsdemo.service.Cloud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demoCloud")
public class CloudController {

    @Autowired
    @Qualifier("amazonCloud")
    private Cloud cloud;

    @Value("${app.cloud.provider.name:Amazon Default}")
    private String cloudProvider;

    @Autowired
    public CloudController(Cloud cloud)
    {
        this.cloud = cloud;
    }

    public void getCloud()
    {
        System.out.println(" Cloud Provider = " + cloudProvider);
        cloud.getCloud();
    }
}
