package com.taylorworld.tw01;

public class ChrStats extends Activity
{

    private SharedPreferences savedFields;
    private Button saveButton;
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
// Add all your EditTexts...

    // Upon creating your Activity, reload all the saved values.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.your_layout);

        saveButton = (Button) findViewById (R.id.your_save_button_id);
        editText = (EditText) findViewById (R.id.your_edit_text_1_id);
        editText2 = (EditText) findViewById (R.id.your_edit_text_2_id);
        editText3 = (EditText) findViewById (R.id.your_edit_text_3_id);
        editText4 = (EditText) findViewById (R.id.your_edit_text_4_id);
        editText5 = (EditText) findViewById (R.id.your_edit_text_5_id);
        editText6 = (EditText) findViewById (R.id.your_edit_text_6_id);
        editText7 = (EditText) findViewById (R.id.your_edit_text_7_id);
        // Keep adding all your EditTexts the same way...

        // "info" is just a tag name, use anything you like
        savedFields = getSharedPreferences("info", MODE_PRIVATE);

        // In case no value is already saved, use a Default Value
        editText.setText(savedFields.getString("editText1", "Default Value 1"));
        editText2.setText(savedfields.getString("editText2", "Default Value 2"));
        editText3.setText(savedfields.getString("editText3", "Default Value 3"));
        editText4.setText(savedfields.getString("editText4", "Default Value 4"));
        editText5.setText(savedFields.getString("editText5", "Default Value 5"));
        editText6.setText(savedfields.getString("editText6", "Default Value 6"));
        editText7.setText(savedfields.getString("editText7", "Default Value 7"));

        // Save the changes upon button click
        saveButton.setOnClickListener(saveButtonListener);
    }

    public OnClickListener saveButtonListener = new OnClickListener () {
        @Override
        public void onClick(View v) {
            SharedPreferences.Editor preferencesEditor = savedFields . edit ();
            if (editText.getText().length() > 0) // Not empty
                preferencesEditor.putString("editText", editText.getText());
            if (editText2.getText().length() > 0) // Not empty
                preferencesEditor.putString("editText2", editText2.getText());
            if (editText3.getText().length() > 0) // Not empty
                preferencesEditor.putString("editText3", editText3.getText());
            if (editText4.getText().length() > 0) // Not empty
                preferencesEditor.putString("editText4", editText4.getText());
            if (editText5.getText().length() > 0) // Not empty
                preferencesEditor.putString("editText5", editText5.getText());
            if (editText6.getText().length() > 0) // Not empty
                preferencesEditor.putString("editText6", editText6.getText());
            if (editText7.getText().length() > 0) // Not empty
                preferencesEditor.putString("editText7", editText7.getText());
            // You can make a function so you woudn't have to repeat the same code for each EditText

            // At the end, save (commit) all the changes
            preferencesEditor.commit();
        }
    }
}
