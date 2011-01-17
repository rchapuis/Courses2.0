package com.ei3info.graphi.courses;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MagasinCategories extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        TextView textview = new TextView(this);
        textview.setText("Par catégories");

        
        setContentView(R.layout.magasin);
    }

}
