package com.example.mathgameisawesome;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	private Button okButton;
	private Button answer1;
	private Button answer2;
	private Button answer3;

	@Override	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
		int x = getRandomNumber(10,1);
		while (x == 0)
			x = getRandomNumber(10,1);
		int y = getRandomNumber(10,1);
		while (y == 0)
			y = getRandomNumber(10,1);
		
		AlertDialog alert1 = new AlertDialog.Builder(this).create();
		alert1.setMessage("You win!");
		
		
		
		TextView textView = (TextView) findViewById(R.id.textView);
		textView.setText(""+x);
		textView.setTextColor(Color.GREEN);
		textView.setBackgroundColor(Color.RED);
		TextView text2 = (TextView) findViewById(R.id.text1);
		text2.setText(""+y);
		text2.setBackgroundColor(Color.GREEN);
		text2.setTextColor(Color.BLACK);
		TextView oper = (TextView) findViewById(R.id.operator);
		oper.setText(displayOperator(0));
		
		this.answer1=(Button)this.findViewById(R.id.answer1);
		answer1.setText(""+(x+y));
		this.answer1.setOnClickListener(new OnClickListener() {
			@SuppressWarnings("deprecation")
			public void onClick(View v) {
				AlertDialog alert1 = new AlertDialog.Builder(MainActivity.this).create();
				alert1.setMessage("You win!");
				alert1.setButton("OK!", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "You win!  Yay!", Toast.LENGTH_SHORT).show();
					}
				});
				
				alert1.show();
			}
		});
		
		
		this.answer2=(Button)this.findViewById(R.id.answer2); 
		int w1 = getRandomNumber(10,1);
		int w2 = getRandomNumber(10,1);
		while ((w1+w2) == (x+y))
		{
			w1 = getRandomNumber(10,1);
			w2 = getRandomNumber(10,1);
		}
		answer2.setText(""+(w1+w2));
		this.answer2.setOnClickListener(new OnClickListener() {
			@SuppressWarnings("deprecation")
			public void onClick(View v) {
				AlertDialog alert2 = new AlertDialog.Builder(MainActivity.this).create();
				alert2.setMessage("Wrong Answer!");
				alert2.setButton("OK!", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Try again?", Toast.LENGTH_SHORT).show();
					}
				});
				alert2.show();
			}
		});
		
		
		this.answer3=(Button)this.findViewById(R.id.answer3);
		int w3 = getRandomNumber(10,1);
		int w4 = getRandomNumber(10,1);
		while ((w3+w4)==(x+y) && (w3+w4) == (w1+w2))
		{
			w3 = getRandomNumber(10,1);
			w4 = getRandomNumber(10,1);
		}
		answer3.setText(""+(w3+w4));
		this.answer3.setOnClickListener(new OnClickListener() {
			@SuppressWarnings("deprecation")
			public void onClick(View v) {
				AlertDialog alert3 = new AlertDialog.Builder(MainActivity.this).create();
				alert3.setMessage("Wrong answer!");
				alert3.setButton("OK!", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						Toast.makeText(getApplicationContext(), "Try again?", Toast.LENGTH_SHORT).show();
					}
				});
				alert3.show();
			}
		});
		
		
		
		this.okButton=(Button)this.findViewById(R.id.okbutton);
		this.okButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		
	
	}
	
	public int getRandomNumber(int max, int min)
	{
		int range = (max-min) + 1;
		return (int)(Math.random() * range);
	}
	
	public String displayOperator (int num)
	{
		if (num == 0)
		{
			return "+";
		}
		else if (num == 1)
		{
			return "-";
		}
		else if (num == 2)
		{
			return "*";
		}
		else
		{
			return "/";
		}
	}
	
}
