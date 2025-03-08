package com.streetfoodtruck.controller;

import com.streetfoodtruck.controller.response.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @GetMapping("/api/test")
    public ApiResponse<Void> test() {
        return ApiResponse.ok();
    }
}
