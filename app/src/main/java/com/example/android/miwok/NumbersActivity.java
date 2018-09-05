package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //TODO: add array of words here
        // Source: http://www.dmc.fmph.uniba.sk/public_html/doc/Java/ch5.htm#DeclaringArrayVariables
        String[] words = new String[10];
        words[0] = "One";
        words[1] = "Two";
        words[2] = "Three";
        words[3] = "Four";
        words[4] = "Five";
        words[5] = "Six";
        words[6] = "Seven";
        words[7] = "Eight";
        words[8] = "Nine";
        words[9] = "Ten";

        Log.v("Numbersactivity", "Word at index 0: " + words[0]);
        Log.v("Numbersactivity", "Word at index 1: " + words[1]);
        Log.v("Numbersactivity", "Word at index 2: " + words[2]);
        Log.v("Numbersactivity", "Word at index 3: " + words[3]);
        Log.v("Numbersactivity", "Word at index 4: " + words[4]);
        Log.v("Numbersactivity", "Word at index 5: " + words[5]);
        Log.v("Numbersactivity", "Word at index 6: " + words[6]);
        Log.v("Numbersactivity", "Word at index 7: " + words[7]);
        Log.v("Numbersactivity", "Word at index 8: " + words[8]);
        Log.v("Numbersactivity", "Word at index 9: " + words[9]);


    }
}
