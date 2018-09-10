package com.example.user.animals;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity{

    private ImageButton imageButtonAFox;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //обработка перехода на activity_arctic_fox
        imageButtonAFox = (ImageButton) findViewById(R.id.imageButtonAFox);
        imageButtonAFox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".ArcticFox");
                startActivity(intent);
            }
        });



    }




}
