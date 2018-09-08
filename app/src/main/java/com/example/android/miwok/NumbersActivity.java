package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //TODO: add array of words here
        // Source: http://www.dmc.fmph.uniba.sk/public_html/doc/Java/ch5.htm#DeclaringArrayVariables
//        String[] words = new String[10];
        ArrayList<String> words = new ArrayList<String>();

        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Four");
        words.add("Five");
        words.add("Six");
        words.add("Seven");
        words.add("Eight");
        words.add("Nine");
        words.add("Ten");

        LinearLayout rootView = (LinearLayout)findViewById(R.id.rootView);

        int index = 0;

        //create a textView, set contents of 0th index of words ArrayList to it, then add it to rootView
        TextView wordView = new TextView(this);
        wordView.setText(words.get(index));
        rootView.addView(wordView);

        index += 1;

        //create a textView, set contents of 1st index of words ArrayList to it, then add it to rootView
        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(index));
        rootView.addView(wordView2);

        index += 1;

        //create a textView, set contents of 3rd index of words ArrayList to it, then add it to rootView
        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(index));
        rootView.addView(wordView3);

    }
}
