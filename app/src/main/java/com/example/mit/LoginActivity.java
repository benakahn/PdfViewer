package com.example.mit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Log;
    private int counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText)findViewById(R.id.etName);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Log = (Button)findViewById(R.id.btnlog);
        Info.setText("No of attempts remaining : 5");
        Log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });
    }
    private void validate(String userName,String userPassword){
        final String userlength = Name.getText().toString();
        final String passlen = Password.getText().toString();

        if((userName.equals("Benaka") ) && (userPassword.equals("1234"))){
            Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(intent);
        }else{
            counter--;
            Info.setText("No of attempts reamaining : "+ String.valueOf(counter));

            if(counter == 0){
                Log.setEnabled(false);
            }
        }
    }
}
