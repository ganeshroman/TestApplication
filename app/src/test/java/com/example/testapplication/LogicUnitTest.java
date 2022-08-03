package com.example.testapplication;

import com.example.testapplication.models.ConvertUtil;

import org.junit.Assert;
import org.junit.Test;

/**
 * Sample J Unit Test written
 *
 * @author Ganesh Roman
 * Created on 8/2/22.
 */
public class LogicUnitTest {
    @Test
    public void addition_isCorrect() {
        Assert.assertEquals(4, 2 + 2);
    }

    @Test
    public void conversion_isCorrect() {

        float input = 100.0f;
        float output;
        float expected = 212f;
        float delta = .1f;

        ConvertUtil convert = new ConvertUtil();
        output = convert.convertFarenheitToCelceius(input);
        Assert.assertEquals(expected, output, delta);

        // Assert.assertEquals(4, 2 + 2)
        // Assert.assertTrue( boolean condition);
        // Assert.assertFalse(boolean condition);
        // Assert.assertNull( object);
        // assertEquals("message failed", expected, actual, delta);


    }

}


