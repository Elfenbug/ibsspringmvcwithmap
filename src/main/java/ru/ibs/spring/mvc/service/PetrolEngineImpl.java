package ru.ibs.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;

public class PetrolEngineImpl implements Engine {
    @Autowired
    public PetrolEngineImpl() {
    }

    @Override
    public String powerUp() {
        return "On petrol";
    }
}
