package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import finalproject.bombdefuser.ModuleSelection;
import finalproject.bombdefuser.R;

public class SimonSays extends AppCompatActivity {

    int numStrikes;

    String instructions;

    TextView instruct;

    RadioButton yesRB, noRB;

    //[Vowel-No Vowel] [Num Strikes] [Color]
    //Vowel - 1, No Vowel - 0
    //Color Red Blue Green Yellow -> 0, 1, 2, 3
    String[][][] colors = {
            {{"Blue", "Yellow", "Green", "Red"},
            {"Red", "Blue", "Yellow", "Green"},
            {"Yellow", "Green", "Blue", "Red"}},
            {{"Blue", "Red", "Yellow", "Green"},
            {"Yellow", "Green", "Blue", "Red"},
            {"Green", "Red", "Yellow", "Blue"}}};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simon_says);

        numStrikes = 0;
        instructions = "";

        instruct = (TextView) findViewById(R.id.simonsaysinstruct);
        yesRB = (RadioButton) findViewById(R.id.simonsaysyes);
        noRB = (RadioButton) findViewById(R.id.simonsaysno);

        if(ModuleSelection.serial_number_vowel == 1){
            yesRB.setChecked(true);
        }
        if(ModuleSelection.serial_number_vowel == 0){
            noRB.setChecked(true);
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

    public void simonSerialClicked(View v){
        boolean checked = ((RadioButton) v).isChecked();

        switch(v.getId()){
            case R.id.simonsaysyes:
                ModuleSelection.serial_number_vowel = 1;
                instructions = "";
                instruct.setText("Waiting...");
                break;
            case R.id.simonsaysno:
                ModuleSelection.serial_number_vowel = 0;
                instructions = "";
                instruct.setText("Waiting...");
                break;
        }
    }

    public void simonStrikeClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.simonstrikesnone:
                if (checked) {
                    numStrikes = 0;
                    instructions = "";
                    instruct.setText("Waiting...");
                }
                break;
            case R.id.simonstrikeone:
                if (checked) {
                    numStrikes = 1;
                    instructions = "";
                    instruct.setText("Waiting...");
                }
                break;
            case R.id.simonstriketwo:
                if (checked){
                    numStrikes = 2;
                    instructions = "";
                    instruct.setText("Waiting...");
                }
                break;
        }
    }

    public void simonClicked(View v) {
        if(ModuleSelection.serial_number_vowel < 0){
            instruct.setText("Does the Serial Number contain a Vowel?");
            return;
        }
        if(instruct.getText().equals("Waiting...")){
            instruct.setText("Press: ");
        }
        switch(v.getId()){
            case R.id.simonsaysred:
                instruct.setText(instruct.getText() +
                        colors[ModuleSelection.serial_number_vowel][numStrikes][0] + " ");
                break;
            case R.id.simonsaysblue:
                instruct.setText(instruct.getText() +
                        colors[ModuleSelection.serial_number_vowel][numStrikes][1] + " ");
                break;
            case R.id.simonsaysgreen:
                instruct.setText(instruct.getText() +
                        colors[ModuleSelection.serial_number_vowel][numStrikes][2] + " ");
                break;
            case R.id.simonsaysyellow:
                instruct.setText(instruct.getText() +
                        colors[ModuleSelection.serial_number_vowel][numStrikes][3] + " ");
                break;
        }
    }
}
