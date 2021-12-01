package com.infinitelambda;

import com.infinitelambda.template.StringGreeterPrinter;
import com.infinitelambda.template.TemplateMethodGreetingPrinter;
import com.infinitelambda.template.TextFileGreeterPrinter;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final TemplateMethodGreetingPrinter stringGreeterPrinter = new StringGreeterPrinter();
        final String greet = "Hello there! We're showing an example with passing a string.";

        stringGreeterPrinter.printGreeting(greet);

        final TemplateMethodGreetingPrinter fileGreeterPrinter = new TextFileGreeterPrinter();
        final File file = new File("/Users/ace_dev/Documents/InfiniteLambda/IoC-DependencyManagement/LabSolutions/src/greeting-file.txt");

        fileGreeterPrinter.printGreeting(file);
    }
}
