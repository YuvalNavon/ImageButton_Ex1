package com.example.imagebutton_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
 Random rand = new Random();
 int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn =(ImageButton) findViewById((R.id.ImgBtn));
        ImageView img = (ImageView) findViewById((R.id.imageView));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = rand.nextInt(3) + 1;
                if (num==1){
                    btn.setImageResource(R.drawable.one_new);
                    img.setImageResource(R.drawable.dripspongbob);
                }
                else if (num==2){
                    btn.setImageResource(R.drawable.two_new_ne);
                    img.setImageResource(R.drawable.drip1);

                }
               else if (num==3){
                    btn.setImageResource(R.drawable.three_new);
                    img.setImageResource(R.drawable.amongdrip);
                }
            }
        });
    }
}