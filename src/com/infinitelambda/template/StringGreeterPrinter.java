package com.infinitelambda.template;

public class StringGreeterPrinter extends TemplateMethodGreetingPrinter {

    public StringGreeterPrinter(String greeting) {
        this.stringToPrint = greeting;
    }
}
