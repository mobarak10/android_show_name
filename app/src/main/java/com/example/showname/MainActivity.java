package com.example.showname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView myText;
    private EditText myname;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.shownamebtn);
        myText = findViewById(R.id.shownameview);
        myname = findViewById(R.id.writename);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String name = myname.getText().toString();
            myText.setText("hello " + name);
            }
        });
    }
}
