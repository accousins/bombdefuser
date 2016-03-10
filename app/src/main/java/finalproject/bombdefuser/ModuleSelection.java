package finalproject.bombdefuser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import finalproject.bombdefuser.Modules.ButtonMod;
import finalproject.bombdefuser.Modules.CompWires;
import finalproject.bombdefuser.Modules.Complicated;
import finalproject.bombdefuser.Modules.Keypad;
import finalproject.bombdefuser.Modules.Mazes;
import finalproject.bombdefuser.Modules.Memory;
import finalproject.bombdefuser.Modules.MorseCode;
import finalproject.bombdefuser.Modules.Needy.NeedyMain;
import finalproject.bombdefuser.Modules.Passwords;
import finalproject.bombdefuser.Modules.SimonSays;
import finalproject.bombdefuser.Modules.SimpleWires;
import finalproject.bombdefuser.Modules.WhosOnFirst;
import finalproject.bombdefuser.Modules.WireSeq;

public class ModuleSelection extends AppCompatActivity {
    public static int serial_number_odd;
    public static int serial_number_vowel;
    public static int num_batteries;
    public static int CAR;
    public static int FRK;
    public static int parallel_port;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_selection);

        serial_number_odd = -1;
        serial_number_vowel = -1;
        num_batteries = -1;
        CAR = -1;
        FRK = -1;
        parallel_port = -1;
    }

    public void simpleWires(View v){
        Intent intent = new Intent(this, SimpleWires.class);
        startActivity(intent);
    }

    public void buttonMod(View v) {
        Intent intent = new Intent(this, ButtonMod.class);
        startActivity(intent);
    }

    public void memory(View v){
        Intent intent = new Intent(this, Memory.class);
        startActivity(intent);
    }

    public void keypad(View v){
        Intent intent = new Intent(this, Keypad.class);
        startActivity(intent);
    }

    public void simonSays(View v){
        Intent intent = new Intent(this, SimonSays.class);
        startActivity(intent);
    }

    public void whosOnFirst(View v){
        Intent intent = new Intent(this, WhosOnFirst.class);
        startActivity(intent);
    }
    public void morseCode(View v){
        Intent intent = new Intent(this, MorseCode.class);
        startActivity(intent);
    }
    public void compWires(View v){
        Intent intent = new Intent(this, Complicated.class);
        startActivity(intent);
    }

    public void wireSeq(View v){
        Intent intent = new Intent(this, WireSeq.class);
        startActivity(intent);
    }

    public void mazes(View v){
        Intent intent = new Intent(this, Mazes.class);
        startActivity(intent);
    }

    public void passwords(View v){
        Intent intent = new Intent(this, Passwords.class);
        startActivity(intent);
    }

    public void needy(View v){
        Intent intent = new Intent(this, NeedyMain.class);
        startActivity(intent);
    }

}
