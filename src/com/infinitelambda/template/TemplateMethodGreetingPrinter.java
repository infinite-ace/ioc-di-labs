package com.infinitelambda.template;

public abstract class TemplateMethodGreetingPrinter {

    protected String stringToPrint;

    public void print() {
        System.out.println(stringToPrint);
    }
}
