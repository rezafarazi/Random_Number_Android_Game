package ir.sorapp.game_num_check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class you_lose_ac extends AppCompatActivity
{


    //Main Function Start
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.you_lose_ac);
    }
    //Main Function End



    //Get On Click Back Button Start
    @Override
    public void onBackPressed()
    {
        startActivity(new Intent(getApplicationContext(),menu_ac.class));
    }
    //Get On Click Back Button End




    //On Click Agin Button Start
    public void OnClick_Agin(View v)
    {
        startActivity(new Intent(getApplicationContext(),game_ac.class));
    }
    //On Click Agin Button End



    //On Click Agin Button Start
    public void OnClick_Menu(View v)
    {
        startActivity(new Intent(getApplicationContext(),menu_ac.class));
    }
    //On Click Agin Button End




}