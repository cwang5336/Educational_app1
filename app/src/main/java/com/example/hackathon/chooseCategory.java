package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class chooseCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_catagory);

        //Button clicked to go to addition level choose
        findViewById(R.id.addMenuButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseCategory.this, chooseAdditionLevel.class);
                //includes the function that brings back information from AddJavaActivity.java
                chooseCategory.this.startActivity(intent);
            }
        });

        //Button clicked to go to Subtraction level choose
        findViewById(R.id.subtractionMenuButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseCategory.this, chooseSubtractionLevel.class);
                //includes the function that brings back information from AddJavaActivity.java
                chooseCategory.this.startActivity(intent);
            }
        });

        //Button clicked to go to Multiplication level choose
        findViewById(R.id.multiplicationMenuButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseCategory.this, chooseMuiliplicationLevel.class);
                //includes the function that brings back information from AddJavaActivity.java
                chooseCategory.this.startActivity(intent);
            }
        });

        //Button clicked to go to Division level choose
        findViewById(R.id.divisionMenuButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseCategory.this, chooseDivisionLevel.class);
                //includes the function that brings back information from AddJavaActivity.java
                chooseCategory.this.startActivity(intent);
            }
        });


    }//end of onCreate
}
