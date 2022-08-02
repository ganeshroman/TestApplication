package com.example.testapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    public static Intent createQuery(Context context, String query, String value) {
        Intent intent = new Intent(context, HomeActivity.class);

        Bundle b = new Bundle();
        b.putString("QUERY", "" + query);
        b.putString("VALUE", "" + value);
        intent.putExtras(b);

        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }


}