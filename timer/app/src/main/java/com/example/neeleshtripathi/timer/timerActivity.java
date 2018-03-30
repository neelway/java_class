package com.example.neeleshtripathi.timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class timerActivity extends AppCompatActivity {


    private TextView countdownText;
    private  Button CountdownButton;
    private CountDownTimer CountDownTimer;
    private long TimeleftMilles=60000;
    private  Boolean TimerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        countdownText=findViewById(R.id.countDown);
        CountdownButton=findViewById(R.id.start1);
        CountdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StartStop();
            }
        });

            }
    public void StartStop()
    {
        if(TimerRunning){
            StopTimer();
        }
        else {
            StartTimer();
        }
    }
    public void StartTimer(){
        CountDownTimer = new CountDownTimer(TimeleftMilles,1000) {
            @Override
            public void onTick(long l) {
                TimeleftMilles = l;
                UpadteTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
        CountdownButton.setText("Pause");
        TimerRunning=true;
    }    public void StopTimer(){
        CountDownTimer.cancel();
        CountdownButton.setText("Start");
        TimerRunning=false;
    }
    public void UpadteTimer(){
        int mintus=(int)TimeleftMilles/6000;
        int sec=(int)TimeleftMilles%6000/1000;
        String TimeLeftText;
        TimeLeftText=""+mintus;
        TimeLeftText +=":";
        if(sec<10)TimeLeftText+=0;
        TimeLeftText +=sec;
        countdownText.setText(TimeLeftText);
    }

}
