package com.devarshi2.android.delhiguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView numbers=(TextView)findViewById(R.id.places);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Places.class);
                startActivity(i);

            }
        });
        TextView family=(TextView)findViewById(R.id.shop);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, Shops.class);
                startActivity(familyIntent);

            }
        });
        TextView colors=(TextView)findViewById(R.id.food);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, Food.class);
                startActivity(colorIntent);

            }
        });
        TextView phrase=(TextView)findViewById(R.id.worship);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, Worship.class);
                startActivity(phraseIntent);

            }
        });
        TextView infor=(TextView)findViewById(R.id.info);
        infor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, Info.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform=(TextView)findViewById(R.id.infor);
        inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(MainActivity.this, infor.class);
                startActivity(phraseIntent);

            }
        });
    }
}
