package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class food6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food6);
        String name="Located next to the Fatehpuri Masjid on a rather busy street, Kake di Hatti welcomed me with the sight of preparation of gigantic naans at the front counter. It boasted of three halls to seat its patrons, both humbled by a large bustling crowd and superseded in grandeur by the aroma of fresh paranthas and curries.\n" +
                "\n" +
                "IMG_6056As we entered, the manager showed us the way to the family hall on the first floor. Understanding my enthusiasm he even showed me the kitchen and the preparations that go on all day. Kake di Hatti is a pure vegetarian eatery and offers a variety of curries, stuffed naans, paranthas, biryanis and desserts. Our order was a simple Kadhai Paneer and Aloo-Pyaaz naan. The paneer curry was not very spicy and tasted much like what is expected at a typical north Indian joint. However, the naan stole the show. It was not only enormous, it also tasted incomparably scrumptious. It was slightly tangy and the right mix of crunchy and soft. The naan had the perfect balance of flavours . Better yet, the generic paneer seemed to only compliment the naan. Believe me when I say the naan was huge, it is enough for two people. My cousin and I managed to finish only half of it, getting the rest packed for later, going with the promising description by the waiter who mentioned that the naan would taste equally good and fresh even after 15 hours. And so it did.\n" +
                "\n" +
                "Established in 1942, Kake di hattii now has 3 more branches around the city and by the claims of the manager, they uphold the quality. Honestly, the naan that I ate there was one of the best that I ever had and the popularity of this joint seems to prove that.";

        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
