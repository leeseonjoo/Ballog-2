package com.futsal.traininglog.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.futsal.traininglog.R;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView start = findViewById(R.id.startTrainingLog);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TrainingLogActivity.class);
                startActivity(intent);
            }
        });
    }
}
