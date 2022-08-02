package com.example.testapplication;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Logical J Unit Test Case Runner
 *
 * @author Ganesh Roman
 * Created on 8/2/22.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        ExampleUnitTest.class,
        LogicUnitTest.class, MockitoTest.class, MockitoTestsContains.class})
public class LogicalUnitTestRunner {

    /*public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ExampleUnitTest.class
                , LogicUnitTest.class, MockitoTest.class, MockitoTestsContains.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }*/


}
