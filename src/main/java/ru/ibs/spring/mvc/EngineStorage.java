package ru.ibs.spring.mvc;

import org.springframework.stereotype.Component;
import ru.ibs.spring.mvc.service.DieselEngineImpl;
import ru.ibs.spring.mvc.service.Engine;
import ru.ibs.spring.mvc.service.PetrolEngineImpl;

import java.util.HashMap;
import java.util.Map;

@Component
public class EngineStorage {
    private static Map<String, Engine> engineMap;

    public EngineStorage() {
        engineMap = new HashMap<>();
        engineMap.put("petrol", new PetrolEngineImpl());
        engineMap.put("diesel", new DieselEngineImpl());
    }

    public Engine getEngine(String type) throws Exception {
        Engine engine = engineMap.get(type);
        if (engineMap.containsKey(type)) {
            return engine;
        } else {
            throw new Exception();
        }
    }
}
