package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class subtractionLevel1 extends AppCompatActivity {

    int value1;
    int value2;
    int streak = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction_level1);

        //brings user from to subtraction choose level
        findViewById(R.id.subtractionLevel1BackButton).setOnClickListener(new
        View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(subtractionLevel1.this, chooseSubtractionLevel.class);
                subtractionLevel1.this.startActivity(intent);
            }
        });

        setNewNumbers();
    }

    public void onSubmitClick (View view){
        TextView Answer = findViewById(R.id.subtractionLevel1UserInput);
        TextView Attempt = findViewById(R.id.subtractionLevel1Attempt);
        int userAnswer = Integer.parseInt(Answer.getText().toString());
        if(userAnswer == value1-value2) {
            streak++;
            if(streak == 1){
                Attempt.setText("Correct! " + " Your streak is now: " + streak);
            } else{
                Attempt.setText("Your streak is now: " + streak);
            }
        } else {
            streak = 0;
            Attempt.setText("The correct answer is: " + (value1-value2) + " Your streak is now: " + streak);
        }

        setNewNumbers();
    }

    private void setNewNumbers () {
        Random r = new Random();
        value1 = r.nextInt(9);
        value2 = r.nextInt(9);
        TextView Number1 = findViewById(R.id.subtractionLevel1Number1);
        Number1.setText(""+value1);
        TextView Number2 = findViewById(R.id.subtractionLevel1Number2);
        Number2.setText(""+value2);
    }

}
