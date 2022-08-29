package com.example.detailmoviejava.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.detailmoviejava.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edUser, edPass;
    Button btLogin, btForgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        checkLogin();
    }

    private void initView() {
        edUser = findViewById(R.id.edUser);
        edPass = findViewById(R.id.edPass);
        btLogin = findViewById(R.id.btLogin);
        btForgot = findViewById(R.id.btForgot);
        btLogin.setOnClickListener(this);
        btForgot.setOnClickListener(this);
    }

    private void goMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void saveData(String username) {
        SharedPreferences pref = getSharedPreferences("MOVIE", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("username", username);
        editor.commit();
    }

    private void checkLogin() {
        SharedPreferences pref = getSharedPreferences("MOVIE", MODE_PRIVATE);
        String username = pref.getString("username", null);
        if (username != null) {
            goMain();
            finish();
        }
    }

    private void onLogin() {
        String username = edUser.getText().toString();
        String password = edPass.getText().toString();
        if (username.equalsIgnoreCase("fpt") && password.equalsIgnoreCase("123")){
            //Login success
            //Save data to local
            saveData(username);
            goMain();
        }else {
            Toast.makeText(this, "Wrong user", Toast.LENGTH_SHORT).show();
        }
    }

    private void onForgot() {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btLogin:
                onLogin();
                break;
            case R.id.btForgot:
                onForgot();
                break;
            default:
                break;
        }
    }
}