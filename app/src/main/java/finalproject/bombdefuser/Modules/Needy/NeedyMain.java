package finalproject.bombdefuser.Modules.Needy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import finalproject.bombdefuser.R;

public class NeedyMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needy_selector);
    }

    public void venting(View v){
        Intent intent = new Intent(this, Venting.class);
        startActivity(intent);
    }

    public void cap(View v){
        Intent intent = new Intent(this, Cap.class);
        startActivity(intent);
    }

    public void knob(View v){
        Intent intent = new Intent(this, Knob.class);
        startActivity(intent);
    }
}
