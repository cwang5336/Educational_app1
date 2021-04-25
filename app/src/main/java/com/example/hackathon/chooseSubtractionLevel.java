package com.example.hackathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chooseSubtractionLevel extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction_level_menu);

        //brings user back to main page when back button is clicked
        findViewById(R.id.subtractionBackButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseSubtractionLevel.this, chooseCategory.class);
                chooseSubtractionLevel.this.startActivity(intent);
            }
        });

        //brings user to subtraction level 1
        findViewById(R.id.subtractionLevel1Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseSubtractionLevel.this, subtractionLevel1.class);
                chooseSubtractionLevel.this.startActivity(intent);
            }
        });

    }
}
