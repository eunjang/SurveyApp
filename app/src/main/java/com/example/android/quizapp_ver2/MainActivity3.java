package com.example.android.quizapp_ver2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * This app presents the survey and feedback result after 2018 global sales kickoff.
 */

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    /**
     * This method is called when the Next button is clicked.
     */
    public void done(View view) {
        EditText nameField = findViewById(R.id.answer_field);
        String name = nameField.getText().toString();

        Context context = getApplicationContext();
        CharSequence text = "Thanks for your participation!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }



}
