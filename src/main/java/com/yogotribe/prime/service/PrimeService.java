package com.yogotribe.prime.service;

import org.springframework.stereotype.Service;

@Service
public class PrimeService {

    // business logic to check the prime number
    public String checkPrimeNumber(int num){
        return isPrime(num);
    }

    static String isPrime(int n)
    {
        if (n <= 1)
            return String.format("\"%s\" is not a prime number", n);

        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return String.format("\"%s\" is not a prime number", n);

        return String.format("\"%s\" is a prime number", n);
    }
}
