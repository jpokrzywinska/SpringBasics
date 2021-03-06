package com.justyna.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jpokr on 2017-07-26.
 */
@Controller
public class DemoController {

    @Autowired
    private DataValidator dataValidator;
    @Autowired
    private FibonacciSequenceService fibonacciSequenceService;


    @GetMapping(value = "/hello")
    @ResponseBody
    public String getData(@RequestParam String name, @RequestParam String surname, @RequestParam int number) {
        dataValidator.checkName(name);
        return name + " " + surname + " " + number;
    }

    @GetMapping(value = "/fibonacci/{number}")
    @ResponseBody
    public String computeFibonacciNumber(@PathVariable("number") int number) {
        return number + " element ciagu Fibonacciego to: " + fibonacciSequenceService.computeFibonacciNumberIterative(number);
    }


}




