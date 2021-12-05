package com.example.pr7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import ru.startandroid.develop.p0261intentfilter.R;

import static ru.startandroid.develop.p0261intentfilter.R.*;

public class MainActivity extends Activity implements OnClickListener
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.main);
        Button btnTime = (Button) findViewById(id.btnTime);
        Button btnDate = (Button) findViewById(id.btnDate);
        btnTime.setOnClickListener(this);
        btnDate.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case id.btnTime:
                intent = new Intent("ru.startandroid.intent.action.showtime");
                startActivity(intent);
                break;
            case id.btnDate:
                intent = new Intent("ru.startandroid.intent.action.showdate");
                startActivity(intent);
                break;
        }
    }
}
