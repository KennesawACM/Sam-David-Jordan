package com.example.mathgameisawesome;

/*
 * 
 */

//import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends Activity {

	private TextView inputView = null;
	
	//int num = RandRange(10, 1);
	/*
	 * HEY GUYS LOOK HERE So I had an idea.  If we simply use the random number generator method to generate 8 numbers in sets of 2, we can use the 
	 * 	resulting 4 answers as potential answers to the true questions, which is one of these sets.  This way we don't have to 
	 * 	deal with a number pad and instead can have only 4 clickable areas.  Thoughts?
	 */
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//
		inputView = (TextView) findViewById(R.id.inputView);
		int x = getRandomNumber(10, 1);
		int y = getRandomNumber(10, 1);
		int compVal = x + y;
		inputView.setText(""+ compVal);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public int getRandomNumber(int max, int min) 
	{
		int range = (max - min) + 1;
		return (int)(Math.random() * range);
	}
	
	public void numberCrunch()
	{
		int x = getRandomNumber(10, 1);
		int y = getRandomNumber(10, 1);
		int compVal = x + y;
		
		
		
	}
}
