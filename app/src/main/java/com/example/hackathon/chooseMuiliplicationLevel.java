package com.example.hackathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class chooseMuiliplicationLevel extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muiliplication_level_menu);

        //brings user back to main page when back button is clicked
        findViewById(R.id.multiplicationBackButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseMuiliplicationLevel.this, chooseCategory.class);
                chooseMuiliplicationLevel.this.startActivity(intent);
            }
        });

        //brings user to multiplication level 1
        findViewById(R.id.multiplicationLevel1Button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(chooseMuiliplicationLevel.this, multiplicationLevel1.class);
                chooseMuiliplicationLevel.this.startActivity(intent);
            }
        });


    }
}
