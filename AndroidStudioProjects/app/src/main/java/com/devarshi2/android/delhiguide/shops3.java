package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class shops3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops3);
        String name="The Janpath market stretches around 1.5-km from the Outer Circle of Connaught Place to Windsor Place.Janpath Market is one of the most famous markets for tourists (both Indian and foreign) in New Delhi. The market essentially is a long line of boutique stores selling products which cannot be found in today's malls and showrooms of the city. It is also one of the oldest markets of New Delhi with establishment of some boutiques dating back to 1950. It is most popular for the exquisite Pashmina Shawl from Kashmir. Most markets in Delhi are known to carry duplicates however one can find the original quality here. Among other exquisite items are the Kashmiri wool shawls and scarves, Indian Kurtis and Churidars brass ornaments and artefacts, carpets and other gift items. The Indian Tourist Office is on the corner of Janpath and Connaught Lane, and good maps can be purchased there. Between Fire Lane and the Imperial Hotel, the Tibetan Market can be found which has a wide range of Himalayan arts and crafts. Musical instruments, wall hangings and bead shops are in abundance. Behind the Tibetan Market, on Tolstoy Marg, is the Jantar Mantar, an astrological instrument of immense proportions which is well worth a visit.\n" +
                "\n" +
                "Night view of Janpath\n" +
                "The Janpath Market also has an abundance of walking vendors who sell trinkets, such as necklaces, chunky jewellery, jootis, handicraft items. drums, horns and postcards, particularly to foreigners, most of whom now know about the bargaining required. Most speak good English and are good at bartering. South of Rajpath is the National Museum, which will take half a day to wander through.";
        name=name+"\n Here you get to do the best of street shopping. You will mostly find small kiosks selling all kinds of cotton clothes and curios. The clothes are generally export-surplus garments and are sold dirt-cheap. There's lots of silver and artificial jewellery studded with semi-precious stones available here. Refugees who came after the Partition and Tibetans who came when China invaded Tibet settled here as traders. Shopping here requires a couple of skills. One, you must have the ability to distinguish the fake from the genuine. Two, you must know and practice the art of bargaining patiently.\n" +
                "\n" +
                "The Tibetan Market, near Hotel Imperial, is a storehouse of curios and Tibetan artefacts. You can shop for some silver jewellery, thangkhas and brassware. \n" +
                "\n" +
                "Across the road here are a few well-known shops. The Central Cottage Industries Emporium, a Government of India undertaking under the Ministry of Textiles, is housed in the Jawahar Vyapar Bhavan. Envisaged as a showcase of the creations of Indian craftsmen, weavers and folk artists, it has been a favourite with customers in India and the world over. It remains open on all days from 10am to 7pm.\n" +
                "\n" +
                "Cooke & Kelvey at Scindia House is admired by the elites of India and abroad. The fabulous designs are artisticly executed to produce exquisite heavy kundan sets, maangtika and sherwani buttons that are breathtakingly gorgeous. In the same building, you will also find Tribhovandas Bhimji Zaveri (TBZ),where you can find a varied range of traditional and innovative designer jewellery in gold and diamonds, certified solitaire diamonds and hallmarked jewellery. Its clients include generations of high-profile families.";
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
