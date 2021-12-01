package com.infinitelambda.template;

import java.io.*;

public class TextFileGreeterPrinter extends TemplateMethodGreetingPrinter {

    public TextFileGreeterPrinter(File file)  throws IOException {
        BufferedReader br
                = new BufferedReader(new FileReader((File) file));

        String st;

        while ((st = br.readLine()) != null)
            // It will only append the first line of the file
            this.stringToPrint = st;
    }
}
