package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import finalproject.bombdefuser.R;

public class Mazes extends AppCompatActivity {

    EditText firstCircRow, firstCircCol,
    secondCircRow, secondCircCol;

    TextView mapTxt, errTxt;

    ImageView map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mazes);

        firstCircRow = (EditText) findViewById(R.id.firstCircRow);
        firstCircCol = (EditText) findViewById(R.id.firstCircCol);

        mapTxt = (TextView) findViewById(R.id.mapTxt);
        mapTxt.setVisibility(View.INVISIBLE);
        errTxt = (TextView) findViewById(R.id.errTxt);
        errTxt.setVisibility(View.INVISIBLE);

        map = (ImageView) findViewById(R.id.map);
    }

    public void getMap(View v){
        //No map conditions
        if((firstCircRow.getText().toString().isEmpty() && firstCircCol.getText().toString().isEmpty())){
            errTxt.setVisibility(View.VISIBLE);
        }

        //Map 1 conditions
        if((firstCircRow.getText().toString().equals("2")&& firstCircCol.getText().toString().equals("1")) ||
                firstCircRow.getText().toString().equals("3") && firstCircCol.getText().toString().equals("6")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze1);
        }

        //Map 2 conditions
        if((firstCircRow.getText().toString().equals("4")&& firstCircCol.getText().toString().equals("2")) ||
                firstCircRow.getText().toString().equals("2") && firstCircCol.getText().toString().equals("5")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze2);
        }

        //Map 3 conditions
        if((firstCircRow.getText().toString().equals("4")&& firstCircCol.getText().toString().equals("4")) ||
                firstCircRow.getText().toString().equals("4") && firstCircCol.getText().toString().equals("6")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze3);
        }

        //Map 4 conditions
        if((firstCircRow.getText().toString().equals("1")&& firstCircCol.getText().toString().equals("1")) ||
                firstCircRow.getText().toString().equals("4") && firstCircCol.getText().toString().equals("1")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze4);
        }

        //Map 5 conditions
        if((firstCircRow.getText().toString().equals("3")&& firstCircCol.getText().toString().equals("5")) ||
                firstCircRow.getText().toString().equals("6") && firstCircCol.getText().toString().equals("4")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze5);
        }

        //Map 6 conditions
        if((firstCircRow.getText().toString().equals("1")&& firstCircCol.getText().toString().equals("5")) ||
                firstCircRow.getText().toString().equals("5") && firstCircCol.getText().toString().equals("3")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze6);
        }

        //Map 7 conditions
        if((firstCircRow.getText().toString().equals("1")&& firstCircCol.getText().toString().equals("2")) ||
                firstCircRow.getText().toString().equals("6") && firstCircCol.getText().toString().equals("2")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze7);
        }

        //Map 8 conditions
        if((firstCircRow.getText().toString().equals("5")&& firstCircCol.getText().toString().equals("1")) ||
                firstCircRow.getText().toString().equals("2") && firstCircCol.getText().toString().equals("3")){
            mapTxt.setVisibility(View.VISIBLE);
            errTxt.setVisibility(View.INVISIBLE);
            map.setImageResource(R.drawable.maze8);
        }
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
