package com.softtek.psg.services.restservices.restservices.manager;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PSGManagerImpl implements PSGManager{

    public String getPSG(){
        return "{\"Saludo\":\"Hola Mundo\"}";
    }

}