package com.github.juanmougan.spring.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestBean implements Bean {
    @Override
    public String sayMyName() {
        return "I'm just a test bean :(";
    }
}
