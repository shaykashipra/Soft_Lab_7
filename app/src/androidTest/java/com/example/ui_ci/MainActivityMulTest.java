package com.example.ui_ci;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
import static androidx.test.espresso.action.ViewActions.clearText;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

public class MainActivityMulTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);


    @Test

    public void MulTest(){

        onView(withId(R.id.editTextNumberDecimal)).perform(clearText(), typeText("5"));
        onView(withId(R.id.editTextNumberDecimal2)).perform(clearText(), typeText("7"));

        onView(withId(R.id.mul)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("35.0")));

    }
}