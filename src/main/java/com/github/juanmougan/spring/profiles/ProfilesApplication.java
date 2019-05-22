package com.github.juanmougan.spring.profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication {

    private static Bean bean;

    public static void main(String[] args) {
        SpringApplication.run(ProfilesApplication.class, args);
        System.out.println(bean.sayMyName());
    }

    // It looks like I have to wire the bean in the setter
    @Autowired
    public void setBean(Bean bean) {
        ProfilesApplication.bean = bean;
    }

}
