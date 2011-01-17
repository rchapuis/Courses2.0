package com.ei3info.graphi.courses;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;

public class courses extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Hide the window title.
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        
        setContentView(R.layout.main);
        
        Button acces_liste =(Button)findViewById(R.id.acces_liste);
	    Button acces_magasin =(Button)findViewById(R.id.acces_magasin);
	    Button accueil_aide =(Button)findViewById(R.id.accueil_aide);
	    
	  //On cr�e un �couteur d'�v�nement commun aux deux Button
	    OnClickListener onClickLister = new OnClickListener() {
	 
	    	public void onClick(View v){
		    	switch(v.getId()){
		    	case R.id.acces_liste:
		    		Intent intent = new Intent(courses.this, courses.class);
					startActivity(intent);
		    		finish();
		    		break;
		    	case R.id.acces_magasin:
		    		Intent intent2 = new Intent(courses.this, Magasin.class);
					startActivity(intent2);
					finish();
		    		break;
		    	}	
	    	};
	    };
	  
    
	    //on affecte aux Button l'�couteur d'�v�nement
	    acces_liste.setOnClickListener(onClickLister);
	    acces_magasin.setOnClickListener(onClickLister);
	    
	    AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.aide_texte_courses)
            .setCancelable(false)
            .setTitle(R.string.aide_titre)
            .setPositiveButton("Retour", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
                }
            });
        final AlertDialog alert = builder.create();
        
        accueil_aide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                alert.show();
            }
            });}

}
