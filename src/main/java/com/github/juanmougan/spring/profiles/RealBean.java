package com.github.juanmougan.spring.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("default")     // Without this, "main" would run, but "test" wouldn't
public class RealBean implements Bean {
    @Override
    public String sayMyName() {
        return "I'm the real bean!";
    }
}
