package com.employee.svc;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Silas
 */
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
