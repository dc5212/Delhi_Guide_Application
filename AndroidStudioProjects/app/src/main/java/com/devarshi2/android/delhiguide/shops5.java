package com.devarshi2.android.delhiguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class shops5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shops5);
        String name="When it came into being, the sprawling circular market was the largest of its kind in India. The British believed that the horseshoe-shaped market would prove lucky for the shoppers and the shopkeepers both. This market has two circles. The Inner Circle consists of Blocks A to F. The important shops and showrooms here include Adidas Originals, Allen Solly, Bentley, Bon Ton, Cantabil, Gas, Johnson Watch Company, Kalpana, Lee, Louis Philippe, Neelkanth Jewellers, Nike, Orra, Park Avenue, Pepe, Proline and Fila, Roopchand Jewellers, Snowhite Square, Wills Lifestyle. Mohanlal Sons promises to give you ready or tailored attires to suit every occasion. Known for its quality and good service, you will find here a wide range of shirts, trousers, jackets, suits, kurtas and sherwanis. The Outer Circle consists of Blocks G to P. Showrooms like Digjam, Lacoste, Omega, Rado, RL Exports and TAG Heuer lie in this circle.\n" +
                "\n" +
                "Ganga Ram & Sons in the Regal Building offer an exclusive range of wool and Cashmere suiting from premium brands. Gangoly Bros. have been known for their clocks and watches for generations. At Ivory Mart Jewellers in InterContinental Hotel you get traditional and ethnic pieces, beautifully crafted with hand-picked diamonds. Also check out the small range of handicraft pieces that are studded with precious stones.";
        TextView tv=(TextView)findViewById(R.id.textView1);
        tv.setText(name);
    }
}
