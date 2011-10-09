package com.svc2uk;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Triage extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triage);
        
        // Get the reference to the ListView item in the main.xml layout
        ListView menuList = (ListView) findViewById(R.id.menu);
        
        // Create an array of strings and populate it with the items from the string array declared in strings.xml
        String[] items = getResources().getStringArray(R.array.Situations);
        
        // Create an array adapter to create the menu with the list items being laid out as per list_item.xml
        // and the item names from the items[] array created above
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.list_item, items);
        menuList.setAdapter(adapt);
        
        // make the menu items actionable by declaring an onclick listener for each of them
        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
		public void onItemClick(AdapterView<?> parent, View itemClicked,
					int position, long id) {
                
		    TextView textview = (TextView) itemClicked;
		    String strText = textview.getText().toString();
                
		    switch(position){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    	Intent intent = new Intent(Triage.this,EmergencyNumberInfo.class);
                    	intent.putExtra("situationName",strText);
                    	startActivity(intent);

            	    
		    }
		}
	    });
    }
}
