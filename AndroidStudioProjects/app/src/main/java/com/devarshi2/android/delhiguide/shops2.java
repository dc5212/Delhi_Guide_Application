package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class shops2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops2);
        String name="LOCATION: A-3 District Centre, Saket, New Delhi, Delhi 110017 \n" +
                "OPEN ALL DAYS FROM 10AM TO 11PM\n"+"NEAREST METRO STATION IS MALVIYANAGAR STATION\n";
         name=name+"The mall is divided into three broad zones: There are eight anchor tenants including Goodearth Verandah, Pantaloons, Crossword Bookstore, Zara, and Home Stop. The mall also has 180 stores representing over 500 major Indian and international brands of clothes and apparels including Aldo, Nine West, Charles & Keith, Calvin Klein, Armani Jeans, French Connection, Gant, Guess, La Senza, Levi's, Mango, Next, Pepe Jeans, Zara, Tommy Hilfiger, and United Colors of Benetton. In addition, there are stores by Clinique, Lancôme, L'Occitane, MAC and The Body Shop. The mall houses Esprit's 12,000 sq ft (1,100 m2). flagship store for Delhi, along with a 3,000 sq ft (280 m2). Tommy Hilfiger flagship store, and Calvin Klein's first stand-alone store in India, featuring CK Jeans and CK Underwear & Padd.\n" +
                "The mall has a 10,000 sq ft (930 m2). multi-cuisine food court, Food Talk, on the second floor, along with several restaurants including The Coffee Bean & Tea Leaf, Pizza Hut, Chicago Pizza and KFC. It also has Pantaloon Retail's first Gourmet Food Bazaar, which stocks Indian and imported food products. The mall also houses a PVR Cinemas multiplex, which comprises six screens including 2 gold classes and has a total seating capacity of 1,235.[6]\n" +
                "There is also a 100,000 sq ft (9,300 m2) outdoor open plaza, Sanskriti, for art festivals, fairs, exhibitions, performances, and al fresco dining. The plaza is landscaped extensively in timber, water, stone and steel and has an open–air amphitheater, along with trees and water features.";
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
