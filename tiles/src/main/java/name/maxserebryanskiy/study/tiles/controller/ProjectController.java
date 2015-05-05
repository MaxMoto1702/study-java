package name.maxserebryanskiy.study.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by m on 02.05.2015.
 */
@Controller
public class ProjectController {

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public String projects() {
        return "projects";
    }
}
