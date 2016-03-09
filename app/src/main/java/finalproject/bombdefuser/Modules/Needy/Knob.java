package finalproject.bombdefuser.Modules.Needy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import finalproject.bombdefuser.R;

public class Knob extends AppCompatActivity {

    CheckBox led_1, led_2, led_3, led_4, led_5, led_6, led_7, led_8, led_9, led_10, led_11, led_12;

    TextView knobPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knob);
    }

    public void getPos(View v) {
        //Up cases
        if (led_1.isChecked() == false && led_2.isChecked() == false && led_3.isChecked() == true && led_4.isChecked() == false &&
                led_5.isChecked() == true && led_6.isChecked() == true && led_7.isChecked() == true && led_8.isChecked() == true &&
                led_9.isChecked() == true && led_10.isChecked() == true && led_11.isChecked() == false && led_12.isChecked() == true) {
            knobPos.setText("Up");
        }
        if (led_1.isChecked() == true && led_2.isChecked() == false && led_3.isChecked() == true && led_4.isChecked() == false &&
                led_5.isChecked() == true && led_6.isChecked() == false && led_7.isChecked() == false && led_8.isChecked() == true &&
                led_9.isChecked() == true && led_10.isChecked() == false && led_11.isChecked() == true && led_12.isChecked() == true) {
            knobPos.setText("Up");
        }

        //Down cases
        if (led_1.isChecked() == false && led_2.isChecked() == true && led_3.isChecked() == true && led_4.isChecked() == false &&
                led_5.isChecked() == false && led_6.isChecked() == true && led_7.isChecked() == true && led_8.isChecked() == true &&
                led_9.isChecked() == true && led_10.isChecked() == true && led_11.isChecked() == false && led_12.isChecked() == true) {
            knobPos.setText("Down");
        }
        if (led_1.isChecked() == true && led_2.isChecked() == false && led_3.isChecked() == true && led_4.isChecked() == false &&
                led_5.isChecked() == true && led_6.isChecked() == false && led_7.isChecked() == false && led_8.isChecked() == true &&
                led_9.isChecked() == false && led_10.isChecked() == false && led_11.isChecked() == false && led_12.isChecked() == true) {
            knobPos.setText("Down");
        }

        //Left cases
        if (led_1.isChecked() == false && led_2.isChecked() == false && led_3.isChecked() == false && led_4.isChecked() == false &&
                led_5.isChecked() == true && led_6.isChecked() == false && led_7.isChecked() == true && led_8.isChecked() == false &&
                led_9.isChecked() == false && led_10.isChecked() == true && led_11.isChecked() == true && led_12.isChecked() == true) {
            knobPos.setText("Left");
        }
        if (led_1.isChecked() == false && led_2.isChecked() == false && led_3.isChecked() == false && led_4.isChecked() == false &&
                led_5.isChecked() == true && led_6.isChecked() == false && led_7.isChecked() == false && led_8.isChecked() == false &&
                led_9.isChecked() == false && led_10.isChecked() == false && led_11.isChecked() == true && led_12.isChecked() == false) {
            knobPos.setText("Left");
        }

        //Right cases
        if (led_1.isChecked() == true && led_2.isChecked() == false && led_3.isChecked() == true && led_4.isChecked() == true &&
                led_5.isChecked() == false && led_6.isChecked() == false && led_7.isChecked() == true && led_8.isChecked() == true &&
                led_9.isChecked() == true && led_10.isChecked() == false && led_11.isChecked() == true && led_12.isChecked() == false) {
            knobPos.setText("Right");
        }
        if (led_1.isChecked() == true && led_2.isChecked() == false && led_3.isChecked() == true && led_4.isChecked() == true &&
                led_5.isChecked() == true && led_6.isChecked() == true && led_7.isChecked() == true && led_8.isChecked() == true &&
                led_9.isChecked() == true && led_10.isChecked() == false && led_11.isChecked() == true && led_12.isChecked() == false) {
            knobPos.setText("Right");
        }
    }

    public void differentClick(View v){
        finish();
    }
    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }
}
