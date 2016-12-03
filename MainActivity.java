package vera.moon.com.c2_timers;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public Handler handler;

    public int variable = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Another type of timer
        new CountDownTimer(10000,1000){
            public void onTick(long mili){
                //Countdown is running
                Log.d("Time left",""+mili/1000);
            }

            public void onFinish(){
                //Count is finished (after 10 seconds)
                Log.d("Time over","Yei");
            }
        }.start();

        //allows run code in runnable run every time
        /*handler = new Handler();

        //Anothar kinf of thread
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Log.i("Run","Running every second");

                //To stop runnable every t seconds
                handler.postDelayed(this,1000);

            }
        };

        //Start runnable
        handler.post(runnable);*/
    }
}
