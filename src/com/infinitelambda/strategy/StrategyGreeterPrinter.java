package com.infinitelambda.strategy;

import com.infinitelambda.base.GreeterPrinter;

import java.io.*;

public class StrategyGreeterPrinter implements GreeterPrinter {

    private final GreeterPrinterStrategy greeterPrinterStrategy;

    public StrategyGreeterPrinter(GreeterPrinterStrategy greeterPrinterStrategy) {
        this.greeterPrinterStrategy = greeterPrinterStrategy;
    }

    @Override
    public void printGreetingFromString(String greeting) {
        System.out.println(greeting);
    }

    @Override
    public void printGreetingFromFile(File file) throws IOException {
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String st;

        while ((st = br.readLine()) != null)
            System.out.println(st);
    }
}
