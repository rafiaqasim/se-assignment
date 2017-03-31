package com.example.user.shinstitute;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class Teacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_teacher);

        ///////////////////////teacher name from backend


        String name = "Mirza Maaz Baig";
        TextView Teacher_name = (TextView) findViewById(R.id.Teachername);

        Teacher_name.setText(name);
        ///////////////////////////////////////
        Button buttL = (Button) findViewById(R.id.butuploadLec);
        buttL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if ("pass".equals("etPassword")) {
                Intent uploadlectIntent = new Intent(Teacher.this, uploadelecture.class);
                Teacher.this.startActivity(uploadlectIntent);
                //}
            }
        });
        Button buttR = (Button) findViewById(R.id.button2);
        buttR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if ("pass".equals("etPassword")) {
                Intent uploadmcqsIntent = new Intent(Teacher.this, uploadmcqs.class);
                Teacher.this.startActivity(uploadmcqsIntent);
                //}
            }

        });

        ///logout button remaining//////
    }
}



