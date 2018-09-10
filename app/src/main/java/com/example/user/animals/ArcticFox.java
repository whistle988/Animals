package com.example.user.animals;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ArcticFox extends AppCompatActivity {

    ImageButton imageButtonAFox_A2;

    //подключение медиалпеера
    private MediaPlayer arcticFoxSound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arctic_fox);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        imageButtonAFox_A2= (ImageButton) findViewById(R.id.imageButtonAFox_A2);
        imageButtonAFox_A2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //инициализация
        imageButtonAFox_A2 = (ImageButton) findViewById(R.id.imageButtonAFox_A2);
        //подключение звука
        arcticFoxSound = MediaPlayer.create(this, R.raw.arctic_fox__voice);
        imageClick();
    }

    //проигрывание звука при нажатии на картинку
    public void imageClick() {
        imageButtonAFox_A2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay(arcticFoxSound);
                    }
                }
        );
    }
    public void soundPlay(MediaPlayer sound){
        sound.start();
    }

}
