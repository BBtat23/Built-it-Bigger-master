package com.udacity.gradle.builditbigger

import android.support.test.rule.ActivityTestRule
import android.test.AndroidTestCase
import org.junit.Rule
import org.junit.Test

class EndpointsAsyncTaskTest extends AndroidTestCase {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);
    @Test
    public void testJokeResponse(){
        onView(withId(R.id.button_joke)).perform(click());
        onView(withId(R.id.instructions_text_view)).check(matches(withText("joke")));
    }
}
