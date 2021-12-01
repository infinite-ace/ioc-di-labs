package com.infinitelambda.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface GreeterPrinter {
    void printGreetingFromString(String greeting);
    void printGreetingFromFile(File file) throws IOException;
}
