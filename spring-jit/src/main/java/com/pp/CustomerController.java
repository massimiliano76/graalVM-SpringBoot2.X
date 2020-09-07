package com.pp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/customer")
public class CustomerController {

    @GetMapping(value = "/" , produces = "text/plains")
    public String getCustomer() {
        return "Example Response for customers from Java - SpringBoot";
    }

}
