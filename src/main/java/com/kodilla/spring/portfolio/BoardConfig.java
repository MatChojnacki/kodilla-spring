package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board(taskList(), taskList(), taskList());
    }

    @Scope ("prototype")
    @Bean
    public TaskList taskList() {
        return new TaskList();
    }

}
