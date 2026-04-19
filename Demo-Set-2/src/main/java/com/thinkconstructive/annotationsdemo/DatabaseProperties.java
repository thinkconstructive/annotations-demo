package com.thinkconstructive.annotationsdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "db.connection")
public record DatabaseProperties(
        String url,
        String username,
        String password,
        int poolSize
) {
}
