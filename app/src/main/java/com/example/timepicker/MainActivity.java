package com.example.timepicker;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    Button button;

    RangeTimePickerDialog garoodaTimePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.btnTimer);





        garoodaTimePickerDialog =new RangeTimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {

            }
        },15,22,false);
        garoodaTimePickerDialog.setMin(10,30);
        garoodaTimePickerDialog.setMax(13,30);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                garoodaTimePickerDialog.show();
            }
        });
    }
}
