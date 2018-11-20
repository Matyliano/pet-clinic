package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/","index.html"}) //   jeśli przyjdzie request o te 3 rzeczy,. to wyswietli sie index
    public String index(){
        return "index";    //szuka template'u o tej nazwie
    }

}
