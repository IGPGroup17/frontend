package com.example.fronttest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class PersonalProfile_User extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button;
        button = (Button) findViewById(R.id.delete_account);

        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PersonalProfile_User.this, PersonalProfile_Organiser.class);
                startActivity(intent);
            }

        });

    }



    }
