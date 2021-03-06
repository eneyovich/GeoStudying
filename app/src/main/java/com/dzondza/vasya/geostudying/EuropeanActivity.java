package com.dzondza.vasya.geostudying;

import android.os.Bundle;

/**
 * Europe's Quiz
 */

public class EuropeanActivity extends BaseCountryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        mQuestionMechanism.create(this.getResources().getStringArray(R.array.europe_capitals),
                this.getResources().getStringArray(R.array.europe_countries));
    }
}