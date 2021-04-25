package com.example.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class additionLevel2 extends AppCompatActivity {

    int value1;
    int value2;
    int streak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition_level2);

        //brings user from to addition choose level
        findViewById(R.id.additionLevel2BackButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(additionLevel2.this, chooseAdditionLevel.class);
                additionLevel2.this.startActivity(intent);
            }
        });

        setNewNumbers();
    }

    public void onSubmitClick (View view){
        TextView Answer = findViewById(R.id.additionLevel2UserInput);
        TextView Attempt = findViewById(R.id.additionLevel2Attempt);
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
        value1 = r.nextInt(99);
        value2 = r.nextInt(99);
        TextView Number1 = findViewById(R.id.additionLevel2Number1);
        TextView Number2 = findViewById(R.id.additionLevel2Number2);
        if((value1 < 10 && value2 <10) || (value1 >= 10 && value2 >= 10)){
            Number1.setText(""+value1);
            Number2.setText(""+value2);
        } else if(value1 >= 10 && value2 <10){
            Number1.setText(""+value1);
            Number2.setText(" "+value2);
        } else if(value1 < 10 && value2 >=10){
            Number1.setText(" "+value1);
            Number2.setText(""+value2);
        }
    }

}
