package com.example.additionapp;


import android.os.Bundle;
import android.app.Activity;

import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AdditionActivity extends Activity {
	EditText et1;
	EditText et2;
	TextView tv;
	Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        et1=(EditText) findViewById(R.id.editText1);
        et2=(EditText) findViewById(R.id.editText2);
        tv=(TextView) findViewById(R.id.textView4);
        bt=(Button) findViewById(R.id.button1);
        bt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				int a=Integer.parseInt(et1.getText().toString());
				int b=Integer.parseInt(et2.getText().toString());
				int c=a+b;
				
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.addition, menu);
        return true;
    }
    
}
