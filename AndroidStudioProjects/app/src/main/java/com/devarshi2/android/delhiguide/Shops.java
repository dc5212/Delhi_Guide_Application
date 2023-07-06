package com.devarshi2.android.delhiguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Shops extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops);
        TextView numbers=(TextView)findViewById(R.id.chowk);
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Shops.this, shops1.class);
                startActivity(i);

            }
        });
        TextView family=(TextView)findViewById(R.id.mall);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(Shops.this, shops2.class);
                startActivity(familyIntent);

            }
        });
        TextView colors=(TextView)findViewById(R.id.jan);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(Shops.this,shops3.class);
                startActivity(colorIntent);

            }
        });
        TextView phrase=(TextView)findViewById(R.id.palika);
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Shops.this, shops4.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform1=(TextView)findViewById(R.id.connaught);
        inform1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Shops.this,shops5.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform2=(TextView)findViewById(R.id.sarojini);
        inform2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Shops.this,shops6.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform3=(TextView)findViewById(R.id.bagh);
        inform3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Shops.this,shops7.class);
                startActivity(phraseIntent);

            }
        });
        TextView inform4=(TextView)findViewById(R.id.dlf);
        inform4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phraseIntent = new Intent(Shops.this,shops8.class);
                startActivity(phraseIntent);

            }
        });

    }
}
