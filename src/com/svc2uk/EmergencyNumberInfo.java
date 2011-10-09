package com.svc2uk;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class EmergencyNumberInfo extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.emergency);
        
        Bundle extras = getIntent().getExtras(); 
        if(extras !=null)
        {
        	String situationName = extras.getString("situationName");
        	TextView situationView = (TextView) findViewById(R.id.situation_name);
        	situationView.setText(situationName);
        }
        
        
    }
}
