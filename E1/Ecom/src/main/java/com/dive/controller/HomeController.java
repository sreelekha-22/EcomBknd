package com.dive.controller;

@RestController
public class HomeController {

    @GetMapping("/")
    public ApiResponse HomeControllerHandler(){
        ApiResponse apiResponse =new ApiResponse();
        apiResponse.setMessage("Welcome to ecommerce");
        return apiResponse;
    }
    
}