package com.dlut.appros.service;

import com.digitalpetri.opcua.sdk.examples.client.ClientExampleRunner;
import com.digitalpetri.opcua.sdk.examples.client.ReadNodeExample;
import org.springframework.beans.factory.annotation.Value;

public class ReadNodeService {
    String endpointUrl;
    public ReadNodeService(String endpointUrl){
        this.endpointUrl=endpointUrl;
    }
    public String read(Integer ns,String s){
        ReadNodeExample example = new ReadNodeExample();
        String value = new ClientExampleRunner(this.endpointUrl, example, ns, s).run();
        return value;
    }
}
