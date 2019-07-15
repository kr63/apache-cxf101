package org.example.client;

import com.codenotfound.services.helloworld.HelloWorldPortType;
import com.codenotfound.types.helloworld.Greeting;
import com.codenotfound.types.helloworld.ObjectFactory;
import com.codenotfound.types.helloworld.Person;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldClient {

    private final HelloWorldPortType helloWorldPortType;

    public HelloWorldClient(HelloWorldPortType helloWorldPortType) {
        this.helloWorldPortType = helloWorldPortType;
    }

    public String sayHello(String firstName, String lastName) {
        ObjectFactory factory = new ObjectFactory();

        Person person = factory.createPerson();
        person.setFirstName(firstName);
        person.setLastName(lastName);

        Greeting response = helloWorldPortType.sayHello(person);
        return response.getGreeting();
    }
}
