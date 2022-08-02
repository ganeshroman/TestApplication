package com.example.testapplication

import com.example.testapplication.models.ConvertUtil
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }


    @Test
    fun conversion_isCorrect() {

        var input = 200.0f;
        var output: Float;
        var expected = 212f;
        var delta = .1f;

        var convert = ConvertUtil();
        output = convert.convertFarenheitToCelceius(input);
        assertEquals(expected, output, delta);


        //assertEquals(4, 2 + 2)
    }
}