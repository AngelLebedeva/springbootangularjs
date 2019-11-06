package com.startspring.springbootangularjs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * We mark our class with the Controller annotation, do not need to write in XML, its name, where to map
 */
@Controller
public class MainController {

    /**
     * The method annotation displays a specific request path or template on the controller.
     * @return returns the page interface, file index.html
     */
    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
