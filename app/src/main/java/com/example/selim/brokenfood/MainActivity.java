package com.example.selim.brokenfood;//notre projet se situe dans ce package

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//On importe des classes
public class MainActivity extends AppCompatActivity
{
    /*On a créé une classe MainActivity qui hérite de Activity car c'est une activité*/
    @Override //Indique qu'on va redéfinir une méthode qui existe déjà dans la classe parente
    protected void onCreate(Bundle savedInstanceState) // Bundle pour s'il sagit d'un nouveau lancement (null) ou d'un redemarrage
    {
        //Cette méthode créé l'interface graphique
        //Cette méthode est la 1ère lancée au démarrage d'une application
        super.onCreate(savedInstanceState);// super car appartient à la superclasse (classe parent)

        TextView text = new TextView(this);
        //vue représentant un test
        text.setText("Hello World !");
        setContentView(text);
    }

    private void test_upload()
    {
        int i = 1+1;
        char letter = 'a';
        int c = 5;
    }
}
