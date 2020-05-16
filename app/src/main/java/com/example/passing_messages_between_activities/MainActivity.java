package com.example.passing_messages_between_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText message;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        message=(EditText)findViewById(R.id.etmessage);
        submit=(Button) findViewById(R.id.btnsub);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=message.getText().toString();
                Intent i=new Intent(getBaseContext(),second.class);
                i.putExtra("msg1",msg);
                startActivity(i);
            }
        });
    }
}
