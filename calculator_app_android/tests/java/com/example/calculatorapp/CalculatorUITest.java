// calculator_app_android/tests/java/com/example/calculatorapp/CalculatorUITest.java

package com.example.calculatorapp;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class CalculatorUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testAddition() {
        // Espresso UI test code for addition
        Espresso.onView(ViewMatchers.withId(R.id.button_1)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_plus)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_2)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.button_equals)).perform(ViewActions.click());

        // Adjust the following line based on your result view id
        Espresso.onView(ViewMatchers.withId(R.id.result_text)).check(ViewAssertions.matches(ViewMatchers.withText("3")));
    }

    // Add more test methods for subtraction, multiplication, division, etc.
}
