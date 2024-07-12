package com.example.finalproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin;
    private TextInputEditText txtUsername;
    private TextInputEditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setClickListener();
    }

    private void init(){
        btnLogin = findViewById(R.id.btnlogin);
        txtUsername = findViewById(R.id.loginUsername);
        txtPassword = findViewById(R.id.loginPassword);
    }

    private void setClickListener(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                // very important!!
                if(!username.equals("TIP")){
                    txtUsername.setError("No account found");
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!password.equals("12345")){
                    txtPassword.setError("Incorrect password");
                    Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    // SHORTCUT
    //private void CreateToast(String message){
    //Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    //}
}
