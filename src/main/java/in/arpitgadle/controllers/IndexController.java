package in.arpitgadle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String handleIndexRequest()
    {
        return "This application is demonstrating spring jwt";
    }
}
