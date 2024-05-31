package com.example.server;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.server.genereted.GetGreetingRequest;
import com.example.server.genereted.GetGreetingResponse;


@Endpoint
public class GreetingEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/greeting";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getGreetingRequest")
    @ResponsePayload
    public GetGreetingResponse getGreeting(@RequestPayload GetGreetingRequest request) {
        GetGreetingResponse response = new GetGreetingResponse();
        String name = request.getName();

       

        response.setGreeting("Hello, " + name + "!");
        return response;
    }
}
