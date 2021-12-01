package com.example.restservice;

public class StringsToConcatRequest {

    private final String string1;
    private final String string2;

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public StringsToConcatRequest(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }
}