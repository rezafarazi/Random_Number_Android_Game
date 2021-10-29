package ir.sorapp.game_num_check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class settings_ac extends AppCompatActivity
{


    //Main Function Start
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_ac);
    }
    //Main Function End



    //Get OnClick Set Settigns Start
    public void OnClick_Set_Settings(View v)
    {
        EditText editText=(EditText) findViewById(R.id.count_setting);
        if(!editText.getText().equals("")) {
            SharedPreferences.Editor editor = getSharedPreferences("Code", MODE_PRIVATE).edit();
            editor.putInt("Count", Integer.parseInt(editText.getText().toString()));
            editor.apply();
        }
        startActivity(new Intent(getApplicationContext(),menu_ac.class));
    }
    //Get OnClick Set Settigns End




}