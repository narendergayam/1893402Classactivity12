package com.example.a1893402.a1893402_classactivity1;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class ClassActivity1 extends AppCompatActivity {
EditText fname,lname,email,password;
Button submit,exit;
ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class1);

    fname = findViewById(R.id.Fname);
    lname = findViewById(R.id.Lname);
    email = findViewById(R.id.Email);
    password = findViewById(R.id.Pass);
    submit = findViewById(R.id.Sub);
    exit = findViewById(R.id.Exit);
    exit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
            System.exit(0);
        }
    });
 final Toast toast=Toast.makeText(getApplicationContext(),fname.getText().toString(),Toast.LENGTH_SHORT);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("First name ", fname.getText().toString());
                Log.d("Last name ", lname.getText().toString());
                Log.d("Email ", email.getText().toString());
                Log.d("Password ", password.getText().toString());
                toast.setText("Hello! " + fname.getText().toString());
                toast.show();
                Snackbar.make(v, "Submitted Successfully", Snackbar.LENGTH_LONG).show();

                Snackbar snackbar = Snackbar
                        .make(v, "Submitted Successfully", Snackbar.LENGTH_LONG)
                        .setAction("CLEAR", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                fname.setText(null);
                                lname.setText(null);
                                email.setText(null);
                                password.setText(null);
                            }
                        });

            };
        });
    }}

