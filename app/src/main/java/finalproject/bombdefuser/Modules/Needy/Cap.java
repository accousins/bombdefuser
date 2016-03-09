package finalproject.bombdefuser.Modules.Needy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import finalproject.bombdefuser.R;

public class Cap extends AppCompatActivity {
    ImageView cap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cap = (ImageView) findViewById(R.id.imageView);
        cap.setImageResource(R.drawable.cap);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap);

        cap.setVisibility(View.VISIBLE);
    }

    public void differentClick(View v){
        finish();
    }
}
