package org.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @GetMapping(value = "/")
    public String index() {
        return "<h2>Hello</h2>\n" +
                "Check our stylists: <a href=\"/getClients\">clients</a><br>\n" +
                "Check our clients: <a href=\"/getMasters\">masters</a><br>";
    }
}
