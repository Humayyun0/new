package com.example.learnarabic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {
    TextView textv;
    Button nextbutton;
    Button quitbutton;

    RadioGroup radioo;
    RadioButton rb1,rb2,rb3,rb4;

    String questions[] = {
            "The letters of Al Jawf are:",
            "The throat letters are:",
            "There are two letters that use the deepest part of the tongue pin articulation. They are:",
            "These letters are pronounced from the top side of the tip of the tongue and the gum line of the two front upper incisors.",
            "These three letters are emitted from the tip of the tongue and the top edge of the two front lower incisors. They are:",
            "Kon say huroof Zaban ki nook or ooper neechay k daanton k qareeb a janay say ada hote hain ??",
            "Is l" +
                    "afz main say Huroof Ash Shafawiyyah kon say hain ? الزلزلة",
            "ق کی آدائگی کے لئے زبان کی جر کو تعلو کے کس حصے پر لگاتے ہیں؟",
    };
    String answers[] = {"ء ه ع ح غ خ","ا - و - ي","ق ك","ت ط د","ز س ص","ز س ص","None of these","Naram Hissay per"};
    String options[] = {

            "ا - و - ي","ن - ه - ع - ح","ا - و","ي - و",
            "ا و ي","ء ه ع ح غ خ","ق ك","ت ط د",
            "ج ي","ج ش","ق","ق ك",
            "ت","ط","ت ط د","د",
            "ز س ص","ز ث ص","س ش ث","ز س ث",
            "ل ن ر","ت د ط","ز س ص","ء ہ",
            "ل","ز","ت","None of these",
            "Naram Hissay per","Sakht Hissay per","Aagay k hissay per","Kahin nahin lagatay"
    };



    public static int marks=0,correct=0,wrong=0;
    int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    final TextView score = (TextView)findViewById(R.id.textView4);
    Intent intent = getIntent();
    String name= intent.getStringExtra("myname");



    nextbutton=(Button)findViewById(R.id.button3);
    quitbutton=(Button)findViewById(R.id.buttonquit);
    textv=(TextView)findViewById(R.id.tvque);

    radioo=(RadioGroup)findViewById(R.id.answersgrp);
    rb1=(RadioButton)findViewById(R.id.radioButton);
    rb2=(RadioButton)findViewById(R.id.radioButton2);
    rb3=(RadioButton)findViewById(R.id.radioButton3);
    rb4=(RadioButton)findViewById(R.id.radioButton4);


        textv.setText(questions[flag]);
        rb1.setText(options[0]);
        rb2.setText(options[1]);
        rb3.setText(options[2]);
        rb4.setText(options[3]);
        nextbutton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            if(radioo.getCheckedRadioButtonId()==-1)
//            {
//                Toast.makeText(getApplicationContext(), "Please Select One Choice", Toast.LENGTH_SHORT).show();
//
//                return;
//            }
            RadioButton uans = (RadioButton) findViewById(radioo.getCheckedRadioButtonId());
            String ansText = uans.getText().toString();

            if(ansText.equals(answers[flag])) {
                correct++;
                Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
            }
            else {
                wrong++;
                Toast.makeText(getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
            }
            flag++;

            if (score != null)
                score.setText("" + correct);

            if(flag<questions.length)
            {
                textv.setText(questions[flag]);
                rb1.setText(options[flag*4]);
                rb2.setText(options[flag*4 +1]);
                rb3.setText(options[flag*4 +2]);
                rb4.setText(options[flag*4 +3]);
            }
            else
            {
                marks=correct;

            }
            radioo.clearCheck();
        }
    });
}
    public void quitQuiz(View view)
    {
        Intent quit = new Intent(this, MainActivity.class);
        startActivity(quit);
    }

}
