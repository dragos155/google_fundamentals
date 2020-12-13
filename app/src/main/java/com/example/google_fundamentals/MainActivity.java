package com.example.google_fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email_txt = findViewById(R.id.email);
        EditText phone_txt = findViewById(R.id.phone);
        CheckBox check= (CheckBox) findViewById(R.id.checkbox);
        Button button_btn = findViewById(R.id.button);

        button_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=email_txt.getText().toString();
                String phone=phone_txt.getText().toString();



                if(TextUtils.isEmpty(email)){
                    email_txt.setError("Enter your email!");
                    return;
                }

                if(TextUtils.isEmpty(phone)){
                    phone_txt.setError("Password is Required.");
                    return;
                }

                if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    email_txt.setError("Email is not correct");
                    return;
                }

                if(!Patterns.PHONE.matcher(phone).matches()){
                    phone_txt.setError("Phone is not correct");
                    return;
                }

                if(!check.isChecked())
                {check.setError("bifeaza");
                    return;
                }

                if(Patterns.EMAIL_ADDRESS.matcher(email).matches() && Patterns.PHONE.matcher(phone).matches() && check.isChecked()){

                    Toast.makeText(getApplicationContext(),email+"\n"+phone, Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}



