package com.example.refselect.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class RefSelectRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void load_returnsJsonPayload() throws Exception {
        mockMvc.perform(post("/purchase/event_entry/event_info/ajax/ref_select_load")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"kindRef\":1}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.rgonInfoDto").isArray())
                .andExpect(jsonPath("$.refSelectHTML").isString());
    }
}
