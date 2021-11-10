package ru.ibs.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

public class DieselEngineImpl implements Engine {
    @Autowired
    public DieselEngineImpl() {
    }

    @Override
    public String powerUp() {
        return "On diesel";
    }
}
