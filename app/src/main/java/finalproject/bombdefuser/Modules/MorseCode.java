package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

import finalproject.bombdefuser.R;

public class MorseCode extends AppCompatActivity {

    long dotDuration = (long) 250;
    long gap = (long) 1000;
    long wordGap = (long) 1500;

    TextView instruct;

    String word;
    String letter;

    HashMap<String, String> words = new HashMap<>();

    Button light;
    long lastDown, lastDuration, lastUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morse_code);

        instruct = (TextView) findViewById(R.id.morseInstruct);
        light = (Button) findViewById(R.id.morsecodeLight);

        lastDown = 0;
        lastDuration = 0;
        lastUp = 0;

        word = "";
        letter = "";

        words.put("shell", "3.505");
        words.put("halls", "3.515");
        words.put("slick", "3.522");
        words.put("trick", "3.532");
        words.put("boxes", "3.535");
        words.put("leaks", "3.542");
        words.put("strobe", "3.545");
        words.put("bistro", "3.552");
        words.put("flick", "3.555");
        words.put("bombs", "3.565");
        words.put("break", "3.572");
        words.put("brick", "3.575");
        words.put("steak", "3.582");
        words.put("sting", "3.592");
        words.put("vector", "3.595");
        words.put("beats", "3.600");

        light.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction() == MotionEvent.ACTION_DOWN){
                    if(System.currentTimeMillis() - lastUp > wordGap){
                        System.out.println("End of Word");
                        word = "";
                    }
                    else if (System.currentTimeMillis() - lastUp > gap)
                    {
                        System.out.println("End of Letter");
                        convertLetter();
                    }
                    lastDown = System.currentTimeMillis();

                }
                else if (event.getAction() == MotionEvent.ACTION_UP){
                    lastDuration = System.currentTimeMillis() - lastDown;
                    if(lastDuration > dotDuration){
                        System.out.println("Dash");
                        letter += "-";
                    }
                    else{
                        System.out.println("Dot");
                        letter += ".";
                    }
                    lastUp = System.currentTimeMillis();
                }
                return true;
            }
        });


    }

    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v){
        finish();
    }

    public void buttonClicked(View v){
        switch(v.getId()){
            case R.id.morseDot:
                letter += ".";
                break;
            case R.id.morseDash:
                letter += "-";
                break;
            case R.id.morsePause:
                convertLetter();
                break;
            case R.id.morseSpace:
                word = "";
                convertLetter();
                break;
        }
    }

    private void convertLetter(){
        String newLetter;
        switch(letter){
            case ".-":
                newLetter = "a";
                break;
            case "-...":
                newLetter = "b";
                break;
            case "-.-.":
                newLetter = "c";
                break;
            case ".":
                newLetter = "e";
                break;
            case "..-.":
                newLetter = "f";
                break;
            case "--.":
                newLetter = "g";
                break;
            case "....":
                newLetter = "h";
                break;
            case "..":
                newLetter = "i";
                break;
            case "-.-":
                newLetter = "k";
                break;
            case ".-..":
                newLetter = "l";
                break;
            case "--":
                newLetter = "m";
                break;
            case "-.":
                newLetter = "n";
                break;
            case "---":
                newLetter = "o";
                break;
            case ".-.":
                newLetter = "r";
                break;
            case "...":
                newLetter = "s";
                break;
            case "-":
                newLetter = "t";
                break;
            case "...-":
                newLetter = "v";
                break;
            case "-..-":
                newLetter = "x";
                break;
            default:
                letter = "";
                return;
        }
        letter = "";
        word += newLetter;
        checkSolution();
    }

    private void checkSolution(){
        boolean found = false;
        String respond = "";
        for(String s : words.keySet()){
            if(s.contains(word)){
                if(!found){
                    respond = words.get(s);
                    found = true;
                }
                else{
                    return;
                }
            }
        }
        if(found){
            instruct.setText("Respond at frequency: " + respond + " MHz");
        }
        else{
            word = "";
        }
    }
}
