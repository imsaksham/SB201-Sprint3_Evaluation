package com.masai.Services;


import org.springframework.stereotype.Service;

@Service
public class TwitterService implements MessageService {


    @Override
    public void sendMessage(String message) {
        System.out.println("Twitter Message "+message);
    }
}
