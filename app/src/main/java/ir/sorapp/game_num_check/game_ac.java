package ir.sorapp.game_num_check;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class game_ac extends AppCompatActivity
{

    //Global Variabls Start
    int Random_Num;
    int try_count;
    TextView try_count_label;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    //Global Variabls End



    //Main Function Start
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_ac);
        refresh();
        Get_Fill_Buttons();
    }
    //Main Function End




    //Get Generate Main Random Num Start
    public void Get_Generate_Random_Num()
    {
        Random rnd=new Random();
        Random_Num=rnd.nextInt(100);
    }
    //Get Generate Main Random Num End




    //Get Generate Random Num For Buttons Start
    public void Get_Fill_Buttons()
    {

        SharedPreferences prefs = getSharedPreferences("Code", MODE_PRIVATE);
        try_count = prefs.getInt("Count", 3);

        try_count_label.setText(try_count+"");
        Get_Generate_Random_Num();

        Button []btns={btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};

        Random Random=new Random();
        int Button_Random=Random.nextInt(9);

        for (int i=0;i<btns.length;i++)
        {
            if(i==Button_Random)
            {
                btns[i].setText(Random_Num + "");
            }
            else
            {
                Random Random_For_Btns = new Random();
                int Random_Bnt = Random_For_Btns.nextInt(100);
                btns[i].setText(Random_Bnt + "");
            }
        }

    }
    //Get Generate Random Num For Buttons End




    //Get Click Button Start
    public void OnClick_Random_Buttons(View v)
    {
        Button Clicked_Btn=(Button) findViewById(v.getId());

        if(Clicked_Btn.getText().toString().trim().equals(Random_Num+"".trim()))
        {
            Clicked_Btn.setBackgroundColor(Clicked_Btn.getContext().getResources().getColor(R.color.true_color));
            Clicked_Btn.setTextColor(Clicked_Btn.getContext().getResources().getColor(R.color.white));
            startActivity(new Intent(getApplicationContext(),you_win_ac.class));
        }
        else
        {
            Clicked_Btn.setBackgroundColor(Clicked_Btn.getContext().getResources().getColor(R.color.false_color));
            Clicked_Btn.setTextColor(Clicked_Btn.getContext().getResources().getColor(R.color.white));
            try_count--;
            if(try_count<=0)
            {
                startActivity(new Intent(getApplicationContext(),you_lose_ac.class));
            }
        }

        try_count_label.setText(try_count+"");

    }
    //Get Click Button End




    //Get All Elements Of Page Start
    public void refresh()
    {
        btn1=(Button) findViewById(R.id.btn_1);
        btn2=(Button) findViewById(R.id.btn_2);
        btn3=(Button) findViewById(R.id.btn_3);
        btn4=(Button) findViewById(R.id.btn_4);
        btn5=(Button) findViewById(R.id.btn_5);
        btn6=(Button) findViewById(R.id.btn_6);
        btn7=(Button) findViewById(R.id.btn_7);
        btn8=(Button) findViewById(R.id.btn_8);
        btn9=(Button) findViewById(R.id.btn_9);

        try_count_label=(TextView) findViewById(R.id.try_count_label);
    }
    //Get All Elements Of Page End


}