package com.dlut.appros.controller;

import com.digitalpetri.opcua.sdk.examples.client.ClientExampleRunner;

import com.digitalpetri.opcua.sdk.examples.client.ReadNodeExample;
import com.dlut.appros.service.ReadNodeService;
import com.dlut.appros.service.WriteNodeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class WriteController {
    @Value("${endpointUrl}")
    String endpointUrl;

    @PostMapping("/write")

    public String test(@RequestParam("ns")Integer ns, @RequestParam("s")String s, @RequestParam("num")Double num){
        String value = new WriteNodeService(endpointUrl).write(ns, s,num);
        return value;
    }
}
