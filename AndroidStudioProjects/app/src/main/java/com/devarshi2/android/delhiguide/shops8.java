package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class shops8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops8);
        String name="LARGEST MALL IN INDIA\n";
        name=name+"\n DLF Mall of India the first destination mall of the country, Spread across the retail space of 2 million (sq.ft. GLA) The essence of the mall is that of a destination, which encapsulates not just shopping but a never-before food & entertainment experience, which is thoughtfully and craftfully divided in 5 zones spread over 7 floors. It houses 330 brands including 100 Fashion brands opened their Stores which includes 27 Unisex Fashion, over 50 Women’s Fashion, 21 Men’s Fashion & 14 Kids Fashion Brands. Food & Casual Dining – Total 75 Food & Beverages Options Including 51 Cafes and Casual Dining Restaurants and 24 F&B Kiosks";
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
