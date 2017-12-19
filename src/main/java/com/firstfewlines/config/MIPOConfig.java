package com.firstfewlines.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MIPOConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/user").setViewName("user");
        registry.addViewController("/").setViewName("user");
        registry.addViewController("/userHome").setViewName("userHome");
        registry.addViewController("/find").setViewName("find");
        registry.addViewController("/contribute").setViewName("contribute");
        registry.addViewController("/contribute/contribute").setViewName("contribute");
        registry.addViewController("/questions").setViewName("questions");
        registry.addViewController("/questions/questions").setViewName("questions");
    }
}
