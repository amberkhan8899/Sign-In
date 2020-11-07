package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText E1 ,E2 ;
    TextView M;
    Button B1;

String[] emails ={"a@gmail.com","b@gmail.com","c@gmail.com","d@gmail.com","e@gmail.com","f@gmail.com","g@gmail.com","h@gmail.com","i@gmail.com","j@gmail.com"};
String[] passwords ={"a","b","c","d","e","f","g","h","i","j"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        E1 = (EditText) findViewById(R.id.email);
        E2 = (EditText) findViewById(R.id.password);
        B1 = (Button) findViewById(R.id.signIn);
        M = (TextView) findViewById(R.id.msg);


    }
    public void OnButtonClick(View v) {
       String e = E1.getText().toString();
       String p = E2.getText().toString();
        for(int i = 0; i < emails.length; i++ ) {
            if(e.matches(emails[i]) && p.matches(passwords[i])){
                M.setText("You have successfully signed in...");
            }else{
                M.setText("Invalid email or password...");
            }

        }
    }
}