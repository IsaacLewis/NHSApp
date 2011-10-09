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
        
        // String s = findStringById(R.string.yes);
        //ListView lv = (ListView) findViewById(R.id.ListView_menu);
        View yes = findViewById(R.id.yes_button);
        Log.d("sv",(yes == null) + " " + yes);
        yes.setOnClickListener(new AdapterView.OnClickListener() {

		@Override
		public void onClick(View view) {
			startActivity(new Intent(Hello.this,EmergencyNumberInfo.class));
			
		}
	    });
    }
}