package com.infinitelambda;

import com.infinitelambda.template.StringGreeterPrinter;
import com.infinitelambda.template.TemplateMethodGreetingPrinter;
import com.infinitelambda.template.TextFileGreeterPrinter;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        final TemplateMethodGreetingPrinter stringGreeterPrinter =
                new StringGreeterPrinter("Hello there! We're showing an example with passing a string.");
        stringGreeterPrinter.print();

        String directory = "/Users/ace_dev/Documents/InfiniteLambda/IoC-DependencyManagement/LabSolutions/src/greeting-file.txt";
        final File file = new File(directory);
        final TemplateMethodGreetingPrinter fileGreeterPrinter = new TextFileGreeterPrinter(file);
        fileGreeterPrinter.print();
    }
}
