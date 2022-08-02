package com.example.testapplication;


import com.example.testapplication.mockitocontext.TextIntentCreation;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ExampleInstrumentedTest.class,
        TextIntentCreation.class})
public class InstrumentationTestRunner {

    /*public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ExampleUnitTest.class
                );
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }*/


}
