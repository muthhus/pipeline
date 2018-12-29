package org.cap.hr.pipeline.poc.api;

import org.apache.log4j.Logger;
import org.cap.hr.pipeline.poc.model.User;
import org.cap.hr.pipeline.poc.service.UserService;
import org.cap.hr.pipeline.poc.vo.UserVO;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class PipelineController {

    private static Logger logger = Logger.getLogger(PipelineController.class);

    private UserService userService;

    @Autowired
    public PipelineController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("Pipeline", "Thanks for attending this meeting  and much appreciated!");
        return "index";
    }

    @PostMapping(path="/users", consumes = "application/json", produces = "application/json")
    public User createUser(@RequestBody UserVO userVO) throws Exception {
        logger.info(userVO);
        return userService.userSave(userVO);
    }

}
