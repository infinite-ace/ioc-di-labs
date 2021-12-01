package com.infinitelambda.template;

import java.io.*;

public class TextFileGreeterPrinter extends TemplateMethodGreetingPrinter {

    @Override
    public void printGreeting(Object file) throws IOException {
        BufferedReader br
                = new BufferedReader(new FileReader((File) file));

        String st;

        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
