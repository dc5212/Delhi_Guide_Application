package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class shops1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops1);
        String name="It is the perfect place to shop in. This densely populated market has been around for more than three centuries and was once visited by merchants from Turkey, China and even Holland. You may buy curios and souvenirs from here. Dariba Kalan is known for its pearl, gold and silver jewellery and attar (natural perfumes). Gulab Singh Johri Mal, established in 1819, are well-known manufacturers and exporters of attar. A visit to Khari Baoli is a must for the spice-lover — don't forget spices are what connected India to the West. Kinari Bazaar is the best place to look for zari and zardozi trimmings and tinsel. The cloth bazaar of Katra Neel offers all kinds of fabrics such as silks, satin, crepe, cotton and muslin. Bhagirath Palace is Asia's largest market for electrical goods and also offers medical equipment and allopathic medicines. Moti Bazaar is famous for shawls and pearls and Tilak Bazaar for chemicals\n"+"Chandni Chowk's speciality is its variety and authenticity: food, delicacies and sweets of more than 1,000 kinds, sarees with chikan and zari. Narrow lanes host shops sell books, clothing, electronic, consumer goods, shoes and leather goods. It is the location of the original Haldiram's and brands such as Gianis. A particular local delicacy are the jalebis, which are fried in pure ghee (clarified butter).\n" +
                "The Cloth Market, supplies home furnishing fabrics, including ready-made items as well as design services.\n" +
                "Nai Sarak is the wholesale market of stationery, books, paper and decorative materials. It house folder stores including SOLO[14] and Shipra.[15] It also offers bridal Saris and Lehengas from DIVASA by Devta Apparels Pvt. Ltd jogiwara,[16] Arun Sarees[17] and Nandlal Silk Mills.[18]\n" +
                "Lal Kuan is a wholesale market for hardware and hotel kitchen equipment. It is adjacent to Tilak Market which is a wholesale market for industrial chemicals. Located at the western end of Chandni Chowk, Khari Baoli is a street entirely dedicated to all kinds of spices, dried fruits, nuts, and herbs.\n" +
                "Dariba is the market for silver and gold jewelry. The popular jewelry stores are Hare ram Hare Krishna and MM Jewellers. This market also offers trophies, shields, mementos and related items.";
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
