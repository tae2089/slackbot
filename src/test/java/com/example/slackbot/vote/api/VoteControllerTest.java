package com.example.slackbot.vote.api;


import com.example.slackbot.BaseController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

class VoteControllerTest extends BaseController {

    @BeforeEach
    void setup() {
        this.setUp();
    }
    
    @Test
    void aaa() throws Exception {
        this.mockMvc.perform(get("/ping"))
                .andDo(print())
                .andExpect(status().isOk());
    }
}
