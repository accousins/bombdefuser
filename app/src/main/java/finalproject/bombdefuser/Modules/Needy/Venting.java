package finalproject.bombdefuser.Modules.Needy;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import finalproject.bombdefuser.R;

public class Venting extends AppCompatActivity {
    ImageView vent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        vent = (ImageView) findViewById(R.id.imageView2);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venting);

        //vent.setImageResource(R.drawable.vent);
        vent.setVisibility(View.VISIBLE);
    }

    public void differentClick(View v){
        finish();
    }
}
