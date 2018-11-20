package guru.springframework.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listVets(){

        return "vets/index";  //odnosi się do naszego templates
    }
//czyli, jeżeli ktoś wpisze w localhoscie vets, vets/index itd. to sięto zawsze odniesie do template'u

}
