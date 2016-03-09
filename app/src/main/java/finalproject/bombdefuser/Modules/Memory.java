package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;

import finalproject.bombdefuser.R;

public class Memory extends AppCompatActivity {

    TextView instructions, prompt;

    Button one, two, three, four;

    int[] numbers, positions;
    int currStage;

    String curr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        instructions = (TextView) findViewById(R.id.meminstruct);
        prompt = (TextView) findViewById(R.id.memprompt);
        one = (Button) findViewById(R.id.membutton1);
        two = (Button) findViewById(R.id.membutton2);
        three = (Button) findViewById(R.id.membutton3);
        four = (Button) findViewById(R.id.membutton4);

        numbers = new int[6];
        positions = new int[6];
        currStage = 1;
        curr = "display";
    }

    public void giveInstructions(int num){
        int pos;
        int lab;
        String posString;
        if(curr.equals("display")) {
            switch (currStage) {
                case 1:
                    switch (num) {
                        case 1:
                            instructions.setText("Press the button in the second position");
                            positions[currStage] = 2;
                            break;
                        case 2:
                            instructions.setText("Press the button in the second position");
                            positions[currStage] = 2;
                            break;
                        case 3:
                            instructions.setText("Press the button in the third position");
                            positions[currStage] = 3;
                            break;
                        case 4:
                            instructions.setText("Press the button in the fourth position");
                            positions[currStage] = 4;
                            break;
                    }
                    askNumber();
                    break;
                case 2:
                    switch (num) {
                        case 1:
                            instructions.setText("Press the button labeled 4");
                            numbers[currStage] = 4;
                            askPosition();
                            break;
                        case 2:
                            pos = positions[1];
                            posString = posToString(pos);
                            instructions.setText("Press the button in the " + posString + " position");
                            positions[currStage] = pos;
                            askNumber();
                            break;
                        case 3:
                            instructions.setText("Press the button in the first position");
                            positions[currStage] = 1;
                            askNumber();
                            break;
                        case 4:
                            pos = positions[1];
                            posString = posToString(pos);
                            instructions.setText("Press the button in the " + posString + " position");
                            positions[currStage] = pos;
                            askNumber();
                            break;
                    }
                    break;
                case 3:
                    switch (num) {
                        case 1:
                            lab = numbers[2];
                            instructions.setText("Press the button labeled " + lab);
                            numbers[currStage] = lab;
                            askPosition();
                            break;
                        case 2:
                            lab = numbers[1];
                            instructions.setText("Press the button labeled " + lab);
                            numbers[currStage] = lab;
                            askPosition();
                            break;
                        case 3:
                            instructions.setText("Press the button in the third position");
                            positions[currStage] = 3;
                            askNumber();
                            break;
                        case 4:
                            instructions.setText("Press the button labeled 4");
                            numbers[currStage] = 4;
                            askPosition();
                            break;
                    }
                    break;
                case 4:
                    switch (num) {
                        case 1:
                            pos = positions[1];
                            posString = posToString(pos);
                            instructions.setText("Press the button in the " + posString + " position");
                            positions[currStage] = pos;
                            askNumber();
                            break;
                        case 2:
                            instructions.setText("Press the button in the first position");
                            positions[currStage] = 1;
                            askNumber();
                            break;
                        case 3:
                            pos = positions[2];
                            posString = posToString(pos);
                            instructions.setText("Press the button in the " + posString + " position");
                            positions[currStage] = pos;
                            askNumber();
                            break;
                        case 4:
                            pos = positions[2];
                            posString = posToString(pos);
                            instructions.setText("Press the button in the " + posString + " position");
                            positions[currStage] = pos;
                            askNumber();
                            break;
                    }
                    break;
                case 5:
                    switch (num) {
                        case 1:
                            lab = numbers[1];
                            instructions.setText("Press the button labeled " + lab);
                            numbers[currStage] = lab;
                            break;
                        case 2:
                            lab = numbers[2];
                            instructions.setText("Press the button labeled " + lab);
                            numbers[currStage] = lab;
                            break;
                        case 3:
                            lab = numbers[4];
                            instructions.setText("Press the button labeled " + lab);
                            numbers[currStage] = lab;
                            break;
                        case 4:
                            lab = numbers[3];
                            instructions.setText("Press the button labeled " + lab);
                            numbers[currStage] = lab;
                            break;
                    }
                    break;
                case 6:
                    instructions.setText("Done with module!");
                    break;
            }
        }
        else if(curr.equals("number")){
            numbers[currStage] = num;
            currStage++;
            askDisplay();
        }
        else if(curr.equals("position")){
            positions[currStage] = num;
            currStage++;
            askDisplay();
        }
    }

    public void askNumber(){
        prompt.setText("What was the number you pressed?");
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        curr = "number";
    }

    public void askDisplay(){
        prompt.setText("What is the number on the display?");
        instructions.setText("Waiting for input...");
        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        curr = "display";
    }

    public void askPosition(){
        prompt.setText("What was the position you pressed?");
        one.setText("First");
        two.setText("Second");
        three.setText("Third");
        four.setText("Fourth");
        curr = "position";
    }

    private String posToString(int pos){
        switch(pos){
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
        }
        return "first";
    }

    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v){
        finish();
    }

    public void one(View v){ giveInstructions(1); }

    public void two(View v){ giveInstructions(2); }

    public void three(View v){ giveInstructions(3); }

    public void four(View v){ giveInstructions(4); }

}
