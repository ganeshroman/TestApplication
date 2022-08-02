package com.example.testapplication.models;

public class ConvertUtil {

    public float convertFarenheitToCelceius(float celsius) {
        float fahrenheit = 0;
        fahrenheit = ((celsius * 9) / 5) + 32;

        return fahrenheit;
    }
}
