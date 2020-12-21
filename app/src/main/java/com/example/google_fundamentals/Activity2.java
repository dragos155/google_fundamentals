package com.example.google_fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        EditText e_text=findViewById(R.id.edittxt1);

        TextView t1=findViewById(R.id.txt1);
        t1.setText("Message received");
        TextView t2=findViewById(R.id.txt2);
        t2.setText(getIntent().getStringExtra("mesaj"));


        EditText text=findViewById(R.id.edittxt1);

        findViewById(R.id.but1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("mesaj",text.getText().toString());
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });

    }
}