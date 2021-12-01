package com.example.restservice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/homework")
    public ConcatStringResponse concatStrings(@RequestBody StringsToConcatRequest stringsToConcat){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb
                .append(stringsToConcat.getString1())
                .append(" ")
                .append(stringsToConcat.getString2());
        return new ConcatStringResponse(sb.toString(), simpleDateFormat.format(new Date()));
    }


}