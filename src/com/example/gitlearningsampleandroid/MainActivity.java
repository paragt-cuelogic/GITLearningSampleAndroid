package com.example.gitlearningsampleandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	       if(isGitWorking()){
		System.out.println("Wow, GIT is working");
	       }	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
        //add a menu
		menu.add(1, 1, 0, "NEW");
        
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	// To check if GIT is working or not.
       public boolean isGitWorking() {
           return true;
       } 
}
