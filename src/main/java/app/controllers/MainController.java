package app.controllers;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Log
@Controller
public class MainController {

    @GetMapping("/")
    public String mainMethod() {
        log.info("GET INDEX");
        return "static/index.html";
    }

}
