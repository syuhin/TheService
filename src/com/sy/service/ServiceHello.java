package com.sy.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService
public class ServiceHello {

    public String getValue(String name) {
        return "我叫"+name;
    }

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9001/Service/ServiceHello",new ServiceHello());
        System.out.println("service success!");

    }
}
