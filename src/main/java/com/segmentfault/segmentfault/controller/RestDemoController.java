package com.segmentfault.segmentfault.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
//@Controller
public class RestDemoController {

    //HTML
    //@RequestMapping(value = {"/html/demo1","/html/demo2"},method = {RequestMethod.POST})
    @GetMapping(path = {"/html/demo"})
    //@PostMapping(path = {"/html/demo4"})
    //@ResponseBody
    public String htmlCode() {
        return "<html><body>Heloo</body><html>";
    }

    @GetMapping(path = "/html/demo/{message}")
    public String htmlCode(@PathVariable String message) {

        return  "<html><body>Hello"+message+"</body><html>";
    }

    @GetMapping(path = "/html/demo/param")
    public String htmlparam(@RequestParam(value = "p",required = false,defaultValue = "empty") String param,
                            HttpServletRequest request) {
        String param2 = request.getParameter("param2");

        return  "<html><body>param:"+param+",param2:"+param2+"</body><html>";
    }

    @GetMapping(path = "/html/demo/header")
    public String htmlHeader(@RequestHeader(value = "Accept") String acceptHeader) {

        return  "<html><body>acceptHeader:"+acceptHeader+"</body><html>";
    }

    @GetMapping(path = "/html/demo/response/entity")
    public ResponseEntity htmlResponseEntity() {

        return  ResponseEntity.ok("<html><body>htmlResponseEntity</body><html>");
    }
}
