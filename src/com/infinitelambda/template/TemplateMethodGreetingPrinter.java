package com.infinitelambda.template;

public abstract class TemplateMethodGreetingPrinter {

    String stringToPrint;

    public void print() {
        System.out.println(stringToPrint);
    }
}
