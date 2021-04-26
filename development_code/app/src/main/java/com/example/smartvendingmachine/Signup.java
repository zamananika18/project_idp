package com.example.smartvendingmachine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class Signup extends AppCompatActivity {
    public Button button3;
    EditText editTextusername, editTextmobile, editTextemail, editTextpassword;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextusername = (EditText) findViewById(R.id.username);
        editTextemail = (EditText) findViewById(R.id.email);
        editTextmobile = (EditText) findViewById(R.id.mobile);
        editTextpassword = (EditText) findViewById(R.id.password);

        mAuth = FirebaseAuth.getInstance();


        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registeruser();
            }
        });
    }


    private void registeruser(){
        String username = editTextusername.getText().toString().trim();
        String mobile = editTextmobile.getText().toString().trim();
        String email = editTextemail.getText().toString().trim();
        String password = editTextpassword.getText().toString().trim();
        if(email.isEmpty()) {
            editTextemail.setError("Email is required");
            editTextemail.requestFocus();
            return;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextemail.setError("Please enter a valid email");
            editTextemail.requestFocus();
            return;
        }
        if(username.isEmpty()) {
            editTextusername.setError("Username is required");
            editTextusername.requestFocus();
            return;
        }
        if(mobile.isEmpty()) {
            editTextmobile.setError("Mobile number is required");
            editTextmobile.requestFocus();
            return;
        }
        if (!(mobile.length() == 11)){
            editTextmobile.setError("Mobile Number is not correct");
            editTextmobile.requestFocus();
            return;
        }
        if(password.isEmpty()) {
            editTextpassword.setError("Password is required");
            editTextpassword.requestFocus();
            return;
        }
        if (password.length()<8){
            editTextpassword.setError("Minimum length of password should be 8");
            editTextpassword.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()){
                    Toast.makeText(getApplicationContext(), "User Registered Successful", Toast.LENGTH_SHORT).show();
                    Intent intent= new Intent(Signup.this,Login.class);
                    startActivity(intent);
                }
                else{
                    if (task.getException() instanceof FirebaseAuthUserCollisionException){
                        Toast.makeText(getApplicationContext(), "You are already registered", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}