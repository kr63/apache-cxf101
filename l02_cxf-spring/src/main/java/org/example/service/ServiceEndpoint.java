package org.example.service;

import org.example.model.Student;

import javax.jws.WebService;

@WebService
public interface ServiceEndpoint {

    String hello(String name);

    String register(Student student);
}
