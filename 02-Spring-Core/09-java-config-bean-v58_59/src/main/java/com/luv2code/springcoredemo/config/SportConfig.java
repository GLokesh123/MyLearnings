package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.coachUtil.Coach;
import com.luv2code.springcoredemo.coachUtil.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquaMan")
    public Coach swimCoach()
    {
        return new SwimCoach();
    }
}
