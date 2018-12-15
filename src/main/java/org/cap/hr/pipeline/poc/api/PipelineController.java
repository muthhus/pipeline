package org.cap.hr.pipeline.poc.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PipelineController {

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("Pipeline", "Home");
        return "index";
    }
}
