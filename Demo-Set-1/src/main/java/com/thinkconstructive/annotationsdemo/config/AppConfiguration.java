package com.thinkconstructive.annotationsdemo.config;

import com.thinkconstructive.annotationsdemo.service.Cloud;
import com.thinkconstructive.annotationsdemo.service.GoogleCloud;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources({
        @PropertySource("classpath:config.properties"),
        @PropertySource("classpath:config1.properties"),
        @PropertySource("classpath:config2.properties"),
        @PropertySource(value="classpath:config3.properties", ignoreResourceNotFound=true)
})
public class AppConfiguration {
}
