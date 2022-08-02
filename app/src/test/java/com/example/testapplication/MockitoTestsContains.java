package com.example.testapplication;

import static org.junit.matchers.JUnitMatchers.hasItem;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Arrays;
import java.util.List;

/*public class MockitoTestsContains {
}*/
public class MockitoTestsContains {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Captor
    private ArgumentCaptor<List<String>> captor;


    @Test
    public final void shouldContainCertainListItem() {
        List<String> asList = Arrays.asList("someElement_test", "someElement");
        final List<String> mockedList = mock(List.class);
        mockedList.addAll(asList);

        verify(mockedList).addAll(captor.capture());
        final List<String> capturedArgument = captor.<List<String>>getValue();
        //Assert.assertThat(capturedArgument, hasItem("someElement")); // pass
        Assert.assertThat(capturedArgument, hasItem("someElement_test")); // pass

        //Assert.assertThat(capturedArgument, hasItem("notElement")); // failed

    }
}



