package edu.up.cs301.mercer20.guitesting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.ArrayList;

/**
 * Created by AdamMercer on 3/29/18.
 */

public class PlayerView extends SurfaceView {
    private int coins;
    private Rect field1;
    private Rect field2;
    private Rect field3;
    private Rect hand;
    private int width;
    private int height;
    private Bitmap field1Bean;
    private Bitmap field2Bean;
    private Bitmap field3Bean;
    private int numField1Bean;
    private int numField2Bean;
    private int numField3Bean;
    private ArrayList<Bitmap> handCards = new ArrayList<>();
    private int backGroundColor;
    private String playerName = "";

    public PlayerView(Context context) {
        super(context);
        setWillNotDraw(false);
        newGame();
    }

    /** required constructor for SurfaceView*/
    public PlayerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        newGame();
    }

    /** required constructor for SurfaceView*/
    public PlayerView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setWillNotDraw(false);
        newGame();
    }

    public void newGame() {
        field1 = new Rect(3*width/10, 1*height/20+30, 5*width/10, 5*height/20+30);
        field2 = new Rect(3*width/10, 6*height/20+20, 5*width/10, 10*height/20+20);
        field3 = new Rect(3*width/10, 11*height/20+10, 5*width/10, 15*height/20+10);
        hand = new Rect(3*width/10, 16*height/20, 5*width/10, 20*height/20);
    }

    public void setCoins (int initCoins) {
        coins = initCoins;
        invalidate();
    }
    public void setField1Bean(Bitmap bean, int num) {
        field1Bean = bean;
        numField1Bean = num;
        invalidate();
    }
    public void setField2Bean(Bitmap bean, int num) {
        field2Bean = bean;
        numField2Bean = num;
        invalidate();
    }
    public void setField3Bean(Bitmap bean, int num) {
        field3Bean = bean;
        numField3Bean = num;
        invalidate();
    }
    public void setHandCards(ArrayList<Bitmap> initHand) {
        handCards = initHand;
    }

    public void setBackGroundColor(int initBackGround) {
        backGroundColor = initBackGround;
    }

    public void setPlayerName (String initName) {
        playerName = initName;
    }

    @Override
    public void onDraw(Canvas canvas) {
        width = canvas.getWidth();
        height = canvas.getHeight();
        newGame();

        canvas.drawColor(backGroundColor);

        Paint grayPaint = new Paint();
        grayPaint.setColor(Color.LTGRAY);
        canvas.drawRect(10, height/20+20, width-10, height/4+40, grayPaint);
        canvas.drawRect(10, 3*height/10+10, width-10, height/2+30, grayPaint);
        canvas.drawRect(10, 11*height/20, width-10, 3*height/4+20, grayPaint);

        Paint yellowPaint = new Paint();
        yellowPaint.setColor(Color.YELLOW);
        canvas.drawCircle(375, 30, 25, yellowPaint);

        Paint blackPaint = new Paint();
        blackPaint.setColor(Color.BLACK);
        blackPaint.setTextSize(40);
        canvas.drawText(""+coins, 352, 45, blackPaint);

        blackPaint.setTextSize(50);
        canvas.drawText(playerName, 150, 50, blackPaint);

        blackPaint.setTextSize(75);

        if(numField1Bean != 0) {
            canvas.drawBitmap(field1Bean, null, field1, null);
            canvas.drawText(""+numField1Bean, width/2+40, 4*height/20, blackPaint);
        }
        if(numField2Bean != 0) {
            canvas.drawBitmap(field2Bean, null, field2, null);
            canvas.drawText(""+numField2Bean, width/2+40, 9*height/20, blackPaint);
        }
        if(numField3Bean != 0) {
            canvas.drawBitmap(field3Bean, null, field3, null);
            canvas.drawText(""+numField3Bean, width/2+40, 14*height/20, blackPaint);
        }

        if(handCards.size() != 0) {
            for(int i = 0; i<handCards.size(); i++){
                canvas.drawBitmap(handCards.get(i), null, new Rect(10+i*width/10, 16*height/20, (i+2)*width/10, height), null);
            }
        }
    }
}
