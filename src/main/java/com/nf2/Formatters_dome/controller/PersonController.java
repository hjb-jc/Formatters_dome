package com.nf2.Formatters_dome.controller;

import com.nf2.Formatters_dome.formatter.PersonFromId;
import com.nf2.Formatters_dome.formatter.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/ddd")
@RestController
public class PersonController {
    @RequestMapping(method = RequestMethod.GET)
    public Person home(@RequestParam(value = "id", required = false) @PersonFromId Person person) {
        return person;
    }
}