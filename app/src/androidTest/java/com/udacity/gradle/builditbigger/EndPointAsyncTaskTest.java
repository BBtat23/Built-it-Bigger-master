package com.udacity.gradle.builditbigger;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;


@RunWith(AndroidJUnit4.class)
public class EndPointAsyncTaskTest {
    //http://kevlaichungsing.blogspot.com/2016/03/android-app-build-it-bigger.html
    @Test
    public void testDoInBackground() throws Exception{
        MainActivityFragment mainActivityFragment = new MainActivityFragment();
        mainActivityFragment.testFlag = true;
        new EndpointAsyncTask().execute((Runnable) mainActivityFragment);
        Thread.sleep(5000);
        assertTrue("Error: Fetched Joke = " + mainActivityFragment.loadedJoke,mainActivityFragment.loadedJoke != null);
    }
}
