package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import finalproject.bombdefuser.R;

public class CompWires extends AppCompatActivity {

    TextView modSpecific, toCut, cutText, wire1, wire2, wire3, wire4, wire5, wire6;
    CheckBox hasParallel, numBats, serialDigit,
    hasRed_1, hasBlue_1, hasStar_1, hasLED_1,
    hasRed_2, hasBlue_2, hasStar_2, hasLED_2,
    hasRed_3, hasBlue_3, hasStar_3, hasLED_3,
    hasRed_4, hasBlue_4, hasStar_4, hasLED_4,
    hasRed_5, hasBlue_5, hasStar_5, hasLED_5,
    hasRed_6, hasBlue_6, hasStar_6, hasLED_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_wires);

        modSpecific = (TextView) findViewById(R.id.modSpecific);
        toCut = (TextView) findViewById(R.id.toCut);
        cutText = (TextView) findViewById(R.id.cutText);

        wire1 = (TextView) findViewById(R.id.wire1);
        wire2 = (TextView) findViewById(R.id.wire2);
        wire3 = (TextView) findViewById(R.id.wire3);
        wire4 = (TextView) findViewById(R.id.wire4);
        wire5 = (TextView) findViewById(R.id.wire5);
        wire6 = (TextView) findViewById(R.id.wire6);

        hasParallel = (CheckBox) findViewById(R.id.hasParallel);
        numBats = (CheckBox) findViewById(R.id.numBats);
        serialDigit = (CheckBox) findViewById(R.id.serialDigit);

        hasRed_1 = (CheckBox) findViewById(R.id.hasRed_1);
        hasBlue_1 = (CheckBox) findViewById(R.id.hasBlue_1);
        hasStar_1 = (CheckBox) findViewById(R.id.hasStar_1);
        hasLED_1 = (CheckBox) findViewById(R.id.hasLED_1);

        hasRed_2 = (CheckBox) findViewById(R.id.hasRed_2);
        hasBlue_2 = (CheckBox) findViewById(R.id.hasBlue_2);
        hasStar_2 = (CheckBox) findViewById(R.id.hasStar_2);
        hasLED_2 = (CheckBox) findViewById(R.id.hasLED_2);

        hasRed_3 = (CheckBox) findViewById(R.id.hasRed_3);
        hasBlue_3 = (CheckBox) findViewById(R.id.hasBlue_3);
        hasStar_3 = (CheckBox) findViewById(R.id.hasStar_3);
        hasLED_3 = (CheckBox) findViewById(R.id.hasLED_3);

        hasRed_4 = (CheckBox) findViewById(R.id.hasRed_4);
        hasBlue_4 = (CheckBox) findViewById(R.id.hasBlue_4);
        hasStar_4 = (CheckBox) findViewById(R.id.hasStar_4);
        hasLED_4 = (CheckBox) findViewById(R.id.hasLED_4);

        hasRed_5 = (CheckBox) findViewById(R.id.hasRed_5);
        hasBlue_5 = (CheckBox) findViewById(R.id.hasBlue_5);
        hasStar_5 = (CheckBox) findViewById(R.id.hasStar_5);
        hasLED_5 = (CheckBox) findViewById(R.id.hasLED_5);

        hasRed_6 = (CheckBox) findViewById(R.id.hasRed_6);
        hasBlue_6 = (CheckBox) findViewById(R.id.hasBlue_6);
        hasStar_6 = (CheckBox) findViewById(R.id.hasStar_6);
        hasLED_6 = (CheckBox) findViewById(R.id.hasLED_6);
    }

    public void updateWires(View v){
        //cut text to compare
        switch(v.getId()){
            case R.id.hasRed_1:
                getCuts("First",(String) toCut.getText());
                break;
            case R.id.hasBlue_1:
                getCuts("First",(String) toCut.getText());
                break;
            case R.id.hasStar_1:
                getCuts("First",(String) toCut.getText());
                break;
            case R.id.hasLED_1:
                getCuts("First",(String) toCut.getText());
                break;

            case R.id.hasRed_2:
                getCuts("Second",(String) toCut.getText());
                break;
            case R.id.hasBlue_2:
                getCuts("Second",(String) toCut.getText());
                break;
            case R.id.hasStar_2:
                getCuts("Second",(String) toCut.getText());
                break;
            case R.id.hasLED_2:
                getCuts("Second",(String) toCut.getText());
                break;

            case R.id.hasRed_3:
                getCuts("Third",(String) toCut.getText());
                break;
            case R.id.hasBlue_3:
                getCuts("Third",(String) toCut.getText());
                break;
            case R.id.hasStar_3:
                getCuts("Third",(String) toCut.getText());
                break;
            case R.id.hasLED_3:
                getCuts("Third",(String) toCut.getText());
                break;

            case R.id.hasRed_4:
                getCuts("Fourth",(String) toCut.getText());
                break;
            case R.id.hasBlue_4:
                getCuts("Fourth",(String) toCut.getText());
                break;
            case R.id.hasStar_4:
                getCuts("Fourth",(String) toCut.getText());
                break;
            case R.id.hasLED_4:
                getCuts("Fourth",(String) toCut.getText());
                break;

            case R.id.hasRed_5:
                getCuts("Fifth",(String) toCut.getText());
                break;
            case R.id.hasBlue_5:
                getCuts("Fifth",(String) toCut.getText());
                break;
            case R.id.hasStar_5:
                getCuts("Fifth",(String) toCut.getText());
                break;
            case R.id.hasLED_5:
                getCuts("Fifth",(String) toCut.getText());
                break;

            case R.id.hasRed_6:
                getCuts("Sixth",(String) toCut.getText());
                break;
            case R.id.hasBlue_6:
                getCuts("Sixth",(String) toCut.getText());
                break;
            case R.id.hasStar_6:
                getCuts("Sixth",(String) toCut.getText());
                break;
            case R.id.hasLED_6:
                getCuts("Sixth",(String) toCut.getText());
                break;
        }
//        //cut first conditions
//        if (getWireChecks("").get(0) && getWireChecks("").get(1) && getWireChecks("").get(2)&& getWireChecks("").get(3)) {
//            if(!currText.contains("")) {
//                toCut.append("\n");
//            }
//        }
//
//        //only star
//        if (!getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& !getWireChecks("First").get(3)) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //star, red
//        if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& !getWireChecks("First").get(3)) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //star, red, blue
//        if (getWireChecks("First").get(0) && getWireChecks("First").get(1) && getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && hasParallel.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //star, LED
//        if (!getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && numBats.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //star, blue, LED
//        if (!getWireChecks("First").get(0) && getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && hasParallel.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //star, red, LED
//        if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && numBats.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //only red
//        if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && serialDigit.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //red, blue
//        if (getWireChecks("First").get(0) && getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && serialDigit.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //red, blue, LED
//        if (getWireChecks("First").get(0) && getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && serialDigit.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //red, LED
//        if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& getWireChecks("First").get(3) && numBats.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //only blue
//        if (!getWireChecks("First").get(0) && getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && serialDigit.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
//
//        //blue, LED
//        if (!getWireChecks("First").get(0) && getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& getWireChecks("First").get(3) && hasParallel.isChecked()) {
//            if(!currText.contains("First")) {
//                toCut.append("First\n");
//            }
//        }
    }

    public ArrayList<Boolean> getWireChecks(String wire){
        ArrayList<Boolean> vals = new ArrayList<Boolean>();
        switch(wire){
            case "First":
                vals.add(hasRed_1.isChecked());
                vals.add(hasBlue_1.isChecked());
                vals.add(hasStar_1.isChecked());
                vals.add(hasLED_1.isChecked());
                return vals;
            case "second":
                vals.add(hasRed_2.isChecked());
                vals.add(hasBlue_2.isChecked());
                vals.add(hasStar_2.isChecked());
                vals.add(hasLED_2.isChecked());
                return vals;
            case "third":
                vals.add(hasRed_3.isChecked());
                vals.add(hasBlue_3.isChecked());
                vals.add(hasStar_3.isChecked());
                vals.add(hasLED_3.isChecked());
                return vals;
            case "fourth":
                vals.add(hasRed_4.isChecked());
                vals.add(hasBlue_4.isChecked());
                vals.add(hasStar_4.isChecked());
                vals.add(hasLED_4.isChecked());
                return vals;
            case "fifth":
                vals.add(hasRed_5.isChecked());
                vals.add(hasBlue_5.isChecked());
                vals.add(hasStar_5.isChecked());
                vals.add(hasLED_5.isChecked());
                return vals;
            case "sixth":
                vals.add(hasRed_6.isChecked());
                vals.add(hasBlue_6.isChecked());
                vals.add(hasStar_6.isChecked());
                vals.add(hasLED_6.isChecked());
                return vals;
        }
        return null;
    }

    public void getCuts(String wire, String currText){
        switch(wire){
            case "First":
                //nothing
                if (!getWireChecks("First").get(0) && !getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& !getWireChecks("First").get(3)) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //only star
                if (!getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& !getWireChecks("First").get(3)) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //star, red
                if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& !getWireChecks("First").get(3)) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //star, red, blue
                if (getWireChecks("First").get(0) && getWireChecks("First").get(1) && getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //star, LED
                if (!getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && numBats.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //star, blue, LED
                if (!getWireChecks("First").get(0) && getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //star, red, LED
                if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && numBats.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //only red
                if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //red, blue
                if (getWireChecks("First").get(0) && getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //red, blue, LED
                if (getWireChecks("First").get(0) && getWireChecks("First").get(1) && getWireChecks("First").get(2)&& getWireChecks("First").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //red, LED
                if (getWireChecks("First").get(0) && !getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& getWireChecks("First").get(3) && numBats.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //only blue
                if (!getWireChecks("First").get(0) && getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& !getWireChecks("First").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }

                //blue, LED
                if (!getWireChecks("First").get(0) && getWireChecks("First").get(1) && !getWireChecks("First").get(2)&& getWireChecks("First").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("First")) {
                        toCut.append("First\n");
                    }
                }
                break;
            case "Second":
                //nothing
                if (!getWireChecks("Second").get(0) && !getWireChecks("Second").get(1) && !getWireChecks("Second").get(2)&& !getWireChecks("Second").get(3)) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //only star
                if (!getWireChecks("Second").get(0) && !getWireChecks("Second").get(1) && getWireChecks("Second").get(2)&& !getWireChecks("Second").get(3)) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //star, red
                if (getWireChecks("Second").get(0) && !getWireChecks("Second").get(1) && getWireChecks("Second").get(2)&& !getWireChecks("Second").get(3)) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //star, red, blue
                if (getWireChecks("Second").get(0) && getWireChecks("Second").get(1) && getWireChecks("Second").get(2)&& !getWireChecks("Second").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //star, LED
                if (!getWireChecks("Second").get(0) && !getWireChecks("Second").get(1) && getWireChecks("Second").get(2)&& getWireChecks("Second").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //star, blue, LED
                if (!getWireChecks("Second").get(0) && getWireChecks("Second").get(1) && getWireChecks("Second").get(2)&& getWireChecks("Second").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //star, red, LED
                if (getWireChecks("Second").get(0) && !getWireChecks("Second").get(1) && getWireChecks("Second").get(2)&& getWireChecks("Second").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //only red
                if (getWireChecks("Second").get(0) && !getWireChecks("Second").get(1) && !getWireChecks("Second").get(2)&& !getWireChecks("Second").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //red, blue
                if (getWireChecks("Second").get(0) && getWireChecks("Second").get(1) && !getWireChecks("Second").get(2)&& !getWireChecks("Second").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //red, blue, LED
                if (getWireChecks("Second").get(0) && getWireChecks("Second").get(1) && getWireChecks("Second").get(2)&& getWireChecks("Second").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //red, LED
                if (getWireChecks("Second").get(0) && !getWireChecks("Second").get(1) && !getWireChecks("Second").get(2)&& getWireChecks("Second").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //only blue
                if (!getWireChecks("Second").get(0) && getWireChecks("Second").get(1) && !getWireChecks("Second").get(2)&& !getWireChecks("Second").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }

                //blue, LED
                if (!getWireChecks("Second").get(0) && getWireChecks("Second").get(1) && !getWireChecks("Second").get(2)&& getWireChecks("Second").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Second")) {
                        toCut.append("Second\n");
                    }
                }
                break;

            case "Third":
                //nothing
                if (!getWireChecks("Third").get(0) && !getWireChecks("Third").get(1) && !getWireChecks("Third").get(2)&& !getWireChecks("Third").get(3)) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //only star
                if (!getWireChecks("Third").get(0) && !getWireChecks("Third").get(1) && getWireChecks("Third").get(2)&& !getWireChecks("Third").get(3)) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //star, red
                if (getWireChecks("Third").get(0) && !getWireChecks("Third").get(1) && getWireChecks("Third").get(2)&& !getWireChecks("Third").get(3)) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //star, red, blue
                if (getWireChecks("Third").get(0) && getWireChecks("Third").get(1) && getWireChecks("Third").get(2)&& !getWireChecks("Third").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //star, LED
                if (!getWireChecks("Third").get(0) && !getWireChecks("Third").get(1) && getWireChecks("Third").get(2)&& getWireChecks("Third").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //star, blue, LED
                if (!getWireChecks("Third").get(0) && getWireChecks("Third").get(1) && getWireChecks("Third").get(2)&& getWireChecks("Third").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //star, red, LED
                if (getWireChecks("Third").get(0) && !getWireChecks("Third").get(1) && getWireChecks("Third").get(2)&& getWireChecks("Third").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //only red
                if (getWireChecks("Third").get(0) && !getWireChecks("Third").get(1) && !getWireChecks("Third").get(2)&& !getWireChecks("Third").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //red, blue
                if (getWireChecks("Third").get(0) && getWireChecks("Third").get(1) && !getWireChecks("Third").get(2)&& !getWireChecks("Third").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //red, blue, LED
                if (getWireChecks("Third").get(0) && getWireChecks("Third").get(1) && getWireChecks("Third").get(2)&& getWireChecks("Third").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //red, LED
                if (getWireChecks("Third").get(0) && !getWireChecks("Third").get(1) && !getWireChecks("Third").get(2)&& getWireChecks("Third").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //only blue
                if (!getWireChecks("Third").get(0) && getWireChecks("Third").get(1) && !getWireChecks("Third").get(2)&& !getWireChecks("Third").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }

                //blue, LED
                if (!getWireChecks("Third").get(0) && getWireChecks("Third").get(1) && !getWireChecks("Third").get(2)&& getWireChecks("Third").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Third")) {
                        toCut.append("Third\n");
                    }
                }
                break;

            case "Fourth":
                //nothing
                if (!getWireChecks("Fourth").get(0) && !getWireChecks("Fourth").get(1) && !getWireChecks("Fourth").get(2)&& !getWireChecks("Fourth").get(3)) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //only star
                if (!getWireChecks("Fourth").get(0) && !getWireChecks("Fourth").get(1) && getWireChecks("Fourth").get(2)&& !getWireChecks("Fourth").get(3)) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //star, red
                if (getWireChecks("Fourth").get(0) && !getWireChecks("Fourth").get(1) && getWireChecks("Fourth").get(2)&& !getWireChecks("Fourth").get(3)) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //star, red, blue
                if (getWireChecks("Fourth").get(0) && getWireChecks("Fourth").get(1) && getWireChecks("Fourth").get(2)&& !getWireChecks("Fourth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //star, LED
                if (!getWireChecks("Fourth").get(0) && !getWireChecks("Fourth").get(1) && getWireChecks("Fourth").get(2)&& getWireChecks("Fourth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //star, blue, LED
                if (!getWireChecks("Fourth").get(0) && getWireChecks("Fourth").get(1) && getWireChecks("Fourth").get(2)&& getWireChecks("Fourth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //star, red, LED
                if (getWireChecks("Fourth").get(0) && !getWireChecks("Fourth").get(1) && getWireChecks("Fourth").get(2)&& getWireChecks("Fourth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //only red
                if (getWireChecks("Fourth").get(0) && !getWireChecks("Fourth").get(1) && !getWireChecks("Fourth").get(2)&& !getWireChecks("Fourth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //red, blue
                if (getWireChecks("Fourth").get(0) && getWireChecks("Fourth").get(1) && !getWireChecks("Fourth").get(2)&& !getWireChecks("Fourth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //red, blue, LED
                if (getWireChecks("Fourth").get(0) && getWireChecks("Fourth").get(1) && getWireChecks("Fourth").get(2)&& getWireChecks("Fourth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //red, LED
                if (getWireChecks("Fourth").get(0) && !getWireChecks("Fourth").get(1) && !getWireChecks("Fourth").get(2)&& getWireChecks("Fourth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //only blue
                if (!getWireChecks("Fourth").get(0) && getWireChecks("Fourth").get(1) && !getWireChecks("Fourth").get(2)&& !getWireChecks("Fourth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }

                //blue, LED
                if (!getWireChecks("Fourth").get(0) && getWireChecks("Fourth").get(1) && !getWireChecks("Fourth").get(2)&& getWireChecks("Fourth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Fourth")) {
                        toCut.append("Fourth\n");
                    }
                }
                break;

            case "Fifth":
                //nothing
                if (!getWireChecks("Fifth").get(0) && !getWireChecks("Fifth").get(1) && !getWireChecks("Fifth").get(2)&& !getWireChecks("Fifth").get(3)) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //only star
                if (!getWireChecks("Fifth").get(0) && !getWireChecks("Fifth").get(1) && getWireChecks("Fifth").get(2)&& !getWireChecks("Fifth").get(3)) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //star, red
                if (getWireChecks("Fifth").get(0) && !getWireChecks("Fifth").get(1) && getWireChecks("Fifth").get(2)&& !getWireChecks("Fifth").get(3)) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //star, red, blue
                if (getWireChecks("Fifth").get(0) && getWireChecks("Fifth").get(1) && getWireChecks("Fifth").get(2)&& !getWireChecks("Fifth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //star, LED
                if (!getWireChecks("Fifth").get(0) && !getWireChecks("Fifth").get(1) && getWireChecks("Fifth").get(2)&& getWireChecks("Fifth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //star, blue, LED
                if (!getWireChecks("Fifth").get(0) && getWireChecks("Fifth").get(1) && getWireChecks("Fifth").get(2)&& getWireChecks("Fifth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //star, red, LED
                if (getWireChecks("Fifth").get(0) && !getWireChecks("Fifth").get(1) && getWireChecks("Fifth").get(2)&& getWireChecks("Fifth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //only red
                if (getWireChecks("Fifth").get(0) && !getWireChecks("Fifth").get(1) && !getWireChecks("Fifth").get(2)&& !getWireChecks("Fifth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //red, blue
                if (getWireChecks("Fifth").get(0) && getWireChecks("Fifth").get(1) && !getWireChecks("Fifth").get(2)&& !getWireChecks("Fifth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //red, blue, LED
                if (getWireChecks("Fifth").get(0) && getWireChecks("Fifth").get(1) && getWireChecks("Fifth").get(2)&& getWireChecks("Fifth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //red, LED
                if (getWireChecks("Fifth").get(0) && !getWireChecks("Fifth").get(1) && !getWireChecks("Fifth").get(2)&& getWireChecks("Fifth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //only blue
                if (!getWireChecks("Fifth").get(0) && getWireChecks("Fifth").get(1) && !getWireChecks("Fifth").get(2)&& !getWireChecks("Fifth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }

                //blue, LED
                if (!getWireChecks("Fifth").get(0) && getWireChecks("Fifth").get(1) && !getWireChecks("Fifth").get(2)&& getWireChecks("Fifth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Fifth")) {
                        toCut.append("Fifth\n");
                    }
                }
                break;

            case "Sixth":
                //nothing
                if (!getWireChecks("Sixth").get(0) && !getWireChecks("Sixth").get(1) && !getWireChecks("Sixth").get(2)&& !getWireChecks("Sixth").get(3)) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //only star
                if (!getWireChecks("Sixth").get(0) && !getWireChecks("Sixth").get(1) && getWireChecks("Sixth").get(2)&& !getWireChecks("Sixth").get(3)) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //star, red
                if (getWireChecks("Sixth").get(0) && !getWireChecks("Sixth").get(1) && getWireChecks("Sixth").get(2)&& !getWireChecks("Sixth").get(3)) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //star, red, blue
                if (getWireChecks("Sixth").get(0) && getWireChecks("Sixth").get(1) && getWireChecks("Sixth").get(2)&& !getWireChecks("Sixth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //star, LED
                if (!getWireChecks("Sixth").get(0) && !getWireChecks("Sixth").get(1) && getWireChecks("Sixth").get(2)&& getWireChecks("Sixth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //star, blue, LED
                if (!getWireChecks("Sixth").get(0) && getWireChecks("Sixth").get(1) && getWireChecks("Sixth").get(2)&& getWireChecks("Sixth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //star, red, LED
                if (getWireChecks("Sixth").get(0) && !getWireChecks("Sixth").get(1) && getWireChecks("Sixth").get(2)&& getWireChecks("Sixth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //only red
                if (getWireChecks("Sixth").get(0) && !getWireChecks("Sixth").get(1) && !getWireChecks("Sixth").get(2)&& !getWireChecks("Sixth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //red, blue
                if (getWireChecks("Sixth").get(0) && getWireChecks("Sixth").get(1) && !getWireChecks("Sixth").get(2)&& !getWireChecks("Sixth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //red, blue, LED
                if (getWireChecks("Sixth").get(0) && getWireChecks("Sixth").get(1) && getWireChecks("Sixth").get(2)&& getWireChecks("Sixth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //red, LED
                if (getWireChecks("Sixth").get(0) && !getWireChecks("Sixth").get(1) && !getWireChecks("Sixth").get(2)&& getWireChecks("Sixth").get(3) && numBats.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //only blue
                if (!getWireChecks("Sixth").get(0) && getWireChecks("Sixth").get(1) && !getWireChecks("Sixth").get(2)&& !getWireChecks("Sixth").get(3) && serialDigit.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }

                //blue, LED
                if (!getWireChecks("Sixth").get(0) && getWireChecks("Sixth").get(1) && !getWireChecks("Sixth").get(2)&& getWireChecks("Sixth").get(3) && hasParallel.isChecked()) {
                    if(!currText.contains("Sixth")) {
                        toCut.append("Sixth\n");
                    }
                }
                break;
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
