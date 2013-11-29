package com.example.myfisrtapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.EditText;


public class ShowControlWindow extends Activity {
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_control_window);
    }
	

    
	public void goBack(View vew){		
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
		
	}

}
