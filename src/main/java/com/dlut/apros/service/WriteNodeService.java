package com.dlut.appros.service;

import com.digitalpetri.opcua.sdk.examples.client.ClientExampleRunner;
import com.digitalpetri.opcua.sdk.examples.client.ReadNodeExample;
import com.digitalpetri.opcua.sdk.examples.client.WriteNodeExample;

public class WriteNodeService {
    String endpointUrl;
    public WriteNodeService(String endpointUrl){
        this.endpointUrl=endpointUrl;
    }
    public String write(Integer ns,String s,Double num){
        WriteNodeExample example = new WriteNodeExample(num);
        String value = new ClientExampleRunner(this.endpointUrl, example, ns, s).run();
        return value;
    }
}
