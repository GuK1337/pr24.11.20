package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView string;
    EditText login,password;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        string = findViewById(R.id.string);
        login = findViewById(R.id.loginarea);
        password = findViewById(R.id.passwordarea);
        if (savedInstanceState != null) {
            s = savedInstanceState.getString("str");
            string.setText(s);
        }
    }
    @Override
    public void onSaveInstanceState(Bundle bundle) {

        super.onSaveInstanceState(bundle);
        bundle.putString("str", s);
    }
    public void onButtonClick(View view) {
        s = getString (R.string.loginpassword,login.getText().toString(),password.getText().toString());
        string.setText(s);
    }
}