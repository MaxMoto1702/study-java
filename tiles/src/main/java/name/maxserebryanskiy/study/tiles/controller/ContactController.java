package name.maxserebryanskiy.study.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by m on 02.05.2015.
 */
@Controller
public class ContactController {

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String contacts() {
        return "contacts";
    }
}
