package com.instatenders.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@RestController
@RequestMapping("/test")
public class PlaceholderController {

    @ApiOperation(value = "test",
            notes = "API requests.",
            response = String.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "Request processed"),
            @ApiResponse(code = 401, message = "Unauthorized access"),
            @ApiResponse(code = 500, message = "Internal system error")
    })
    @RequestMapping(value = "/create", method = POST, consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<String> handleRequest(@RequestBody String requestBody) {
        return new ResponseEntity<>(OK);
    }
}
