package com.firstfewlines.controller;

import com.firstfewlines.domain.Answer;
import com.firstfewlines.domain.User;
import com.firstfewlines.repository.UserRepository;
import com.firstfewlines.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


@Controller
@RequestMapping("/")
class UserController {
    final static DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    String home() {
        return "user";
    }


    @RequestMapping(value = "user", method = RequestMethod.POST, consumes = MediaType.ALL_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    ModelAndView addStudent(@RequestParam Integer rollNo,
                            @RequestParam String name,
                            @RequestParam String dateOfBirth ) throws Exception {

        ModelAndView modelAndView = new ModelAndView("user");
        try {
            User user = new User();
            user.setRollNo(rollNo);
            user.setName(name);
            user.setDateOfBirth(df.parse(dateOfBirth));
            user = userService.addUser(user);
            modelAndView.addObject("message", "User added with name: " + user.getName());
        }
        catch (Exception ex){
            modelAndView.addObject("message", "Failed to add user: " + ex.getMessage());
        }
        modelAndView.addObject("users", userService.getUsers());
        return modelAndView;
    }

    @RequestMapping(value="index")
    public String showIndex(ModelMap model){
        return "index";
    }

    @RequestMapping(value="userHome")
    public String showUserHomePage(@RequestParam (value = "name", required = false, defaultValue = "World") String name, ModelMap model){
        model.addAttribute("name", name);
        return "userHome";
    }

    @RequestMapping(value="aboutMIPO")
    public String showAboutMIPO(ModelMap model){
        return "aboutMIPO";
    }

    @RequestMapping(value="find")
    public String showFind(ModelMap model){
        return "find";
    }


}
