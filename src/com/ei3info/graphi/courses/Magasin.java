package com.ei3info.graphi.courses;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Magasin extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.magasin);
    }
        
    //Gestion menuPanier
    //Méthode qui se déclenchera lorsque vous appuierez sur le bouton menu du téléphone
      public boolean onCreateOptionsMenu(Menu menu) {
   
          //Création d'un MenuInflater qui va permettre d'instancier un Menu XML en un objet Menu
          MenuInflater inflater = getMenuInflater();
          //Instanciation du menu XML spécifier en un objet Menu
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
                 //Pour fermer l'application il suffit de faire finish()
            	 return true;
                 
             case R.id.magasin_supp:
                 return true;
           }
           return false;}
}
