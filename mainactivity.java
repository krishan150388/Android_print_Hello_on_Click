package com.example.sam.eve;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;


import static com.example.sam.eve.R.layout.activity_main;

public class MainActivity extends Activity {


    Button button1;
    EditText text1;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        text1=(EditText)findViewById(R.id.text1);

    }


    public void onClick(View v) {


        text1.setText("Hello Krishan");


    }


}

