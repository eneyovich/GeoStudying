package com.dzondza.vasya.geostuding;

import android.os.Bundle;

/*
Australia Quiz
 */
public class AustraliaActivity extends BaseCountryActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        mQuestionMechanism.create(this.getResources().getStringArray(R.array.oceania_capitals),
                this.getResources().getStringArray(R.array.oceania_countries));
    }
}