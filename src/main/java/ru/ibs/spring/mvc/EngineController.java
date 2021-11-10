package ru.ibs.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")

public class EngineController {

    @GetMapping("check")
    public String add() {
        return "check";
    }

    @PostMapping("check")
    @FuelExceptionHandle
    public String postAdd(@RequestParam("type") String type, Model model) throws Exception {
        model.addAttribute("addedText", EngineStorage.getEngine(type).powerUp());
        return "show";
    }
}

