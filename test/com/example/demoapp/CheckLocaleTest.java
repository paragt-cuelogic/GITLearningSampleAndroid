package com.mysample;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import com.mysample.robolectricsample.CheckLocale;
import com.mysample.robolectricsample.R;

@RunWith(RobolectricTestRunner.class)
public class CheckLocaleTest {
	
	CheckLocale localObj;
	
	@Before
	public void setUp() throws Exception {
		
		localObj = Robolectric.buildActivity(CheckLocale.class).create().get();
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	
	// English Locale.
	@Test @Config(qualifiers = "en")
    public void shouldHaveEnglishText() throws Exception
    {
		String text = localObj.getResources().getString(R.string.helloTxt);
		 assertThat(text, equalTo("Hello!!"));
    }
	
	
	// French Locale language.
	@Test @Config(qualifiers = "fr")
	public void shouldHaveFrenchText() throws Exception
	{
		String text = localObj.getResources().getString(R.string.helloTxt);
		 assertThat(text, equalTo("Bonjour!!"));
	}
	
}
