package com.sy.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class XmlService {
    @WebMethod
    public String getValue(String name) {
        return "我叫"+name;
    }

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:9001/app/demo/testRpc",new XmlService());
        System.out.println("XmlService success!");

    }
}
