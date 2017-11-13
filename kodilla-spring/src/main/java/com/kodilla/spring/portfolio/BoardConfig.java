package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public Board getBoard() {
        return new Board(getDoList(), getDoList(), getInProgressList());

    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList getDoList() {
        return new TaskList();

    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        return new TaskList();

    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();

    }

}
