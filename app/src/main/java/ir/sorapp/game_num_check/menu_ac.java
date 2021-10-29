package ir.sorapp.game_num_check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_ac extends AppCompatActivity
{


    //Main Function Start
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_ac);
    }
    //Main Function End



    //Exit Button Start
    public void OnExit_Click(View v)
    {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }
    //Exit Button End




    //Get Start Game Start
    public void OnStart_Click(View v)
    {
        startActivity(new Intent(getApplicationContext(),game_ac.class));
    }
    //Get Start Game End





    //Get Start Game Start
    public void OnHelp_Click(View v)
    {
        startActivity(new Intent(getApplicationContext(),help_ac.class));
    }
    //Get Start Game End




    //Get Start Game Start
    public void OnSettings_Click(View v)
    {
        startActivity(new Intent(getApplicationContext(),settings_ac.class));
    }
    //Get Start Game End





    //Get On Click Back Button Start
    @Override
    public void onBackPressed()
    {
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }
    //Get On Click Back Button End



}