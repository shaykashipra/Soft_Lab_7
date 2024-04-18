package com.example.ui_ci;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainActivitySubTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule= new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void subTest(){
        onView(withId(R.id.editTextNumberDecimal)).perform(typeText("5.0"));
        onView(withId(R.id.editTextNumberDecimal2)).perform(typeText("8.0"));
        onView(withId(R.id.sub)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("-3.0")));
    }



}