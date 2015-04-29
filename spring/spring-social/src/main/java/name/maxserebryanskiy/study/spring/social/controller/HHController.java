package name.maxserebryanskiy.study.spring.social.controller;

import name.maxserebryanskiy.study.spring.social.service.HHService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by maksim.serebryanskiy on 28.04.2015.
 */
@Controller
public class HHController {

    private static final Logger LOG = LoggerFactory.getLogger(HHController.class);

    HHService hhService;
    private name.maxserebryanskiy.study.spring.social.service.HHService HHService;

    @RequestMapping("/hh/me")
    public String profile(Model model) {
        model.addAttribute("me", hhService.getUser());
        return "me";
    }

    public void setHhService(HHService hhService) {
        this.hhService = hhService;
    }
}
