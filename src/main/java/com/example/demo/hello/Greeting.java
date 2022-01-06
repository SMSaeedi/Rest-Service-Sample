package com.example.demo.hello;

/**
 * Created by saeedi_m on 14/08/19.
 */
public class Greeting {
    private final long id;
    private final String givenName;
    private final String age;
    private final String location;

    public Greeting(long id, String givenName, String location, String  age) {
        this.id = id;
        this.givenName = givenName;
        this.location = location;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getGivenName() {
        return givenName;
    }

    public String  getAge() {
        return age;
    }
}