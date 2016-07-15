package com.aclass.buttons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //---Button with a listener ---

        Button btn = (Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Button 3 was clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        //---the two buttons are wired to the same listener---

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(btnListener);

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(btnListener);



        // using the activity as the listener
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);





    }



    //---create an anonymous class to act as a button click listener---
    private View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View view)
        {
            Toast.makeText(getBaseContext(),
                    ((Button) view).getText() + " was clicked!",
                    Toast.LENGTH_LONG).show();
        }
    };



// implementing the listener interface for the activity


    public void onClick(View view) {
        Button btn = (Button) view;
        Toast.makeText(this, btn.getText() + " was clicked!",
                Toast.LENGTH_SHORT).show();
    }

    public void onToggle(View view) {
        ToggleButton btn = (ToggleButton) view;
        Toast.makeText(this, "Toggle mode: " + btn.isChecked(),
                Toast.LENGTH_SHORT).show();
    }

}
