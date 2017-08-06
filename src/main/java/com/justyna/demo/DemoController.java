package com.justyna.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

/**
 * Created by jpokr on 2017-07-26.
 */
@Controller
public class DemoController {

    @Autowired
    private DataValidator dataValidator;

    // @Autowired
    // private DemoService demoService;

    // @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    // @ResponseBody
    // public String hello(@PathVariable("name") String name) {
    //   return "twoje imie to: " + name;

    // public ResponseEntity<String> hello() {
    //    ResponseEntity<String> response = new ResponseEntity(demoService.greetings(), HttpStatus.OK);
    //    return response;
    // }


//@GetMapping ("/{name}")
//@ResponseBody
//public String getName(@PathVariable String name) {
    //return name;

    @GetMapping(value = "/hello")
    @ResponseBody
    public String getData(@RequestParam String name, @RequestParam String surname, @RequestParam int number) {
        dataValidator.checkName(name);
        return name + " " +surname +" " + number;
    }



}




