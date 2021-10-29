package ir.sorapp.game_num_check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.WindowManager;

public class logo_ac extends AppCompatActivity
{



    //Global Variables Start
    CountDownTimer timer;
    //Global Variables End





    //Main Function Start
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo_ac);

        timer=new CountDownTimer(1000,10000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(),menu_ac.class));
                timer.cancel();
            }
        }.start();

    }
    //Main Function End



}