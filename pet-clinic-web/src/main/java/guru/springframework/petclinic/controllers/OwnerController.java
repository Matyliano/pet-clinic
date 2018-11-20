package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners") //jezeli tu wpiszemy owners, to mozemy go wywalic z requestMapping z metody.to jest jakby prefix
@Controller
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"}) //musi być pusty string pierwszy
    public String listOwners(){
        return "owners/index";
    }


}
