package com.example.restservice;

public class ConcatStrings {

    private final String string1;
    private final String string2;

    public ConcatStrings(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public String getConcat() {
        return string1+" "+string2;
    }

}