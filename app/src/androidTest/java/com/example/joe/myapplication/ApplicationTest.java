package com.example.joe.myapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

import static org.mockito.Mockito.mock;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    BlankFragment fragment;
    public void setUp() {
        createApplication();

        System.setProperty("dexmaker.dexcache", getContext().getCacheDir().toString());

        fragment = mock(BlankFragment.class);
    }


}