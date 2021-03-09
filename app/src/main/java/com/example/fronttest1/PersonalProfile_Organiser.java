package com.example.fronttest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class PersonalProfile_Organiser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_profile__organiser);
        Button button1;
        button1 = (Button) findViewById(R.id.read_reviews);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalProfile_Organiser.this, Read_my_reviews.class);
                startActivity(intent);
            }

        });
        Button button2;
        button2 = (Button) findViewById(R.id.create_event);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalProfile_Organiser.this, Create_Event.class);
                startActivity(intent);
            }

        });
    }
}
