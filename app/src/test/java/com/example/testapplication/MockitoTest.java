package com.example.testapplication;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.example.testapplication.models.MyClass;
import com.example.testapplication.models.MyDatabase;
import com.example.testapplication.models.Todo;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Iterator;


/**
 * Mockito Test cases
 *
 * @author Ganesh Roman
 * Created on 8/2/22.
 */
public class MockitoTest {

    @Mock
    MyDatabase databaseMock; // (1)

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule(); // (2)

    /*@Test
    public void testQuery()  {
        ClassToTest t  = new ClassToTest(databaseMock); // (3)
        boolean check = t.query("* from t"); // (4)
        Assert.assertTrue(check); // (5)
        verify(databaseMock).query("* from t"); // (6)
    }*/


    @Test
    public void test1() {
        MyClass test = mock(MyClass.class);
        // (Set Mock values) define return value for method getUniqueId()
        when(test.getUniqueId()).thenReturn(43);

        //Assert.assertEquals(test.getUniqueId(), 43); // pass
        Assert.assertEquals(test.getUniqueId(), 44); // fail

    }


    // Demonstrates the return of multiple values
    @Test
    public void testMoreThanOneReturnValue() {
        Iterator i = mock(Iterator.class);
        when(i.next()).thenReturn("Mockito").thenReturn("rocks");
        String result = i.next() + " " + i.next();

        //Assert.assertEquals("Mockito rocks", result);
        Assert.assertEquals("Mockito rocking", result); // fail


    }

    // this test demonstrates how to return values based on the input
    @Test
    public void testReturnValueDependentOnMethodParameter() {
        Comparable c = mock(Comparable.class);
        when(c.compareTo("Mockito")).thenReturn(1);
        when(c.compareTo("Eclipse")).thenReturn(2);
        //assert
        //Assert.assertEquals(1,c.compareTo("Mockito")); // pass
        Assert.assertEquals(1, c.compareTo("Eclipse")); // failed
    }


    // this test demonstrates how to return values independent of the input value
    @Test
    public void testReturnValueInDependentOnMethodParameter() {
        Comparable c = mock(Comparable.class);
        when(c.compareTo(anyInt())).thenReturn(-1);
        //assert
        //Assert.assertEquals(-1 ,c.compareTo(9)); // pass
        Assert.assertEquals(-1, c.compareTo(9.2)); // fail

    }


    // return a value based on the type of the provide parameter
    @Test
    public void testReturnValueInDependentOnMethodParameter2() {
        Comparable c = mock(Comparable.class);
        when(c.compareTo(isA(Todo.class))).thenReturn(0);
        //assert
        Todo todo = new Todo(5);
        //Assert.assertEquals(todo ,c.compareTo(new Todo(1))); // failed

        Assert.assertEquals(0, c.compareTo(new Todo(1))); // passed

    }


    @Test
    public void testVerify() {
        // create and configure mock
        MyClass test = Mockito.mock(MyClass.class);
        when(test.getUniqueId()).thenReturn(43);


        // call method testing on the mock with parameter 12
        test.testing(12);
        test.getUniqueId();
        test.getUniqueId();


        // now check if method testing was called with the parameter 12
        //verify(test).testing(Matchers.eq(12)); // pass
        verify(test).testing(Matchers.eq(13)); // failed

        // was the method called twice?
        verify(test, times(2)).getUniqueId();
        //verify(test, times(3)).getUniqueId(); // fail

        // other alternatives for verifiying the number of method calls for a method
        /*verify(test, never()).someMethod("never called");
        verify(test, atLeastOnce()).someMethod("called at least once");
        verify(test, atLeast(2)).someMethod("called at least twice");
        verify(test, times(5)).someMethod("called five times");
        verify(test, atMost(3)).someMethod("called at most 3 times");*/
    }


}
