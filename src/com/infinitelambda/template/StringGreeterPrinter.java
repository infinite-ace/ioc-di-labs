package com.infinitelambda.template;

public class StringGreeterPrinter extends TemplateMethodGreetingPrinter {

    @Override
    public void printGreeting(Object input) {
        System.out.println(input);
    }
}
