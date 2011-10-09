package com.svc2uk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class NonEmergencyInfo extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nonemergency);
        
        TextView situationView = (TextView) findViewById(R.id.situation_name);
        Bundle extras = getIntent().getExtras();
        
        if(extras !=null)
        {
        	String situationName = extras.getString("situationName");        	
        	situationView.setText(situationName);        	
        } else {
        	situationView.setText("This");    
        }
        
        
    }
}
