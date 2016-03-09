package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import finalproject.bombdefuser.ModuleSelection;
import finalproject.bombdefuser.R;

public class WhosOnFirst extends AppCompatActivity {

    AutoCompleteTextView input;
    Button done, notYet;
    TextView word, instruct;

    String curr;

    String[] wordList;
    int index;

    HashMap<String, String[]> lists = new HashMap<>();
    HashMap<String, String> buttons = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whos_on_first);

        input = (AutoCompleteTextView) findViewById(R.id.whosonfirstinput);
        done = (Button) findViewById(R.id.whosonfirstdone);
        notYet = (Button) findViewById(R.id.whosonfirstnotyet);
        word = (TextView) findViewById(R.id.whosonfirstword);
        instruct = (TextView) findViewById(R.id.whosonfirstinstruct);

        String[] suggestions = getResources().getStringArray(R.array.whosonfirstsuggestions);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, suggestions);
        input.setAdapter(adapter);

        curr = "display";
        index = 0;

        lists.put("ready", new String[]{"yes", "okay", "what", "middle", "left", "press", "right", "blank", "ready"});
        lists.put("first", new String[]{"left", "okay", "yes", "middle", "no", "right", "nothing", "uhhh", "wait", "ready", "blank", "what", "press", "first"});
        lists.put("no", new String[]{"blank", "uhhh", "wait", "first", "what", "ready", "right", "yes", "nothing", "left", "press", "ok", "no"});
        lists.put("blank", new String[]{"wait", "right", "okay", "middle", "blank"});
        lists.put("nothing", new String[]{"uhhh", "right", "okay", "middle", "yes", "blank", "no", "press", "left", "what", "wait", "first", "nothing"});
        lists.put("yes", new String[]{"okay", "right", "uhhh", "middle", "first", "what", "press", "ready", "nothing", "yes"});
        lists.put("what", new String[]{"uhhh", "what"});
        lists.put("uhhh", new String[]{"ready", "nothing", "left", "what", "okay", "yes", "right", "no", "press", "blank", "uhhh"});
        lists.put("left", new String[]{"right", "left"});
        lists.put("right", new String[]{"yes", "nothing", "ready", "press", "no", "wait", "what", "right"});
        lists.put("middle", new String[]{"blank", "ready", "okay", "what", "nothing", "press", "no", "wait", "left", "middle"});
        lists.put("okay", new String[]{"middle", "no", "first", "yes", "uhh", "nothing", "wait", "okay"});
        lists.put("wait", new String[]{"uhh", "no", "blank", "okay", "yes", "left", "first", "press", "what", "wait"});
        lists.put("press", new String[]{"right", "middle", "yes", "ready", "press"});
        lists.put("you", new String[]{"sure", "you are", "your", "you're", "next", "uh huh", "ur", "hold", "what?", "you"});
        lists.put("you are", new String[]{"your", "next", "like", "uh huh", "what?", "done", "uh uh", "hold", "you", "u", "you're", "sure", "ur", "you are"});
        lists.put("you're", new String[]{"you", "you're"});
        lists.put("ur", new String[]{"done", "u", "ur"});
        lists.put("u", new String[]{"uh huh", "sure", "next", "what?", "you're", "ur", "uh uh", "done", "u"});
        lists.put("uh huh", new String[]{"uh huh"});
        lists.put("uh uh", new String[]{"ur", "u", "you are", "next", "uh uh"});
        lists.put("what?", new String[]{"you", "hold", "you're", "your", "u", "done", "uh uh", "like", "you are", "uh huh", "ur", "next", "what?"});
        lists.put("done", new String[]{"sure", "uh huh", "next", "what?", "your", "ur", "you're", "hold", "like", "you", "u", "you are", "uh uh", "done"});
        lists.put("next", new String[]{"what?", "uh huh", "uh uh", "your", "hold", "sure", "next"});
        lists.put("hold", new String[]{"you are", "u", "done", "uh uh", "you", "ur", "sure", "what?", "you're", "next", "hold"});
        lists.put("sure", new String[]{"you are", "done", "like", "you're", "you", "hold", "uh huh", "ur", "sure"});
        lists.put("like", new String[]{"you're", "next", "u", "ur", "hold", "done", "uh uh", "what?", "uh huh", "you", "like"});



        buttons.put("yes", "Middle Left");
        buttons.put("first", "Top Right");
        buttons.put("display", "Bottom Right");
        buttons.put("okay", "Top Right");
        buttons.put("says", "Bottom Right");
        buttons.put("nothing", "Middle Left");
        buttons.put("", "Bottom Left");
        buttons.put("blank", "Middle Right");
        buttons.put("no", "Bottom Right");
        buttons.put("led", "Middle Left");
        buttons.put("lead", "Bottom Right");
        buttons.put("read", "Middle Right");
        buttons.put("red", "Middle Right");
        buttons.put("reed", "Bottom Left");
        buttons.put("leed", "Bottom Left");
        buttons.put("hold on", "Bottom Right");
        buttons.put("you", "Middle Right");
        buttons.put("you are", "Bottom Right");
        buttons.put("your", "Middle Right");
        buttons.put("you're", "Middle Right");
        buttons.put("ur", "Top Left");
        buttons.put("there", "Bottom Right");
        buttons.put("they're", "Bottom Left");
        buttons.put("their", "Middle Right");
        buttons.put("they are", "Middle Left");
        buttons.put("see", "Bottom Right");
        buttons.put("c", "Top Right");
        buttons.put("cee", "Bottom Right");




        input.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if(actionId == EditorInfo.IME_ACTION_DONE)
                {
                    String text = v.getText().toString().toLowerCase().trim();
                    switch(curr){
                        case "display":
                            getButton(text);
                            break;
                        case "button":
                            getWords(text);
                            break;
                    }
                    return true;
                }
                return false;
            }
        });
    }

    public void restartClick(View v){
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v){
        finish();
    }

    public void getButton(String s){
        if(!buttons.containsKey(s)){
            instruct.setText("That word is not Valid, Try again:");
            return;
        }
        String inst = "What is the word on the ";
        inst += buttons.get(s);
        input.setText("");
        instruct.setText(inst + " button?");
        curr = "button";
    }

    public void getWords(String s){
        if(!lists.containsKey(s)){
            instruct.setText("That word is not Valid, Try again:");
            return;
        }
        instruct.setText("If the word below appears, click it:");
        input.setVisibility(View.INVISIBLE);
        word.setVisibility(View.VISIBLE);
        done.setVisibility(View.VISIBLE);
        notYet.setVisibility(View.VISIBLE);
        index = 0;
        wordList = lists.get(s);
        word.setText(wordList[index].toUpperCase());
    }

    public void buttonClicked(View v){
        switch(v.getId()){
            case R.id.whosonfirstdone:
                word.setVisibility(View.INVISIBLE);
                done.setVisibility(View.INVISIBLE);
                notYet.setVisibility(View.INVISIBLE);
                input.setVisibility(View.VISIBLE);
                input.setText("");
                instruct.setText("What word is Displayed?");
                curr = "display";
                break;
            case R.id.whosonfirstnotyet:
                index++;
                if(index >= wordList.length){
                    index = 0;
                }
                word.setText(wordList[index].toUpperCase());
                break;
        }
    }


}
