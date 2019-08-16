package com.dlut.appros.controller;

import com.digitalpetri.opcua.sdk.examples.client.ClientExampleRunner;

import com.digitalpetri.opcua.sdk.examples.client.ReadNodeExample;
import com.dlut.appros.service.ReadNodeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReadController {
    @Value("${endpointUrl}")
    String endpointUrl;

    @PostMapping("/read")

    public String test(@RequestParam("ns")Integer ns,@RequestParam("s")String s){
        String value = new ReadNodeService(endpointUrl).read(ns, s);
        return value;
    }
}
