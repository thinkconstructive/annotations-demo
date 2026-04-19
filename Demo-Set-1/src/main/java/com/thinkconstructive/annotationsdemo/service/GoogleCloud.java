package com.thinkconstructive.annotationsdemo.service;

public class GoogleCloud implements Cloud {

    @Override
    public void getCloud()
    {
        System.out.println("Google Cloud Provider got invoked");
    }
}
