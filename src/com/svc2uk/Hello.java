package com.svc2uk;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Hello extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        View yes = findViewById(R.id.yes_button);
        View maybe = findViewById(R.id.maybe_button);
        View no = findViewById(R.id.no_button);

        yes.setOnClickListener(new AdapterView.OnClickListener() {
		@Override
		public void onClick(View view) {
			startActivity(new Intent(Hello.this,EmergencyNumberInfo.class));			
		}
	    });
        
        maybe.setOnClickListener(new AdapterView.OnClickListener() {
    		@Override
    		public void onClick(View view) {
    			startActivity(new Intent(Hello.this,Triage.class));			
    		}
    	    });
        
        no.setOnClickListener(new AdapterView.OnClickListener() {
    		@Override
    		public void onClick(View view) {
    			startActivity(new Intent(Hello.this,JustInfo.class));			
    		}
    	    });
    }
}