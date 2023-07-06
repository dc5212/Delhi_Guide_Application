package com.devarshi2.android.delhiguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Worship extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worship);
        TextView numbers=(TextView)findViewById(R.id.temple1);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Worship.this, worship1.class);
                startActivity(i);

            }
        });
        TextView family=(TextView)findViewById(R.id.temple2);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(Worship.this, worship2.class);
                startActivity(familyIntent);

            }
        });
        TextView colors=(TextView)findViewById(R.id.masjid);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(Worship.this,worship3.class);
                startActivity(colorIntent);

            }
        });
        TextView phrase=(TextView)findViewById(R.id.temple3);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Worship.this, worship4.class);
                startActivity(phraseIntent);

            }
        });






        TextView inform1=(TextView)findViewById(R.id.shrine);
        inform1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Worship.this,worship7.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform2=(TextView)findViewById(R.id.temple4);
        inform2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Worship.this,worship8.class);
                startActivity(phraseIntent);

            }
        });


    }
}
