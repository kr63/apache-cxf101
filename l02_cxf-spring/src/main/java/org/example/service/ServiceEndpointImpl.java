package org.example.service;

import org.example.model.Student;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.service.ServiceEndpoint")
public class ServiceEndpointImpl implements ServiceEndpoint {

    private int counter;

    @Override
    public String hello(String name) {
        return "Hello" + name + "!";
    }

    @Override
    public String register(Student student) {
        counter++;
        return student.getName() + " is registered student number " + counter;
    }
}
