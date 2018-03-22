package com.softtek.psg.services.restservices.restservices.controller;


import com.softtek.psg.services.restservices.restservices.manager.PSGManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping (value="/v1/psg", produces="application/json;charset=UTF-8")
public class PSGController {

    private PSGManager psgManager;

    @Autowired
    public void setPsgManager(PSGManager psgManager) {
        this.psgManager = psgManager;
    }

    @RequestMapping (value="/get", method= RequestMethod.GET)
    public @ResponseBody String getPSG(){

        return psgManager.getPSG();
    }

}
