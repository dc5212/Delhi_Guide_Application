package com.devarshi2.android.delhiguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Places extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        TextView numbers=(TextView)findViewById(R.id.gate);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Places.this, places1.class);
                startActivity(i);

            }
        });
        TextView family=(TextView)findViewById(R.id.tomb);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(Places.this, places2.class);
                startActivity(familyIntent);

            }
        });
        TextView colors=(TextView)findViewById(R.id.fort);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(Places.this, places3.class);
                startActivity(colorIntent);

            }
        });
        TextView phrase=(TextView)findViewById(R.id.qutub);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Places.this, places4.class);
                startActivity(phraseIntent);

            }
        });
        TextView infor=(TextView)findViewById(R.id.jantar);
        infor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Places.this, places5.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform=(TextView)findViewById(R.id.president);
        inform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Places.this, places6.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform1=(TextView)findViewById(R.id.nehru);
        inform1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Places.this, places7.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform2=(TextView)findViewById(R.id.church);
        inform2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Places.this, places8.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform3=(TextView)findViewById(R.id.garden);
        inform3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Places.this, places9.class);
                startActivity(phraseIntent);

            }
        });
    }
}
