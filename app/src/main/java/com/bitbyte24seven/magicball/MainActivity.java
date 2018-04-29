package com.bitbyte24seven.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView make = (TextView )findViewById(R.id.makedecision);
       final ImageView ballImage = (ImageView) findViewById(R.id.ballIImage);
       final ImageView outputImage = (ImageView) findViewById(R.id.outputImage);
         Button luck = (Button) findViewById(R.id.TryTheluck);

       final int[] tryluck = {
               R.drawable.no,
               R.drawable.no1,
               R.drawable.no2,
               R.drawable.yes,
               R.drawable.yes1,
               R.drawable.no,
               R.drawable.no1,
               R.drawable.no2,
               R.drawable.yes,
               R.drawable.yes1,
               R.drawable.no,
               R.drawable.no1,
               R.drawable.no2,
               R.drawable.yes,
               R.drawable.yes1,

       };

        luck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                final int nu = random.nextInt(12);
                Log.d("no","no "+nu);
                outputImage.setImageResource(tryluck[nu]);
            }
        });




    }

}
