package com.example.passing_messages_between_activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second extends AppCompatActivity {
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        message=(TextView)findViewById(R.id.tvmsg);
        setmessage();
    }
    private void setmessage(){
        Bundle extra=getIntent().getExtras();
        String msg=extra.getString("msg1");
        message.setText(msg);
    }
}
