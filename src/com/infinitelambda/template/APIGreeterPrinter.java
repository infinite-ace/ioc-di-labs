package com.infinitelambda.template;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APIGreeterPrinter extends TemplateMethodGreetingPrinter {

    public APIGreeterPrinter(String apiUrl) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

        this.stringToPrint = response.body().toString();
    }
}
