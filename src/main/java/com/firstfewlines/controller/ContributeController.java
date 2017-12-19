package com.firstfewlines.controller;

import com.firstfewlines.service.ContributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/contribute")
class ContributeController {

    @Autowired
    private ContributeService contributeService;


    @RequestMapping(method = RequestMethod.GET)
    public String contribute() {
        return "contribute";
    }

    @RequestMapping(value = "contribute", consumes = MediaType.ALL_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public ModelAndView showOrganisms() throws Exception {

        ModelAndView modelAndView = new ModelAndView("contribute");

        modelAndView.addObject("organisms", contributeService.getOrganisms());
        return modelAndView;
    }

}
