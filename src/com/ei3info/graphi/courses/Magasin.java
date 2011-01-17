package com.ei3info.graphi.courses;

import com.ei3info.graphi.courses.*;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TabHost;

public class Magasin extends TabActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magasin);
        
        
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, MagasinAlphabetique.class);
        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("Ordre Alphabétique").setIndicator("Ordre Alphabétique",
                          res.getDrawable(R.drawable.magasin_tab_alphabetique))
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, MagasinCategories.class);
        spec = tabHost.newTabSpec("Par Catégories").setIndicator("Par Catégories",
                          res.getDrawable(R.drawable.magasin_tab_categories))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, MagasinPreferes.class);
        
        spec = tabHost.newTabSpec("Par Popularité").setIndicator("Par Popularité",
                          res.getDrawable(R.drawable.magasin_tab_preferes))
                      .setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(2);
    }
        
        
    //Gestion menuPanier
    //Méthode qui se déclenchera lorsque vous appuierez sur le bouton menu du téléphone
      public boolean onCreateOptionsMenu(Menu menu) {
   
          //Création d'un MenuInflater qui va permettre d'instancier un Menu XML en un objet Menu
          MenuInflater inflater = getMenuInflater();
          //Instanciation du menu XML spécifier en un objet Menu2
          inflater.inflate(R.layout.menu, menu);
   
          return true;
       }
   
         //Méthode qui se déclenchera au clic sur un item
        public boolean onOptionsItemSelected(MenuItem item) {
           //On regarde quel item a été cliqué grâce à son id et on déclenche une action
           switch (item.getItemId()) {
              case R.id.panier_add:
      			Intent intent2 = new Intent(Magasin.this, Listes.class);
    			startActivity(intent2);
    			finish();
    			return true;

             case R.id.magasin_add:
            	 return true;
                 
             case R.id.magasin_supp:
                 return true;
           	 }
           return false;
          }
        
        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            openOptionsMenu();
        }
                
        
}
