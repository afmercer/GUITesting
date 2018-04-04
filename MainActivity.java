package edu.up.cs301.mercer20.guitesting;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap redBean = BitmapFactory.decodeResource(getResources(), R.drawable.redbean);
        Bitmap greenBean = BitmapFactory.decodeResource(getResources(), R.drawable.greenbean);
        Bitmap chiliBean = BitmapFactory.decodeResource(getResources(), R.drawable.chilibean);
        Bitmap waxBean = BitmapFactory.decodeResource(getResources(), R.drawable.waxbean);
        Bitmap gardenBean = BitmapFactory.decodeResource(getResources(), R.drawable.gardenbean);
        Bitmap blackEyedBean = BitmapFactory.decodeResource(getResources(), R.drawable.blackeyedbean);
        Bitmap coffeeBean = BitmapFactory.decodeResource(getResources(), R.drawable.coffeebean);
        Bitmap cocoaBean = BitmapFactory.decodeResource(getResources(), R.drawable.cocoabean);
        Bitmap soyBean = BitmapFactory.decodeResource(getResources(), R.drawable.soybean);
        Bitmap stinkBean = BitmapFactory.decodeResource(getResources(), R.drawable.stinkbean);
        Bitmap blueBean = BitmapFactory.decodeResource(getResources(), R.drawable.bluebean);
        Bitmap cardBack = BitmapFactory.decodeResource(getResources(), R.drawable.cardback);


        PlayerView test1 = (PlayerView) findViewById(R.id.surfaceViewPlayer1);
        test1.setBackGroundColor(Color.BLUE);
        test1.setPlayerName("Player 1");
        test1.setField1Bean(soyBean, 6);
        test1.setField2Bean(cocoaBean, 1);
        test1.setCoins(13);
        ArrayList<Bitmap> hand1 = new ArrayList<>();
        for(int i = 0; i<4; i++) {
            hand1.add(cardBack);
        }
        hand1.add(stinkBean);
        hand1.add(greenBean);
        test1.setHandCards(hand1);

        PlayerView test2 = (PlayerView) findViewById(R.id.surfaceViewPlayer2);
        test2.setBackGroundColor(Color.GREEN);
        test2.setPlayerName("Player 2");
        test2.setField1Bean(redBean, 4);
        test2.setField2Bean(greenBean, 2);
        test2.setField3Bean(chiliBean, 9);
        test2.setCoins(5);
        ArrayList<Bitmap> hand2 = new ArrayList<>();
        for(int i = 0; i<7; i++) {
            hand2.add(cardBack);
        }
        test2.setHandCards(hand2);

        PlayerView test3 = (PlayerView) findViewById(R.id.surfaceViewPlayer3);
        test3.setBackgroundColor(Color.RED);
        test3.setPlayerName("Player 3");
        test3.setField1Bean(coffeeBean, 5);
        test3.setField2Bean(waxBean, 11);
        test3.setCoins(10);
        ArrayList<Bitmap> hand3 = new ArrayList<>();
        for(int i = 0; i<3; i++) {
            hand3.add(cardBack);
        }
        hand3.add(blueBean);
        test3.setHandCards(hand3);

        PlayerView test4 = (PlayerView)findViewById(R.id.surfaceViewPlayer4);
        test4.setBackgroundColor(Color.CYAN);
        test4.setPlayerName("Player 4");
        test4.setField1Bean(gardenBean, 2);
        test4.setField2Bean(blackEyedBean, 4);
        test4.setCoins(7);
        ArrayList<Bitmap> hand4 = new ArrayList<>();
        for(int i = 0; i<8; i++) {
            hand4.add(cardBack);
        }
        test4.setHandCards(hand4);

        HandView handTest = (HandView)findViewById(R.id.surfaceViewHand);
        ArrayList<Bitmap> hand = new ArrayList<>();
        hand.add(blueBean);
        hand.add(greenBean);
        hand.add(redBean);
        hand.add(chiliBean);
        hand.add(blackEyedBean);
        hand.add(soyBean);
        handTest.setHand(hand);
    }
}
