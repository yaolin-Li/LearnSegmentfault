package com.segmentfault.segmentfault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.segmentfault.segmentfault.servlet")
public class SegmentfaultApplication {

    public static void main(String[] args) {
        SpringApplication.run(SegmentfaultApplication.class, args);
    }

}
