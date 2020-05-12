package com.segmentfault.segmentfault.client;

import com.segmentfault.segmentfault.controller.User;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

public class RestClient {
    public static void main(String[] args) {

        HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
        HttpClient httpClient = httpClientBuilder.build();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
        RestTemplate restTemplate = new RestTemplate(factory);
        //String content = restTemplate.getForObject("http://localhost:8080/json/user",String.class);
        //User content = restTemplate.getForObject("http://localhost:8080/json/user",User.class);
        User content = restTemplate.getForObject("http://localhost:8080/xml/user",User.class);
        System.out.println(content);
    }
}
