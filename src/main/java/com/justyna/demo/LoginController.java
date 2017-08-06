package com.justyna.demo;

/**
 * Created by jpokr on 2017-07-29.
 *
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @RequestMapping (value="/login", method = RequestMethod.GET)
    @ResponseBody
            public int login(){
    ResponseEntity<String> response = new ResponseEntity("hello", HttpStatus.OK);
        return 52;

}}
