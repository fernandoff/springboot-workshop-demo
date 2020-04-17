package com.educandoweb.course.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeResource {

    private String appVersion = "1.2";

    @RequestMapping(value = "/")
    public Map getStatus() {
        Map map = new HashMap<String, String>();
        map.put("appTitle", "Workshop Test - H2/Spring Boot ");
        map.put("appOrigin", "Udemy Java Completo 2020");
        map.put("appVersion", appVersion);
        return map;
    }
}
