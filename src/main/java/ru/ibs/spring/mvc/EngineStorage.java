package ru.ibs.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.ibs.spring.mvc.service.DieselEngineImpl;
import ru.ibs.spring.mvc.service.Engine;
import ru.ibs.spring.mvc.service.PetrolEngineImpl;

import java.util.HashMap;
import java.util.Map;

@Component
public class EngineStorage {
    PetrolEngineImpl petrolEngine;
    DieselEngineImpl dieselEngine;
    private static Map<String, Engine> engineMap;

    @Autowired
    public EngineStorage(PetrolEngineImpl petrolEngine, DieselEngineImpl dieselEngine) {
        this.petrolEngine = petrolEngine;
        this.dieselEngine = dieselEngine;
        engineMap = new HashMap<>();
        engineMap.put("petrol", petrolEngine);
        engineMap.put("diesel", dieselEngine);
    }

    public static Engine getEngine(String type) throws Exception {
        Engine engine = engineMap.get(type);
        if (engineMap.containsKey(type)) {
            return engine;
        } else {
            throw new Exception();
        }
    }
}
