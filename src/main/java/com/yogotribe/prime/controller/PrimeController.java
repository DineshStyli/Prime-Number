package com.yogotribe.prime.controller;

import com.yogotribe.prime.service.PrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/prime")
public class PrimeController {

    @Autowired
    private PrimeService service;

    // takes the input and returns string stating whether the input is prime or not
    @GetMapping("/checkPrime")
    public ResponseEntity<String> checkPrimeNumber(@RequestParam int num){
        try {
            String res = service.checkPrimeNumber(num);
            return new ResponseEntity<>(res, HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
