package com.devarshi2.android.delhiguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        TextView numbers=(TextView)findViewById(R.id.paratha);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Food.this, food1.class);
                startActivity(i);

            }
        });
        TextView family=(TextView)findViewById(R.id.kulcha);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(Food.this, food2.class);
                startActivity(familyIntent);

            }
        });
        TextView colors=(TextView)findViewById(R.id.haat);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(Food.this,food3.class);
                startActivity(colorIntent);

            }
        });
        TextView phrase=(TextView)findViewById(R.id.sitaram);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Food.this, food4.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform1=(TextView)findViewById(R.id.momos);
        inform1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Food.this,food5.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform2=(TextView)findViewById(R.id.hatti);
        inform2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Food.this,food6.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform3=(TextView)findViewById(R.id.govinda);
        inform3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Food.this,food7.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform4=(TextView)findViewById(R.id.chaat);
        inform4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Food.this,food8.class);
                startActivity(phraseIntent);

            }
        });





    }
}
