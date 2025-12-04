package main.harvestsync;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Page_get_controller {
    @GetMapping("/login")
    public String page_get_controller() {
        return "login_page.html";
    }
}
