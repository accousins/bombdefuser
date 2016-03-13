package finalproject.bombdefuser.Modules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

import java.util.LinkedList;
import java.util.Stack;

import finalproject.bombdefuser.R;

public class Password extends AppCompatActivity {

    TextView prompt;
    EditText input;

    int currLetter;

    String[] letters;

    String[] words = {"about", "after", "again", "below", "could", "every", "first", "found", "great", "house", "large", "learn", "never", "other", "place", "plant", "point", "right", "small", "sound", "spell", "spill", "study", "their", "there", "these", "thing", "think", "three", "water", "where", "which", "would", "world", "write"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        input = (EditText) findViewById(R.id.passwordInput);
        prompt = (TextView) findViewById(R.id.passwordPrompt);

        currLetter = 0;
        letters = new String[5];

        prompt.setText("Enter all possible first letters:");

        input.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    submit();
                    return true;
                }
                return false;
            }
        });
    }

    public void restartClick(View v) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
    }

    public void differentClick(View v) {
        finish();
    }

    public void submit(View v) {
        submit();
    }

    public void submit() {
        if(currLetter >= letters.length){return;}
        String nextLetters = input.getText().toString();
        input.setText("");

        letters[currLetter] = nextLetters;
        currLetter++;
        if (!checkSolution()) {
            switch (currLetter) {
                case 1:
                    prompt.setText("Enter all possible second letters:");
                    break;
                case 2:
                    prompt.setText("Enter all possible third letters:");
                    break;
                case 3:
                    prompt.setText("Enter all possible fourth letters:");
                    break;
                case 4:
                    prompt.setText("Enter all possible fifth letters:");
                    break;
                case 5:
                    prompt.setText("Input was invalid, restart the module");
                    input.setVisibility(View.INVISIBLE);
                    break;
            }
        }

    }

    private boolean checkSolution(){
        Stack<String> possible = new Stack<>();
            for (String word : words) {
                if (letters[0].contains(word.substring(0, 1))) {
                    possible.add(word);
                }
            }
            if (possible.size() == 1) {
                prompt.setText("The password is " + possible.pop().toUpperCase());
                input.setVisibility(View.INVISIBLE);
                return true;
            }
            for (int c = 1; c < letters.length; c++) {
                if (letters[c] != null) {
                    Stack<String> temp = new Stack<>();
                    for (String word : possible) {
                        if (letters[c].contains(word.substring(c, c + 1))) {
                            temp.add(word);
                        }
                    }
                    possible = temp;
                    if (possible.size() == 1) {
                        prompt.setText("The password is " + possible.pop().toUpperCase());
                        input.setVisibility(View.INVISIBLE);
                        return true;
                    }
                }
            }
            return false;


    }


}
