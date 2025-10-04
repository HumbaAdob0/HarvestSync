package main.harvestsync;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login_Page_Controller {

    @PostMapping("/login")
    public String login(@RequestParam String email,@RequestParam String password){
        System.out.println("Processing\n");
        if(email.equals("remegiajonrheym0911@gmail.com") && password.equals("12345")){
            return "success";
        }
        else{
            return "fail";
        }
    }
}
