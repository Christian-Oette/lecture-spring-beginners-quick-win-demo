package com.example.quickwindemo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class MyFirstService {

    public MyFirstService() {
        System.out.println("MyFirstService constructor called");
    }

    @EventListener(classes = ApplicationReadyEvent.class)
    public void init(){
        System.out.println("MyFirstApplication is ready. Application has been started");
    }
}
