package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import finalproject.bombdefuser.R;

public class Keypad extends AppCompatActivity {

    String icons[];
    int i;

    String[] sol1 = {"mirror", "keyat", "lambda", "bolt", "squid", "keyh", "backc"};
    String[] sol2 = {"backe", "mirror", "backc", "walt", "emptystar", "keyh", "questmark"};
    String[] sol3 = {"copyright", "controller", "walt", "kk", "cane", "lambda", "emptystar"};
    String[] sol4 = {"six", "paragraph", "tb", "squid", "kk", "questmark", "face"};
    String[] sol5 = {"trident", "face", "tb", "cwithdot", "paragraph", "three", "filledstar"};
    String[] sol6 = {"six", "backe", "hashtag", "keyae", "trident", "keyn", "omega"};


    String[][] solutions = {sol1, sol2, sol3, sol4, sol5, sol6};

    LinearLayout linearLayout;
    TextView prompt;
    ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keypad);

        icons = new String[4];
        i = 0;

        linearLayout = (LinearLayout) findViewById(R.id.solution);
        //linearLayout.setVisibility(View.INVISIBLE);
        prompt = (TextView) findViewById(R.id.keypadprompt);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
    }

    public void restartClick(View v) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v) {
        finish();
    }

    public void iconClicked(String icon) {
        if(i >= icons.length){
            i = 0;
        }
        icons[i] = icon;
        i++;
        if (icons.length > 3) {
            giveInstructions();
        }
    }


    public void giveInstructions() {
        linearLayout.setVisibility(View.INVISIBLE);
        for (String[] sol : solutions) {
            String[] check = icons.clone();
            linearLayout.removeAllViews();
            int iconsFound = 0;
            for (String icon : sol) {
                for (int c = 0; c < icons.length; c++) {
                    String s = check[c];
                    if (s != null) {
                        if (s.equals(icon)) {
                            check[c] = "";
                            iconsFound++;
                            int iconID = getResources().getIdentifier(icon, "drawable", getPackageName());
                            ImageView iv = new ImageView(this);
                            iv.setImageResource(iconID);
                            linearLayout.addView(iv);
                        }
                    }
                }
            }
            if (iconsFound > 3) {
                prompt.setText("Click in this order:");
                linearLayout.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.INVISIBLE);
                return;
            }
        }
    }


    public void keyClick(View v){
        String tag = v.getTag().toString();
        prompt.setText("Click the buttons you see:");

        iconClicked(tag);
    }
}
