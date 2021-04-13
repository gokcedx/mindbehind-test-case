package com.gokcedx.mindbehind.testcase.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gökçe DOĞANAY
 * @since 1.0.0
 */
@RestController
public class CommentsController {

    @GetMapping("/getComments")
    public String getComments(){
        return null;
    }
}
