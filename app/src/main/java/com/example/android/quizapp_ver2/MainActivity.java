package com.example.android.quizapp_ver2;

        import android.content.Context;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioButton;

/**
 * This app presents the survey and feedback result after 2018 global sales kickoff.
 */

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * This method is called when the Next button is clicked.
     */
    public void nextPage(View view) {
        EditText nameField = findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        /**
         * To navigate from one screen to another screen.
         */
        final Context context = this;
        Intent intent = new Intent(context, MainActivity2.class);
        startActivity(intent);
    }


    /**
     * This method is called when the radio buttons are clicked; Question #2.
     */

    public void onRadioButtonClickedonQuiz2(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.sales:
                if (checked)
                    // When the role is a SALES (Quota) - Field Representatives and Management
                    break;
            case R.id.non_quota_sales:
                if (checked)
                    // When the role is a SALES (Non-Quota) - Support and Other
                    break;
            case R.id.non_sales:
                if (checked)
                    // When the role is a NON-SALES
                    break;
        }
    }


    /**
     * This method is called when the radio buttons are clicked; Question #3.
     */

    public void onRadioButtonClickedonQuiz3(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.americas:
                if (checked)
                    // When an employee is for Americas region
                    break;
            case R.id.europe:
                if (checked)
                    // When an employee is for Europe region
                    break;
            case R.id.asia:
                if (checked)
                    // When an employee is for Asia region
                    break;
        }
    }


}