package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import finalproject.bombdefuser.R;

public class Passwords extends AppCompatActivity {

    EditText first, second, third, fourth, fifth;
    TextView pwTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passwords);

        first = (EditText) findViewById(R.id.first);
        second = (EditText) findViewById(R.id.second);
        third = (EditText) findViewById(R.id.third);
        fourth = (EditText) findViewById(R.id.fourth);
        fifth = (EditText) findViewById(R.id.fifth);

        pwTxt = (TextView) findViewById(R.id.pwTxt);
    }

    public void mazes(View v){
        Intent intent = new Intent(this, Mazes.class);
        startActivity(intent);
    }

    public void passwords(View v){
        Intent intent = new Intent(this, Passwords.class);
        startActivity(intent);
    }

    public void getWord(View v){
        //word
        if(first.getText().toString().contains("") &&
                second.getText().toString().contains("") &&
                third.getText().toString().contains("") &&
                fourth.getText().toString().contains("") &&
                fifth.getText().toString().contains("")){
            pwTxt.setText("");
        }

        //about
        if(first.getText().toString().contains("a") &&
                second.getText().toString().contains("b") &&
                third.getText().toString().contains("o") &&
                fourth.getText().toString().contains("u") &&
                fifth.getText().toString().contains("t")){
            pwTxt.setText("about");
        }

        //after
        if(first.getText().toString().contains("a") &&
                second.getText().toString().contains("f") &&
                third.getText().toString().contains("t") &&
                fourth.getText().toString().contains("e") &&
                fifth.getText().toString().contains("r")){
            pwTxt.setText("after");
        }

        //again
        if(first.getText().toString().contains("a") &&
                second.getText().toString().contains("g") &&
                third.getText().toString().contains("a") &&
                fourth.getText().toString().contains("i") &&
                fifth.getText().toString().contains("n")){
            pwTxt.setText("again");
        }

        //below
        if(first.getText().toString().contains("b") &&
                second.getText().toString().contains("e") &&
                third.getText().toString().contains("l") &&
                fourth.getText().toString().contains("o") &&
                fifth.getText().toString().contains("w")){
            pwTxt.setText("below");
        }

        //could
        if(first.getText().toString().contains("c") &&
                second.getText().toString().contains("o") &&
                third.getText().toString().contains("u") &&
                fourth.getText().toString().contains("l") &&
                fifth.getText().toString().contains("d")){
            pwTxt.setText("could");
        }

        //every
        if(first.getText().toString().contains("e") &&
                second.getText().toString().contains("v") &&
                third.getText().toString().contains("e") &&
                fourth.getText().toString().contains("r") &&
                fifth.getText().toString().contains("y")){
            pwTxt.setText("every");
        }

        //first
        if(first.getText().toString().contains("f") &&
                second.getText().toString().contains("i") &&
                third.getText().toString().contains("r") &&
                fourth.getText().toString().contains("s") &&
                fifth.getText().toString().contains("t")){
            pwTxt.setText("first");
        }

        //found
        if(first.getText().toString().contains("f") &&
                second.getText().toString().contains("o") &&
                third.getText().toString().contains("u") &&
                fourth.getText().toString().contains("n") &&
                fifth.getText().toString().contains("d")){
            pwTxt.setText("found");
        }

        //great
        if(first.getText().toString().contains("g") &&
                second.getText().toString().contains("r") &&
                third.getText().toString().contains("e") &&
                fourth.getText().toString().contains("a") &&
                fifth.getText().toString().contains("t")){
            pwTxt.setText("great");
        }

        //house
        if(first.getText().toString().contains("h") &&
                second.getText().toString().contains("o") &&
                third.getText().toString().contains("u") &&
                fourth.getText().toString().contains("s") &&
                fifth.getText().toString().contains("e")){
            pwTxt.setText("house");
        }

        //large
        if(first.getText().toString().contains("l") &&
                second.getText().toString().contains("a") &&
                third.getText().toString().contains("r") &&
                fourth.getText().toString().contains("g") &&
                fifth.getText().toString().contains("e")){
            pwTxt.setText("large");
        }

        //learn
        if(first.getText().toString().contains("l") &&
                second.getText().toString().contains("e") &&
                third.getText().toString().contains("a") &&
                fourth.getText().toString().contains("r") &&
                fifth.getText().toString().contains("n")){
            pwTxt.setText("learn");
        }

        //never
        if(first.getText().toString().contains("n") &&
                second.getText().toString().contains("e") &&
                third.getText().toString().contains("v") &&
                fourth.getText().toString().contains("e") &&
                fifth.getText().toString().contains("r")){
            pwTxt.setText("never");
        }

        //other
        if(first.getText().toString().contains("o") &&
                second.getText().toString().contains("t") &&
                third.getText().toString().contains("h") &&
                fourth.getText().toString().contains("r") &&
                fifth.getText().toString().contains("r")){
            pwTxt.setText("other");
        }

        //place
        if(first.getText().toString().contains("p") &&
                second.getText().toString().contains("l") &&
                third.getText().toString().contains("a") &&
                fourth.getText().toString().contains("c") &&
                fifth.getText().toString().contains("e")){
            pwTxt.setText("place");
        }

        //plant
        if(first.getText().toString().contains("p") &&
                second.getText().toString().contains("l") &&
                third.getText().toString().contains("a") &&
                fourth.getText().toString().contains("n") &&
                fifth.getText().toString().contains("t")){
            pwTxt.setText("plant");
        }

        //point
        if(first.getText().toString().contains("p") &&
                second.getText().toString().contains("o") &&
                third.getText().toString().contains("i") &&
                fourth.getText().toString().contains("n") &&
                fifth.getText().toString().contains("t")){
            pwTxt.setText("point");
        }

        //right
        if(first.getText().toString().contains("r") &&
                second.getText().toString().contains("i") &&
                third.getText().toString().contains("g") &&
                fourth.getText().toString().contains("h") &&
                fifth.getText().toString().contains("t")){
            pwTxt.setText("right");
        }

        //small
        if(first.getText().toString().contains("s") &&
                second.getText().toString().contains("m") &&
                third.getText().toString().contains("a") &&
                fourth.getText().toString().contains("l") &&
                fifth.getText().toString().contains("l")){
            pwTxt.setText("small");
        }

        //sound
        if(first.getText().toString().contains("s") &&
                second.getText().toString().contains("o") &&
                third.getText().toString().contains("u") &&
                fourth.getText().toString().contains("n") &&
                fifth.getText().toString().contains("d")){
            pwTxt.setText("sound");
        }

        //spell
        if(first.getText().toString().contains("s") &&
                second.getText().toString().contains("p") &&
                third.getText().toString().contains("e") &&
                fourth.getText().toString().contains("l") &&
                fifth.getText().toString().contains("l")){
            pwTxt.setText("spell");
        }

        //still
        if(first.getText().toString().contains("s") &&
                second.getText().toString().contains("t") &&
                third.getText().toString().contains("i") &&
                fourth.getText().toString().contains("l") &&
                fifth.getText().toString().contains("l")){
            pwTxt.setText("still");
        }

        //study
        if(first.getText().toString().contains("s") &&
                second.getText().toString().contains("t") &&
                third.getText().toString().contains("u") &&
                fourth.getText().toString().contains("d") &&
                fifth.getText().toString().contains("y")){
            pwTxt.setText("study");
        }

        //their
        if(first.getText().toString().contains("t") &&
                second.getText().toString().contains("h") &&
                third.getText().toString().contains("e") &&
                fourth.getText().toString().contains("i") &&
                fifth.getText().toString().contains("r")){
            pwTxt.setText("their");
        }

        //these
        if(first.getText().toString().contains("t") &&
                second.getText().toString().contains("h") &&
                third.getText().toString().contains("e") &&
                fourth.getText().toString().contains("s") &&
                fifth.getText().toString().contains("e")){
            pwTxt.setText("these");
        }

        //thing
        if(first.getText().toString().contains("t") &&
                second.getText().toString().contains("h") &&
                third.getText().toString().contains("i") &&
                fourth.getText().toString().contains("n") &&
                fifth.getText().toString().contains("g")){
            pwTxt.setText("thing");
        }

        //think
        if(first.getText().toString().contains("t") &&
                second.getText().toString().contains("h") &&
                third.getText().toString().contains("i") &&
                fourth.getText().toString().contains("n") &&
                fifth.getText().toString().contains("k")){
            pwTxt.setText("think");
        }

        //three
        if(first.getText().toString().contains("t") &&
                second.getText().toString().contains("h") &&
                third.getText().toString().contains("r") &&
                fourth.getText().toString().contains("e") &&
                fifth.getText().toString().contains("e")){
            pwTxt.setText("three");
        }

        //water
        if(first.getText().toString().contains("w") &&
                second.getText().toString().contains("a") &&
                third.getText().toString().contains("t") &&
                fourth.getText().toString().contains("e") &&
                fifth.getText().toString().contains("r")){
            pwTxt.setText("water");
        }

        //where
        if(first.getText().toString().contains("w") &&
                second.getText().toString().contains("h") &&
                third.getText().toString().contains("e") &&
                fourth.getText().toString().contains("r") &&
                fifth.getText().toString().contains("e")){
            pwTxt.setText("where");
        }

        //which
        if(first.getText().toString().contains("w") &&
                second.getText().toString().contains("h") &&
                third.getText().toString().contains("i") &&
                fourth.getText().toString().contains("c") &&
                fifth.getText().toString().contains("h")){
            pwTxt.setText("which");
        }

        //world
        if(first.getText().toString().contains("w") &&
                second.getText().toString().contains("o") &&
                third.getText().toString().contains("r") &&
                fourth.getText().toString().contains("l") &&
                fifth.getText().toString().contains("d")){
            pwTxt.setText("world");
        }

        //would
        if(first.getText().toString().contains("w") &&
                second.getText().toString().contains("o") &&
                third.getText().toString().contains("u") &&
                fourth.getText().toString().contains("l") &&
                fifth.getText().toString().contains("d")){
            pwTxt.setText("would");
        }

        //write
        if(first.getText().toString().contains("w") &&
                second.getText().toString().contains("r") &&
                third.getText().toString().contains("i") &&
                fourth.getText().toString().contains("t") &&
                fifth.getText().toString().contains("e")){
            pwTxt.setText("write");
        }
    }
}
