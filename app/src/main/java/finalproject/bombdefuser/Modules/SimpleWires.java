package finalproject.bombdefuser.Modules;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import finalproject.bombdefuser.ModuleSelection;
import finalproject.bombdefuser.R;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Spinner;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

import java.util.ArrayList;

public class SimpleWires extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button restart, different;
    TextView prompt, instructions;
    Spinner spinner0, spinner1, spinner2, spinner3, spinner4, spinner5;
    ArrayList<Spinner> spinners;
    RelativeLayout serialCheck;
    LayoutParams serialParams;

    String[] wires;
    String[] check;

    int numWires;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_wires);

        restart = (Button) findViewById(R.id.buttonrestart);
        different = (Button) findViewById(R.id.buttondifferent);

        prompt = (TextView) findViewById(R.id.prompt);
        instructions = (TextView) findViewById(R.id.textInstructions);
        serialCheck = (RelativeLayout) findViewById(R.id.simplewiresCheckSerialNumber);

        serialCheck.setVisibility(View.INVISIBLE);
        serialParams = serialCheck.getLayoutParams();
        serialParams.height = 0;

        wires = new String[6];

        spinner0 = (Spinner) findViewById(R.id.spinner0);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner5 = (Spinner) findViewById(R.id.spinner5);

        spinners = new ArrayList<>();
        spinners.add(spinner0);
        spinners.add(spinner1);
        spinners.add(spinner2);
        spinners.add(spinner3);
        spinners.add(spinner4);
        spinners.add(spinner5);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.simple_wires, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        for(Spinner spinner : spinners){
            spinner.setAdapter(adapter);
            spinner.setOnItemSelectedListener(this);
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

    //update the wire array
    private void updateWires(String wire, int index){
        wires[index] = wire;
        instructions.setText(wire);
    }

    private int getSerialNumber(){
        if(ModuleSelection.serial_number_odd >= 0){
            return ModuleSelection.serial_number_odd;
        }
        serialParams.height = LayoutParams.WRAP_CONTENT;
        serialCheck.setVisibility(View.VISIBLE);
        return -1;
    }

    public void buttonClicked(View v){
        switch(v.getId()){
            case R.id.simplewiresYes:
                ModuleSelection.serial_number_odd = 1;
                break;
            case R.id.simplewiresNo:
                ModuleSelection.serial_number_odd = 0;
                break;
        }
        checkSolution();
    }

    //check if there is a wire we should cut
    private void checkSolution() {
        serialCheck.setVisibility(View.INVISIBLE);
        serialParams.height = 0;
        check = new String[6];
        numWires = 0;
        //Go through all the wires and make a more concise array, and count how many wires we have
        for(String wire : wires){
            if(wire != null && !wire.equals("No Wire")){
                check[numWires] = wire;
                numWires++;
            }
        }

        //check conditions based on the number of wires
        switch(numWires){
            case 3:
                wiresThree();
                break;
            case 4:
                wiresFour();
                break;
            case 5:
                wiresFive();
                break;
            case 6:
                wiresSix();
                break;
        }
    }

    private void wiresThree(){
        int red = 0;
        int blue = 0;
        for(int c = 0; c < numWires; c++){
            if(check[c].equals("Red")){
                red++;
            }
            if(check[c].equals("Blue")){
                blue++;
            }
        }
        if(red == 0){
            instructions.setText("Cut the Second Wire");
            return;
        }
        if(check[2].equals("White") || blue < 2){
            instructions.setText("Cut the Last Wire");
            return;
        }
        instructions.setText("Cut the Last Blue Wire");
    }

    private void wiresFour(){
        int red = 0, yellow = 0, blue = 0;
        for(int c = 0; c < numWires; c++){
            switch(check[c]){
                case "Red":
                    red++;
                    break;
                case "Yellow":
                    yellow++;
                    break;
                case "Blue":
                    blue++;
                    break;
            }
        }
        if(red > 1){
            int sn = getSerialNumber();
            if (sn < 0){
                instructions.setText("Need the Serial Number");
                return;
            }
            if(sn%2 == 1){
                instructions.setText("Cut the Last Red Wire");
                return;
            }
        }
        if(red == 0 && check[numWires - 1].equals("Yellow")){
            instructions.setText("Cut the First Wire");
            return;
        }
        if(blue == 1){
            instructions.setText("Cut the First Wire");
            return;
        }
        if(yellow > 1){
            instructions.setText("Cut the Last Wire");
            return;
        }
        instructions.setText("Cut the Second Wire");
    }

    private void wiresFive(){
        int red = 0, yellow = 0, black = 0;
        for(int c = 0; c < numWires; c++){
            switch(check[c]){
                case "Red":
                    red++;
                    break;
                case "Yellow":
                    yellow++;
                    break;
                case "Black":
                    black++;
                    break;
            }
        }
        if(check[numWires-1].equals("Black")){
            int sn = getSerialNumber();
            if (sn < 0){
                instructions.setText("Need the Serial Number");
                return;
            }
            if(sn%2 == 1){
                instructions.setText("Cut the Fourth Wire");
                return;
            }
        }
        if(red == 1 && yellow > 1){
            instructions.setText("Cut the First Wire");
            return;
        }
        if(black == 0){
            instructions.setText("Cut the Second Wire");
            return;
        }
        instructions.setText("Cut the First Wire");
        return;
    }

    private void wiresSix(){
        int red = 0, yellow = 0, white = 0;
        for(int c = 0; c < numWires; c++){
            switch(check[c]){
                case "Red":
                    red++;
                    break;
                case "Yellow":
                    yellow++;
                    break;
                case "White":
                    white++;
                    break;
            }
        }
        if(yellow == 0){
            int sn = getSerialNumber();
            if (sn < 0){
                instructions.setText("Need the Serial Number");
                return;
            }
            if(sn%2 == 1){
                instructions.setText("Cut the Third Wire");
                return;
            }
        }
        if(yellow == 1 && white > 1){
            instructions.setText("Cut the Fourth Wire");
            return;
        }
        if(red == 0){
            instructions.setText("Cut the Last Wire");
            return;
        }
        instructions.setText("Cut the Fourth Wire");
        return;
    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        String item = parent.getItemAtPosition(pos).toString();
        switch (parent.getId()){

            case R.id.spinner0:
                updateWires(item, 0);
                break;
            case R.id.spinner1:
                updateWires(item, 1);
                break;
            case R.id.spinner2:
                updateWires(item, 2);
                break;
            case R.id.spinner3:
                updateWires(item, 3);
                break;
            case R.id.spinner4:
                updateWires(item, 4);
                break;
            case R.id.spinner5:
                updateWires(item, 5);
                break;
        }

        checkSolution();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
