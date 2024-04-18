package com.example.ui_ci;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

import androidx.annotation.ContentView;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.example.ui_ci.MainActivity;
import com.example.ui_ci.R;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
@RunWith(AndroidJUnit4.class)

public class MainActivityMulTest {
    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);


    @Test

    public void MulTest(){

        onView(withId(R.id.editTextNumberDecimal)).perform(clearText(), typeText("1"));
        onView(withId(R.id.editTextNumberDecimal2)).perform(clearText(), typeText("2"));

        onView(withId(R.id.mul)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("2.0")));

    }
}