package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class shops4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops4);
        String name="LOCATION:Shop No. B-7, Way To Palika Car Parking, Palika Bazaar Rd, Palika Bazar, Connaught Place,\n"+"OPEN FROM 10AM TO 8PM\n"+"This underground, air-conditioned market located below the inner circle of Connaught Place was set up in the late 1970s. It is especially famous for cheap electronic goods and clothes. From footwear to clothing to nightwear to perfumes to accessories to electronic gadgets to DVDs and CDs, you will get a wide range of products in this massive market. You may also buy curios and small knick-knacks to take back home as souvenirs. There are hundreds of shops in Palika Bazaar. It is estimated to have some 15,000 people within its confines at any given time and\n" +
                "also attracts many foreign tourists. Although bargaining is the mantra for shopping anywhere in Delhi, it must be followed here rigorously.\n" +
                "\n" +
                "The Main gate faces Central Park, with F Block on the right and Palika Underground Parking on the left. Entry is through a staircase. This market remains closed on Sundays.";
        name=name+"Gate no. 1: Main gate. Faces Connaught Place Central Park, with F Block on the right and Palika Underground Parking on the left. Staircase entry.\n" +
                "Gate no. 2: Faces Palika Underground Parking. Handicap ramp entry.\n" +
                "Gate no. 3: Not in use. Faces Palika Underground Parking. Closed to the public.\n" +
                "Gate no. 4: Spiral staircase entry with two doors, one not in use. Door in use faces Parliament Street, Regal Building and Jeevan Bharti building.\n" +
                "Gate no. 5: Spiral staircase entry with two doors. One door faces Janpath, N Block and Jeevan Bharti building, the other faces towards Palika Underground Parking.\n" +
                "Gate no. 6: Staircase entry. Faces N Block and F Block.\n" +
                "Gate no. 7: Handicap ramp entry. Faces F Block.";
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
