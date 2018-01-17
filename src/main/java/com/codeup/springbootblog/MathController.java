package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MathController {

    @RequestMapping (path = "/add/{number}/and/{num}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number, @PathVariable int num) {
        return number + " plus " + num + " is " + (number + num) + "!";
    }

}