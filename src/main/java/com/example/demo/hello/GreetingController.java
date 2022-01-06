package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by saeedi_m on 14/08/19.
 */
@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "Mahiii") String name,
                             @RequestParam(value = "address", defaultValue = "Galaxy far far away") String location,
                             @RequestParam(value = "age", defaultValue = "28") String age) {
        return new Greeting(counter.incrementAndGet(),
                String.format(name),
                String.format(location),
                String.format(age));
    }
}