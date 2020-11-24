package com.example.mymcq;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionBank mqLib = new QuestionBank();
    private TextView scoreView;
    private TextView questionView;
    private Button button1, button2, button3, button4;

    private String answer;
    private int totalScore = 0;
    private int question_number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreView = (TextView) findViewById(R.id.textView3);
        questionView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);

        updateQuestion();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button1.getText() == answer) {
                    totalScore++;
                    updateScore (totalScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }

                else {
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button2.getText() == answer) {
                    totalScore++;
                    updateScore (totalScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }

                else {
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button3.getText() == answer) {
                    totalScore++;
                    updateScore (totalScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                }

                else {
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

    }

    private void updateQuestion() {
        if (question_number < 7) {
            questionView.setText(mqLib.getQuestionBank(question_number));
            button1.setText(mqLib.getChoice0(question_number));
            button2.setText(mqLib.getChoice1(question_number));
            button3.setText(mqLib.getChoice2(question_number));
            answer = mqLib.getcorrect_answer(question_number);
        }
        else {
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
        }
        question_number++;
    }


    public void updateScore(int totalScore) {
        scoreView.setText(""+totalScore);
    }
}
