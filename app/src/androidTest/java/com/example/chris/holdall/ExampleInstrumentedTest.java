package com.example.chris.holdall;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

   @Rule
   public ActivityTestRule<CalcActivity> activityRule = new ActivityTestRule<>(CalcActivity.class);

    @Test
    public void testAdditionAndEqual (){

        onView(withId(R.id.calc_5_button)).perform(click());
        onView(withId(R.id.calc_pos_button)).perform(click());
        onView(withId(R.id.calc_4_button)).perform(click());
        onView(withId(R.id.calc_equal_button)).perform(click());

        onView(withId(R.id.calc_screen)).check(matches(withText("9")));

    }
    @Test
    public void testNegationAndPositive (){
        onView(withId(R.id.calc_1_button)).perform(click());
        onView(withId(R.id.calc_5_button)).perform(click());
        onView(withId(R.id.calc_neg_button)).perform(click());
        onView(withId(R.id.calc_5_button)).perform(click());
        onView(withId(R.id.calc_pos_button)).perform(click());

        onView(withId(R.id.calc_screen)).check(matches(withText("10")));

    }

}
