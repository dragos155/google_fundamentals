package com.example.google_fundamentals;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity1 extends AppCompatActivity {
    public static final int REGUEST_CODE = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        EditText e_text = findViewById(R.id.edittxt1);
        findViewById(R.id.but1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1.this, Activity2.class);
                intent.putExtra("mesaj", e_text.getText().toString());
                startActivityForResult(intent, REGUEST_CODE);
            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        TextView t1 = findViewById(R.id.txt1);
        TextView t2 = findViewById(R.id.txt2);
        if (requestCode == REGUEST_CODE) {
            if (resultCode == Activity.RESULT_OK) {
                if (data != null) {
                    String result = data.getStringExtra("mesaj");
                    t1.setText("Reply received");
                    t2.setText(result);
                }

            }

        }
    }
}