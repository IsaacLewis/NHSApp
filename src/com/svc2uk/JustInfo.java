package com.svc2uk;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class JustInfo extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.just_info);
        
        // Get the reference to the ListView item in the main.xml layout
        ListView menuList = (ListView) findViewById(R.id.menu);
        
        // Create an array of strings and populate it with the items from the string array declared in strings.xml
        String[] items = getResources().getStringArray(R.array.services);
        
        // Create an array adapter to create the menu with the list items being laid out as per list_item.xml
        // and the item names from the items[] array created above
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this, R.layout.list_item, items);
        menuList.setAdapter(adapt);   
    }
}
