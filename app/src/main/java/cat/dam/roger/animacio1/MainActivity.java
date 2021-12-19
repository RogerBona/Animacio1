package cat.dam.roger.animacio1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable pingu_animat, android_animacio;
    ImageView animaciopingu, animacioandy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Li diem que es un nou tipus animation
        pingu_animat = new AnimationDrawable();
        android_animacio = new AnimationDrawable();

        //Inicialitzem les variables
        animaciopingu = (ImageView) findViewById(R.id.animaciopingu);
        animacioandy = (ImageView) findViewById(R.id.animacioandy);

        animaciopingu.setBackgroundResource(R.drawable.pingu_animat);
        // Obté el fons que ha estat compilat amb un objecte AnimationDrawable
        pingu_animat = (AnimationDrawable) animaciopingu.getBackground();
        // Iniciem la animacio
        pingu_animat.start();

        animacioandy.setBackgroundResource(R.drawable.android_animacio);
        // Obté el fons que ha estat compilat amb un objecte AnimationDrawable
        android_animacio = (AnimationDrawable) animacioandy.getBackground();
        // Iniciem la animacio
        android_animacio.start();

    }
}