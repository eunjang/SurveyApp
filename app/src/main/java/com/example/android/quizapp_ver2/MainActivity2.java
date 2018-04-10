package com.example.android.quizapp_ver2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;


/**
 * This app presents the survey and feedback result after 2018 global sales kickoff.
 */

public class MainActivity2 extends AppCompatActivity {

    CheckBox awards_dinner, basketball_contest, cruise_dinner, photo_service;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    /**
     * This method is called when the Next button is clicked.
     */
    public void nextPage2(View view) {

        /**
         * To navigate from one screen to another screen.
         */
        final Context context = this;
        Intent intent = new Intent(context, MainActivity3.class);
        startActivity(intent);
    }


    /**
     * This method is called when the check boxes are clicked.
     */
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.awards_dinner:
                if (checked)
                break;
            case R.id.basketball_contest:
                if (checked)
                break;
            case R.id.cruise_dinner:
                if (checked)
                break;
            case R.id.photo_service:
                if (checked)
                break;

        }
    }
}
