package com.example.mathgameisawesome;

import java.util.ArrayList;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
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

	private Button exitButton;
	private Button answer1;
	private Button answer2;
	private Button answer3;
	private Button resultButton;
	TextView numTop;
	TextView numBottom;
	TextView op;

	

	@Override	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_main);
		
//		for (int i = 0; i < 20 ; i++) {
//		
//		}
//		
//		ArrayList<Integer> numList = new ArrayList<Integer>();
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		numList.add(a);
//		numList.add(b);
//		numList.add(c);
//		
//		for (int i = 1; i < 4; i++){
//			
//		}
		
		//random numbers for buttons
		int a = getRandomNumber(3,1);
		int b = getRandomNumber(3,1);
		int c = getRandomNumber(3,1);
		final int operation = getRandomNumber(4,1);
		
		
		
		
		int integerX = getRandomNumber(10,1);
		int integerY = getRandomNumber(10,1);
		double doubleX = getRandomNumber(10,1);
		double doubleY = getRandomNumber(10,1);

		
		resultButton = (Button) findViewById(R.id.resultButton);
		resultButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Builder alert1 = new AlertDialog.Builder(MainActivity.this);
				alert1.setMessage("" + operation);
				alert1.setPositiveButton("OK",null);
				
				alert1.show();
			}
			
		});
		
		
		
		
		numTop = (TextView) findViewById(R.id.numTop);
		
		numTop.setTextColor(Color.GREEN);
		numTop.setBackgroundColor(Color.RED);
		numBottom = (TextView) findViewById(R.id.numBottom);
		
		numBottom.setBackgroundColor(Color.GREEN);
		numBottom.setTextColor(Color.BLACK);
		op = (TextView) findViewById(R.id.operator);
		if (operation == 4) {
			numTop.setText(""+doubleX);
			numBottom.setText(""+doubleY);
		} else {
			numTop.setText(""+integerX);
			numBottom.setText(""+integerY);
		}
		
		if (operation == 1){
			op.setText(displayOperator(0));
			
		}else if (operation ==2) {
			op.setText(displayOperator(1));
		}else if (operation ==3) {
			op.setText(displayOperator(2));
		}else {
			op.setText(displayOperator(3));
			}
		
		
		
		
		/***
		 * Addition
		 */
		if (operation == 1) {
			if (a == 1) {
				this.answer1=(Button)this.findViewById(R.id.answer1);
				answer1.setText(""+(integerX+integerY));
				this.answer1.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
			}
			else if (a != 1) {
				
				this.answer1=(Button)this.findViewById(R.id.answer1); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1+w2) == (integerX+integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer1.setText(""+(w1+w2));
				this.answer1.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			if (b == 1 && a != 1) {
				this.answer2=(Button)this.findViewById(R.id.answer2);
				answer2.setText(""+(integerX+integerY));
				this.answer2.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}else  {
				
				this.answer2=(Button)this.findViewById(R.id.answer2); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1+w2) == (integerX+integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer2.setText(""+(w1+w2));
				this.answer2.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			
			if (c == 1 && a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(integerX+integerY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			} else if (a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(integerX+integerY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}
			else {
				
				this.answer3=(Button)this.findViewById(R.id.answer3); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1+w2) == (integerX+integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer3.setText(""+(w1+w2));
				this.answer3.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			
		}
		/***
		 * Multiplication
		 * 
		 * ***/
		else if (operation == 2) {
			if (a == 1) {
				this.answer1=(Button)this.findViewById(R.id.answer1);
				answer1.setText(""+(integerX*integerY));
				this.answer1.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
			}
			else if (a != 1) {
				
				this.answer1=(Button)this.findViewById(R.id.answer1); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1*w2) == (integerX*integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer1.setText(""+(w1*w2));
				this.answer1.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			if (b == 1 && a != 1) {
				this.answer2=(Button)this.findViewById(R.id.answer2);
				answer2.setText(""+(integerX*integerY));
				this.answer2.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}else  {
				
				this.answer2=(Button)this.findViewById(R.id.answer2); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1*w2) == (integerX*integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer2.setText(""+(w1+w2));
				this.answer2.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			
			if (c == 1 && a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(integerX*integerY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			} else if (a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(integerX*integerY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}
			else {
				
				this.answer3=(Button)this.findViewById(R.id.answer3); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1*w2) == (integerX*integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer3.setText(""+(w1*w2));
				this.answer3.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
		}
		
		/***
		 * Subtraction
		 */
		else if (operation == 3) {
			if (a == 1) {
				this.answer1=(Button)this.findViewById(R.id.answer1);
				answer1.setText(""+(integerX-integerY));
				this.answer1.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
			}
			else if (a != 1) {
				
				this.answer1=(Button)this.findViewById(R.id.answer1); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1-w2) == (integerX-integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer1.setText(""+(w1-w2));
				this.answer1.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			if (b == 1 && a != 1) {
				this.answer2=(Button)this.findViewById(R.id.answer2);
				answer2.setText(""+(integerX-integerY));
				this.answer2.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}else  {
				
				this.answer2=(Button)this.findViewById(R.id.answer2); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1-w2) == (integerX-integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer2.setText(""+(w1-w2));
				this.answer2.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			
			if (c == 1 && a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(integerX-integerY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			} else if (a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(integerX-integerY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}
			else {
				
				this.answer3=(Button)this.findViewById(R.id.answer3); 
				int w1 = getRandomNumber(10,1);
				int w2 = getRandomNumber(10,1);
				while ((w1-w2) == (integerX-integerY))
				{
					w1 = getRandomNumber(10,1);
					w2 = getRandomNumber(10,1);
				}
				answer3.setText(""+(w1-w2));
				this.answer3.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
		}
		/***
		 * Division
		 */
		else if (operation == 4) {
			if (a == 1) {
				this.answer1=(Button)this.findViewById(R.id.answer1);
				answer1.setText(""+(doubleX/doubleY));
				this.answer1.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
			}
			else if (a != 1) {
				
				this.answer1=(Button)this.findViewById(R.id.answer1); 
				double w1 = getRandomNumber(10,0);
				double w2 = getRandomNumber(10,0);
				while ((w1/w2) == (doubleX/doubleY))
				{
					w1 = getRandomNumber(10,0);
					w2 = getRandomNumber(10,0);
				}
				answer1.setText(""+(w1/w2));
				this.answer1.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			if (b == 1 && a != 1) {
				this.answer2=(Button)this.findViewById(R.id.answer2);
				answer2.setText(""+(doubleX/doubleY));
				this.answer2.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}else  {
				
				this.answer2=(Button)this.findViewById(R.id.answer2); 
				double w1 = getRandomNumber(10,0);
				double w2 = getRandomNumber(10,0);
				while ((w1/w2) == (doubleX/doubleX))
				{
					w1 = getRandomNumber(10,0);
					w2 = getRandomNumber(10,0);
				}
				answer2.setText(""+(w1/w2));
				this.answer2.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
			
			if (c == 1 && a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(doubleX/doubleY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			} else if (a != 1 && b != 1) {
				this.answer3=(Button)this.findViewById(R.id.answer3);
				answer3.setText(""+(doubleX/doubleY));
				this.answer3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						Builder alert1 = new AlertDialog.Builder(MainActivity.this);
						alert1.setMessage("You win!");
						alert1.setPositiveButton("OK",null);
						
						
						alert1.show();
					}
				});
				
			}
			else {
				
				this.answer3=(Button)this.findViewById(R.id.answer3); 
				double w1 = getRandomNumber(10,0);
				double w2 = getRandomNumber(10,0);
				while ((w1/w2) == (doubleX/doubleY))
				{
					w1 = getRandomNumber(10,0);
					w2 = getRandomNumber(10,0);
				}
				answer3.setText(""+(w1/w2));
				this.answer3.setOnClickListener(new OnClickListener() {
				
					public void onClick(View v) {
						Builder alert2 = new AlertDialog.Builder(MainActivity.this);
						alert2.setMessage("Wrong Answer!");
						alert2.setPositiveButton("OK",null);
						alert2.show();
					}
				});
			}
		}
		
		
		
		
		
		
		
		
		this.exitButton=(Button)this.findViewById(R.id.exitButton);
		this.exitButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		
	
	}
	
	public int getRandomNumber(int max, int min)
	{
		int range = (max-min) + 1;
		return min + (int)(Math.random() * range);
	}
	
	
	
	public String displayOperator (int num)
	{
		
		if (num == 0)
		{
			return "+";
		}
		else if (num == 1)
		{
			return "*";
		}
		else if (num == 2)
		{
			return "-";
		}
		else {
			return "/";
		}
		
	}
	
}
