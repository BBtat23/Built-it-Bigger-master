package com.example.androidjokelibrary;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AndroidJokeActivity extends AppCompatActivity {

    public static final String JOKE_INTENT = "joke";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_joke);
        String jokeString = getIntent().getStringExtra(JOKE_INTENT);
        TextView jokeTextView = (TextView) findViewById(R.id.joke_text_view);
        jokeTextView.setText(jokeString);
    }
}
