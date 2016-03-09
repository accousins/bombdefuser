package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.ViewGroup.LayoutParams;

import finalproject.bombdefuser.ModuleSelection;
import finalproject.bombdefuser.R;

public class ButtonMod extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner color, label, strip;
    TextView instructions, indicator, striptext;
    String currInd;
    Button yes, no;
    RelativeLayout indicatorCheck;
    RelativeLayout batteries;
    LayoutParams battParams;

    String colorString, labelString, stripString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        labelString = "Select";
        stripString = "Select";
        colorString = "Select";

        color = (Spinner) findViewById(R.id.color);
        label = (Spinner) findViewById(R.id.label);
        strip = (Spinner) findViewById(R.id.stripSpinner);
        instructions = (TextView) findViewById(R.id.textButtonInstructions);
        instructions.setText(R.string.waiting);
        indicator = (TextView) findViewById(R.id.indicatorText);
        striptext = (TextView) findViewById(R.id.stripColorText);
        striptext.setVisibility(View.INVISIBLE);
        yes = (Button) findViewById(R.id.buttonYes);
        no = (Button) findViewById(R.id.buttonNo);
        indicatorCheck = (RelativeLayout) findViewById(R.id.litIndicator);

        batteries = (RelativeLayout) findViewById(R.id.buttonBatteries);
        battParams = batteries.getLayoutParams();

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.button_colors, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        color.setAdapter(adapter);
        strip.setAdapter(adapter);

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.button_labels, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        label.setAdapter(adapter2);

        color.setOnItemSelectedListener(this);
        strip.setOnItemSelectedListener(this);
        label.setOnItemSelectedListener(this);
    }

    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v){
        finish();
    }

    public void checkSolution(){
        System.out.println("Checking Solution " + colorString+labelString);
        batteries.setVisibility(View.INVISIBLE);
        battParams.height = 0;
        strip.setVisibility(View.INVISIBLE);
        striptext.setVisibility(View.INVISIBLE);
        indicatorCheck.setVisibility(View.INVISIBLE);
        instructions.setText("Waiting for Input...");
        //check that we have input
        if(colorString.equals("Select") || labelString.equals("Select")){
            System.out.println("Didn't check, color, label: " + colorString + labelString);
            return;
        }
        //case 1
        if(colorString.equals("Blue") && labelString.equals("Abort")){
            holdDown();
            return;
        }
        //case 2
        System.out.println("getting num batteries");
        int bat = getNumBatteries();
        if(bat < 0){
            batteries.setVisibility(View.VISIBLE);
            battParams.height = LayoutParams.WRAP_CONTENT;
            System.out.println("Displaying batteries");
            return;
        }
        if(bat > 1 && labelString.equals("Detonate")){
            release();
            return;
        }
        //case 3
        if(colorString.equals("White")) {
            int car = getIndicator("CAR");
            if (car < 0) {
                return;
            }
            if (car > 0){
                holdDown();
                return;
            }
        }
        //case 4
        if(bat > 2){
            int frk = getIndicator("FRK");
            if(frk < 0){
                return;
            }
            if(frk > 0){
                release();
                return;
            }
        }
        //case 5
        if(colorString.equals("Yellow")){
            holdDown();
            return;
        }
        //case 6
        if(colorString.equals("Red") && labelString.equals("Hold")){
            release();
            return;
        }
        //case 7
        holdDown();
    }

    public void stripCheck(){
        switch(stripString){
            case "Blue":
                instructions.setText("Release when there is a 4 in the timer");
                break;
            case "White":
                instructions.setText("Release when there is a 1 in the timer");
                break;
            case "Yellow":
                instructions.setText("Release when there is a 5 in the timer");
                break;
            case "Select":
                instructions.setText(R.string.waiting);
                break;
            default:
                instructions.setText("Release when there is a 1 in the timer");
                break;
        }
    }

    public void noButton(View v){
        if(currInd.equals("FRK")){
            ModuleSelection.FRK = 0;
        }
        else{
            ModuleSelection.CAR = 0;
        }
        checkSolution();
    }

    public void yesButton(View v){
        if(currInd.equals("FRK")){
            ModuleSelection.FRK = 1;
        }
        else{
            ModuleSelection.CAR = 1;
        }
        checkSolution();
    }

    public int getNumBatteries(){
        if(ModuleSelection.num_batteries >= 0){
            return ModuleSelection.num_batteries;
        }
        return -1;
    }

    public void buttonClicked(View v){
        switch(v.getId()){
            case R.id.buttonBatt0:
                ModuleSelection.num_batteries = 0;
                break;
            case R.id.buttonBatt1:
                ModuleSelection.num_batteries = 1;
                break;
            case R.id.buttonBatt2:
                ModuleSelection.num_batteries = 2;
                break;
            case R.id.buttonBatt3:
                ModuleSelection.num_batteries = 3;
                break;
        }
        checkSolution();
    }

    public int getIndicator(String ind){
        if(ind.equals("FRK")) {
            if (ModuleSelection.FRK >= 0) {
                return ModuleSelection.FRK;
            }
            currInd = "FRK";
        }
        else {
            if(ModuleSelection.CAR >= 0){
                return ModuleSelection.CAR;
            }
            currInd = "CAR";
        }
        indicator.setText("Is there a lit indicator " + ind + "?");
        indicatorCheck.setVisibility(View.VISIBLE);
        return -1;
    }

    public void holdDown(){
        instructions.setText("Hold down the button");
        strip.setVisibility(View.VISIBLE);
        striptext.setVisibility(View.VISIBLE);
    }

    public void release(){
        instructions.setText("Press and Immediately Release");
    }


    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        String item = parent.getItemAtPosition(pos).toString();
        switch(parent.getId()){
            case R.id.color:
                colorString = item;
                break;
            case R.id.label:
                labelString = item;
                break;
            case R.id.stripSpinner:
                stripString = item;
                stripCheck();
                return;
        }
        System.out.println(item);
        checkSolution();
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}
