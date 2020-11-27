package com.galvarado.scoreappsport;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Integer rs1 = new Integer(0);
    Integer rs2 = new Integer(0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button surf_btn_1 = (Button)findViewById(R.id.surf1_vote);
        Button surf_btn_2 = (Button)findViewById(R.id.surf2_vote);
        TextView result_1 = (TextView)findViewById(R.id.result_1);
        TextView result_2 = (TextView)findViewById(R.id.result_2);

        surf_btn_1.setOnClickListener(
                view -> result_1.setText(String.valueOf(rs1++))
        );
        surf_btn_2.setOnClickListener(
                view -> result_2.setText(String.valueOf(rs2++))
        );
    }
}