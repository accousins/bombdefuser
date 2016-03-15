package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import finalproject.bombdefuser.R;

public class Sequence extends AppCompatActivity {

    TextView instruct;
    int red,blue,black;

    String[] redS = {"C", "B", "A", "A or C", "B", "A or C", "A, B, or C", "A or B", "B"};
    String[] blueS = {"B", "A or C", "B", "A", "B", "B or C", "C", "A or C", "A"};
    String[] blackS = {"A, B or C", "A or C", "B", "A or C", "B", "B or C", "A or B", "C", "C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sequence);

        instruct = (TextView) findViewById(R.id.sequenceInstruct);
        red = 0;
        blue = 0;
        black = 0;
    }

    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v){
        finish();
    }

    public void buttonClick(View v){
        switch(v.getId()){
            case R.id.sequenceRed:
                red++;
                if(red > redS.length){
                    instruct.setText("Clicked red too many times...");
                }
                instruct.setText("Cut the red wire if it is connected to " + redS[red - 1]);
                break;
            case R.id.sequenceBlue:
                blue++;
                if(blue > blueS.length){
                    instruct.setText("Clicked blue too many times...");
                }
                instruct.setText("Cut the blue wire if it is connected to " + blueS[blue - 1]);
                break;
            case R.id.sequenceBlack:
                black++;
                if(black > blackS.length){
                    instruct.setText("Clicked black too many times...");
                }
                instruct.setText("Cut the black wire if it is connected to " + blackS[black - 1]);
                break;
        }

    }
}
