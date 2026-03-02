package com.example.refselect.controller;

import com.example.refselect.dto.LoadOutDto;
import com.example.refselect.dto.RefLoadFormDto;
import com.example.refselect.service.RefSelectService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase/event_entry/event_info/ajax")
public class RefSelectRestController {
    private final RefSelectService refSelectService;

    public RefSelectRestController(RefSelectService refSelectService) {
        this.refSelectService = refSelectService;
    }

    @PostMapping(value = "/ref_select_load", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public LoadOutDto load(@RequestBody(required = false) RefLoadFormDto form) {
        return refSelectService.loadRefSelect(form);
    }
}
