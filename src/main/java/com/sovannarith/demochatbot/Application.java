package com.sovannarith.demochatbot;

import com.sovannarith.demochatbot.model.Constants;
import com.sovannarith.demochatbot.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URISyntaxException;

@SpringBootApplication
public class Application {

    static  AlertService alertService = new AlertService();

    public static void main(String[] args) throws URISyntaxException {
        alertService.post(Constants.BOT_URL, "Good Bye");
        SpringApplication.run(Application.class, args);
    }

}
