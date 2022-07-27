package com.example.slackbot.vote.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VoteController {

    @GetMapping("/ping")
    public String pingCheck(){
        return "pong";
    }
}
