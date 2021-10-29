package ir.sorapp.game_num_check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class help_ac extends AppCompatActivity
{

    //Main Function Start
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_ac);
    }
    //Main Function End


    //Get Back Start
    public void OnBack_Help(View v)
    {
        onBackPressed();
    }
    //Get Back End



}