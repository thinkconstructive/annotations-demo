package com.thinkconstructive.annotationsdemo.utility.value;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class ValueDemo {

    @Value("${server.port}")
    private int serverPort;

    @Value("${app.welcome.message}")
    private String welcomeMessage;

    @Value("${app.db.url}")
    private String dbUrl;

    @Value("${app.user.name}")
    private String userName;

    @Value("${app.user.email}")
    private String userEmail;
}
