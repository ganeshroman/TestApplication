package com.example.testapplication.mockitocontext;


import static androidx.test.platform.app.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertNotNull;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.testapplication.HomeActivity;

import org.junit.Assert;
import org.junit.Test;

public class TextIntentCreation {


    @Test
    public void testIntentShouldBeCreated() {
        //Context context = mock(Context.class);
        Context context1 = getInstrumentation().getTargetContext();

        Intent intent = HomeActivity.createQuery(context1, "query", "value");
        assertNotNull(intent);
        Bundle extras = intent.getExtras();
        Assert.assertNotNull(extras);

        Assert.assertEquals("query", extras.getString("QUERY"));
        Assert.assertEquals("value", extras.getString("VALUE"));

    }
}
