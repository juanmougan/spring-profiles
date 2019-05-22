package com.github.juanmougan.spring.profiles;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanClient {

    @Autowired
    private Bean bean;

    public void useBean() {
        System.out.println(bean.sayMyName());
    }
}
