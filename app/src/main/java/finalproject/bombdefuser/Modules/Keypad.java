package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.graphics.Point;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import finalproject.bombdefuser.R;

public class Keypad extends AppCompatActivity {

    String icons[];
    int i;

    String[] sol1 = {"mirror", "at", "lambda", "bolt", "squid", "h", "backc"};
    String[] sol2 = {"backe", "mirror", "backc", "walt", "emptystar", "h", "questmark"};
    String[] sol3 = {"copyright", "controller", "walt", "kk", "cane", "lambda", "emptystar"};
    String[] sol4 = {"six", "paragraph", "tb", "squid", "kk", "questmark", "face"};
    String[] sol5 = {"trident", "face", "tb", "cwithdot", "paragraph", "three", "filledstar"};
    String[] sol6 = {"six", "backe", "hashtag", "ae", "trident", "n", "omega"};


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

    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v){
        finish();
    }

    public void iconClicked(String icon){
        if(i > 3){
            i = 0;
        }
        icons[i] = icon;
        i++;
        if(icons.length > 3){
            giveInstructions();
        }
    }

    public void giveInstructions(){
        for(String[] sol : solutions){
            String[] check = icons.clone();
            String solution = "";
            linearLayout.removeAllViews();
            int iconsFound = 0;
            for(String icon : sol){
                for(int c = 0; c < icons.length; c++){
                    String s = check[c];
                    if(s != null){
                        if(s.equals(icon)){
                            solution += " " + icon;
                            check[c] = "";
                            iconsFound++;
                            int iconID = getResources().getIdentifier(icon , "drawable", getPackageName());
                            ImageView iv = new ImageView(this);
                            iv.setImageResource(iconID);
                            linearLayout.addView(iv);
                        }
                    }
                }
            }
            if(iconsFound > 3){
                prompt.setText("Click in this order:");
                linearLayout.setVisibility(View.VISIBLE);
                scrollView.setVisibility(View.INVISIBLE);
                return;
            }
        }
    }

    public void keypadae(View v){
        iconClicked("ae");
    }
    public void keypadAT(View v){
        iconClicked("at");
    }
    public void keypadBackC(View v){
        iconClicked("backc");
    }
    public void keypadBackE(View v){
        iconClicked("backe");
    }
    public void keypadBolt(View v){
        iconClicked("bolt");
    }
    public void keypadCane(View v){
        iconClicked("cane");
    }
    public void keypadController(View v){
        iconClicked("controller");
    }
    public void keypadCopyright(View v){
        iconClicked("copyright");
    }public void keypadCWithDot(View v){
        iconClicked("cwithdot");
    }public void keypadEmptyStar(View v){
        iconClicked("emptystar");
    }public void keypadFace(View v){
        iconClicked("face");
    }public void keypadFilledStar(View v){
        iconClicked("filledstar");
    }public void keypadH(View v){
        iconClicked("h");
    }public void keypadHashtag(View v){
        iconClicked("hashtag");
    }public void keypadKK(View v){
        iconClicked("kk");
    }public void keypadLambda(View v){
        iconClicked("lambda");
    }public void keypadMirror(View v){
        iconClicked("mirror");
    }public void keypadN(View v){
        iconClicked("n");
    }public void keypadOmega(View v){
        iconClicked("omega");
    }public void keypadParagraph(View v){
        iconClicked("paragraph");
    }public void keypadQuestion(View v){
        iconClicked("questmark");
    }public void keypadSix(View v){
        iconClicked("six");
    }public void keypadSquid(View v){
        iconClicked("squid");
    }public void keypadTb(View v){
        iconClicked("tb");
    }public void keypadThree(View v){
        iconClicked("three");
    }public void keypadTrident(View v){
        iconClicked("trident");
    }public void keypadWalt(View v){
        iconClicked("walt");
    }
}
