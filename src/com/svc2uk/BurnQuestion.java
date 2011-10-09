package com.svc2uk;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;


public class BurnQuestion extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.burn);
        
        View b1 = findViewById(R.id.burn1);
        View b2 = findViewById(R.id.burn2);
        View b3 = findViewById(R.id.burn3);

        // Log.d("sv",(yes == null) + " " + (maybe==null)+ " " + (no==null));
        b1.setOnClickListener(new AdapterView.OnClickListener() {
		@Override
		public void onClick(View view) {
        	Intent intent = new Intent(BurnQuestion.this,EmergencyNumberInfo.class);
        	intent.putExtra("situationName","A third-degree burn");
        	startActivity(intent);		
		}
	    });
        
        b2.setOnClickListener(new AdapterView.OnClickListener() {
    		@Override
    		public void onClick(View view) {
            	Intent intent = new Intent(BurnQuestion.this,EmergencyNumberInfo.class);
            	intent.putExtra("situationName","A second-degree burn");
            	startActivity(intent);				
    		}
    	    });
        
        b1.setOnClickListener(new AdapterView.OnClickListener() {
    		@Override
    		public void onClick(View view) {
            	Intent intent = new Intent(BurnQuestion.this,NonEmergencyInfo.class);
            	intent.putExtra("situationName","A first-degree burn");
            	startActivity(intent);				
    		}
    	    });
    	    
    	   
    }
   
}