package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class shops7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops7);
        String name="NEAREST METRO IS KAROL BAGH METRO STATION";
        name=name+"\n Karol Bagh is a shopper's delight for you can find virtually everything here. Ajmal Khan Road has long been famous for inexpensive readymades, cotton yarn and embroidered garments. But now international labels have also become equally familiar. At Arya Samaj Road you can buy second-hand books. Bank Street has a row of shops displaying gold jewellery. Ghaffar Market is famous for imported goods.\n";
        name=name+"The area is now considered where the affluent people of West and Central Delhi go to shops, with a busy shopping streets including Ajmal Khan Road, Arya Samaj Road, and the Ghaffar Market, named after freedom fighter Khan Abdul Ghaffar Khan, Tip Top Market (Established by Sh Sohan Lal Jain in the year 2000). In the recent years, many western businesses have established themselves in this area. Pizza Hut, TGIF, Reebok, Sketchers, Puma and Lacoste have all established successful businesses in Karol Bagh.. Many eateries also exist such as Pind Balluchi etc.";
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
