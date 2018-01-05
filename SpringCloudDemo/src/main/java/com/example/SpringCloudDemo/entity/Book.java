package com.example.SpringCloudDemo.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by qutf on 2018/1/3.
 */
@Component
public class Book {
    @Value("${book.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
