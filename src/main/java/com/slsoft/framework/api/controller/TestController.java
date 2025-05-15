package com.slsoft.framework.api.controller;

import com.slsoft.framework.api.common.ApiResponse;
import com.slsoft.framework.api.model.Server;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/test")
    public ApiResponse<Server> test() {
        Server data = new Server("framework api server", "192.168.0.102");
        System.out.printf(data.toString());
        return ApiResponse.success(data);
    }

}
