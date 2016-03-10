package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.graphics.AvoidXfermode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.HashMap;

import finalproject.bombdefuser.ModuleSelection;
import finalproject.bombdefuser.R;

public class Complicated extends AppCompatActivity {

    RelativeLayout extraQuestion;
    TextView extraQ, instruct;

    Button batt1, batt3, yes, no;

    String extra;

    boolean blue, red, star, led;

    HashMap<String, String> codes = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complicated);

        extraQuestion = (RelativeLayout) findViewById(R.id.complicatedExtraQuestion);
        extraQuestion.setVisibility(View.INVISIBLE);

        extraQ = (TextView) findViewById(R.id.complicatedExtraQText);
        instruct = (TextView) findViewById(R.id.complicatedInstruct);

        batt1 = (Button) findViewById(R.id.complicatedBatt1);
        batt3 = (Button) findViewById(R.id.complicatedBatt3);
        batt1.setVisibility(View.INVISIBLE);
        batt3.setVisibility(View.INVISIBLE);

        yes = (Button) findViewById(R.id.complicatedYes);
        no = (Button) findViewById(R.id.complicatedNo);

        blue = false;
        red = false;
        star = false;
        led = false;

        //Red-Blue-Star-LED
        codes.put("0000", "C");
        codes.put("0001", "D");
        codes.put("0010", "C");
        codes.put("0011", "B");
        codes.put("0100", "S");
        codes.put("0101", "P");
        codes.put("0110", "D");
        codes.put("0111", "P");
        codes.put("1000", "S");
        codes.put("1001", "B");
        codes.put("1010", "C");
        codes.put("1011", "B");
        codes.put("1100", "S");
        codes.put("1101", "S");
        codes.put("1110", "P");
        codes.put("1111", "D");

    }

    public void restartClick(View v) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v) {
        finish();
    }

    public void checkWire(View v) {
        String description = "";
        String check = "";
        if (red) {
            check += "1";
            description += "red";
        } else {
            check += "0";
        }
        if (blue) {
            check += "1";
            if(!description.equals("")){ description += "/";}
            description += "blue";
        } else {
            check += "0";
        }
        if (star) {
            check += "1";
            if(!description.equals("")){ description += "/";}
            description += "star";
        } else {
            check += "0";
        }
        if (led) {
            check += "1";
            if(!description.equals("")){ description += "/";}
            description += "LED";
        } else {
            check += "0";
        }

        String code = codes.get(check);

        int c;
        switch (code) {
            case "C":
                instruct.setText("CUT the " + description + " wire");
                break;
            case "D":
                instruct.setText("DO NOT cut the " + description + " wire");
                break;
            case "S":
                c = checkSerial();
                if (c == 0) {
                    instruct.setText("CUT the " + description + " wire");
                }
                if (c == 1) {
                    instruct.setText("DO NOT cut the " + description + " wire");
                }
                break;
            case "P":
                c = checkPort();
                if (c == 1) {
                    instruct.setText("CUT the " + description + " wire");
                }
                if (c == 0) {
                    instruct.setText("DO NOT cut the " + description + " wire");
                }
                break;
            case "B":
                c = checkBatt();
                if (c >= 2) {
                    instruct.setText("CUT the " + description + " wire");
                } else if (c >= 0) {
                    instruct.setText("DO NOT cut the " + description + " wire");
                }
                break;
        }

    }

    private int checkSerial() {
        if (ModuleSelection.serial_number_odd >= 0) {
            return ModuleSelection.serial_number_odd;
        }
        instruct.setText("Waiting for information");
        extraQ.setText("Is the last digit of the Serial Number Odd?");
        extra = "serial";
        extraQuestion.setVisibility(View.VISIBLE);

        return -1;
    }

    private int checkPort() {
        if (ModuleSelection.parallel_port >= 0) {
            return ModuleSelection.parallel_port;
        }
        instruct.setText("Waiting for information");
        extraQ.setText("Does the bomb have a Parallel Port?");
        extra = "port";
        extraQuestion.setVisibility(View.VISIBLE);

        return -1;
    }

    private int checkBatt() {
        if (ModuleSelection.num_batteries >= 0) {
            return ModuleSelection.num_batteries;
        }
        instruct.setText("Waiting for information");
        extraQ.setText("How many Batteries are on the bomb?");
        extra = "batt";
        batt1.setVisibility(View.VISIBLE);
        batt3.setVisibility(View.VISIBLE);
        yes.setText("0");
        no.setText("2");
        extraQuestion.setVisibility(View.VISIBLE);

        return -1;
    }

    public void buttonClick(View v) {
        extraQuestion.setVisibility(View.INVISIBLE);
        if (batt1.getVisibility() == View.VISIBLE) {
            batt1.setVisibility(View.INVISIBLE);
            batt3.setVisibility(View.INVISIBLE);
            yes.setText("Yes");
            no.setText("No");
        }
        switch (extra) {
            case "serial":
                if (v.getId() == R.id.complicatedYes) {
                    ModuleSelection.serial_number_odd = 1;
                } else {
                    ModuleSelection.serial_number_odd = 0;
                }
                checkWire(v);
                break;
            case "port":
                if (v.getId() == R.id.complicatedYes) {
                    ModuleSelection.parallel_port = 1;
                } else {
                    ModuleSelection.parallel_port = 0;
                }
                checkWire(v);
                break;
            case "batt":
                switch (v.getId()) {
                    case R.id.complicatedYes:
                        ModuleSelection.num_batteries = 0;
                        break;
                    case R.id.complicatedNo:
                        ModuleSelection.num_batteries = 2;
                        break;
                    case R.id.complicatedBatt1:
                        ModuleSelection.num_batteries = 1;
                        break;
                    case R.id.complicatedBatt3:
                        ModuleSelection.num_batteries = 3;
                        break;
                }
                checkWire(v);
                break;
        }

    }

    public void checkboxClicked(View v) {

        boolean checked = ((CheckBox) v).isChecked();

        switch (v.getId()) {
            case R.id.complicatedBlue:
                blue = checked;
                break;
            case R.id.complicatedRed:
                red = checked;
                break;
            case R.id.complicatedStar:
                star = checked;
                break;
            case R.id.complicatedLed:
                led = checked;
                break;
        }

    }
}
