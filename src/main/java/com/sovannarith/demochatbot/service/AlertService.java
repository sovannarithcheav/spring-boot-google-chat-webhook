package com.sovannarith.demochatbot.service;

import org.json.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class AlertService {

    public String post(String url, String text) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        JSONObject request = new JSONObject();
        request.put("text", text);
        URI uri = new URI(url);
        return restTemplate.postForObject(uri, request.toString(), String.class);
    }

}
