package com.hm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.hm.*"})
public class BookmarkSSO {
    public static void main(String[] args) {
        SpringApplication.run(BookmarkSSO.class,args);
    }
}
