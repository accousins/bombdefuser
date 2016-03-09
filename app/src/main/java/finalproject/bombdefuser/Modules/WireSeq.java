package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;

import finalproject.bombdefuser.R;

public class WireSeq extends AppCompatActivity {

    Button updateCuts;
    TextView redToCut, blueToCut, blackToCut;

    NumberPicker redOcc, blueOcc, blackOcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wire_seq);

        //Button updateCuts = (Button) findViewById(R.id.updateCuts);

        redToCut = (TextView) findViewById(R.id.redToCut);
        blueToCut = (TextView) findViewById(R.id.blueToCut);
        blackToCut = (TextView) findViewById(R.id.blackToCut);

        redOcc = (NumberPicker) findViewById(R.id.redOcc);
        blueOcc = (NumberPicker) findViewById(R.id.blueOcc);
        blackOcc = (NumberPicker) findViewById(R.id.blackOcc);

        redOcc.setMinValue(0);
        redOcc.setMaxValue(9);
        redOcc.setWrapSelectorWheel(false);

        blueOcc.setMinValue(0);
        blueOcc.setMaxValue(9);
        blueOcc.setWrapSelectorWheel(false);

        blackOcc.setMinValue(0);
        blackOcc.setMaxValue(9);
        blackOcc.setWrapSelectorWheel(false);

    }

    public void redGetCut(){
        switch(redOcc.getValue()){
            case 0:
                break;
            case 1:
                redToCut.setText("C");
                break;
            case 2:
                redToCut.setText("B");
                break;
            case 3:
                redToCut.setText("A");
                break;
            case 4:
                redToCut.setText("A or C");
                break;
            case 5:
                redToCut.setText("B");
                break;
            case 6:
                redToCut.setText("A or C");
                break;
            case 7:
                redToCut.setText("A, B, or C");
                break;
            case 8:
                redToCut.setText("A or B");
                break;
            case 9:
                redToCut.setText("B");
                break;
        }
    }

    public void blueGetCut(){
        switch(blueOcc.getValue()){
            case 0:
                break;
            case 1:
                blueToCut.setText("B");
                break;
            case 2:
                blueToCut.setText("A or C");
                break;
            case 3:
                blueToCut.setText("B");
                break;
            case 4:
                blueToCut.setText("A");
                break;
            case 5:
                blueToCut.setText("B");
                break;
            case 6:
                blueToCut.setText("B or C");
                break;
            case 7:
                blueToCut.setText("C");
                break;
            case 8:
                blueToCut.setText("A or C");
                break;
            case 9:
                blueToCut.setText("A");
                break;
        }
    }

    public void blackGetCut(){
        switch(blackOcc.getValue()){
            case 0:
                break;
            case 1:
                blackToCut.setText("A, B, or C");
                break;
            case 2:
                blackToCut.setText("A or C");
                break;
            case 3:
                blackToCut.setText("B");
                break;
            case 4:
                blackToCut.setText("A or C");
                break;
            case 5:
                blackToCut.setText("B");
                break;
            case 6:
                blackToCut.setText("B or C");
                break;
            case 7:
                blackToCut.setText("A or B");
                break;
            case 8:
                blackToCut.setText("C");
                break;
            case 9:
                blackToCut.setText("C");
                break;
        }
    }

    public void getCuts(View v){
        redGetCut();
        blueGetCut();
        blackGetCut();
    }

    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v){
        finish();
    }
}
