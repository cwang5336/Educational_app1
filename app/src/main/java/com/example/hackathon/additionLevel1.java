package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class additionLevel1 extends AppCompatActivity {

    int value1;
    int value2;
    int streak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_level1);

        //brings user from to addition choose level
        findViewById(R.id.additionLevel1BackButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(additionLevel1.this, chooseAdditionLevel.class);
                additionLevel1.this.startActivity(intent);
            }
        });

        setNewNumbers();
    }

    public void onSubmitClick (View view){
        TextView Answer = findViewById(R.id.additionLevel1UserInput);
        TextView Attempt = findViewById(R.id.additionLevel1Attempt);
        int userAnswer = Integer.parseInt(Answer.getText().toString());
        if(userAnswer == value1+value2) {
            streak++;
            Attempt.setText("Your streak is now: " + streak);

        } else {
            streak = 0;
            Attempt.setText("The correct answer is: " + (value1+value2) + "Your streak is now: " + streak);
        }
        setNewNumbers();
    }


    private void setNewNumbers () {
        Random r = new Random();
        value1 = r.nextInt(9);
        value2 = r.nextInt(9);
        TextView Number1 = findViewById(R.id.additionLevel1Number1);
        Number1.setText(""+value1);
        TextView Number2 = findViewById(R.id.additionLevel1Number2);
        Number2.setText(""+value2);
        //TextView Attempt = findViewById(R.id.additionLevel1Attempt);
        //Attempt.setText("");

    }


}
