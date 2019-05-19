package com.taylorworld.tw01

class ChrStats : Activity() {

    private var savedFields: SharedPreferences? = null
    private var saveButton: Button? = null
    private var editText: EditText? = null
    private var editText2: EditText? = null
    private var editText3: EditText? = null
    private var editText4: EditText? = null
    private var editText5: EditText? = null
    private var editText6: EditText? = null
    private var editText7: EditText? = null

    var saveButtonListener: OnClickListener = object : OnClickListener() {
        fun onClick(v: View) {
            val preferencesEditor = savedFields!!.edit()
            if (editText!!.getText().length() > 0)
            // Not empty
                preferencesEditor.putString("editText", editText!!.getText())
            if (editText2!!.getText().length() > 0)
            // Not empty
                preferencesEditor.putString("editText2", editText2!!.getText())
            if (editText3!!.getText().length() > 0)
            // Not empty
                preferencesEditor.putString("editText3", editText3!!.getText())
            if (editText4!!.getText().length() > 0)
            // Not empty
                preferencesEditor.putString("editText4", editText4!!.getText())
            if (editText5!!.getText().length() > 0)
            // Not empty
                preferencesEditor.putString("editText5", editText5!!.getText())
            if (editText6!!.getText().length() > 0)
            // Not empty
                preferencesEditor.putString("editText6", editText6!!.getText())
            if (editText7!!.getText().length() > 0)
            // Not empty
                preferencesEditor.putString("editText7", editText7!!.getText())
            // You can make a function so you woudn't have to repeat the same code for each EditText

            // At the end, save (commit) all the changes
            preferencesEditor.commit()
        }
    }
    // Add all your EditTexts...

    // Upon creating your Activity, reload all the saved values.
    protected fun onCreate(savedInstanceState: Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.your_layout)

        saveButton = findViewById(R.id.your_save_button_id) as Button
        editText = findViewById(R.id.your_edit_text_1_id) as EditText
        editText2 = findViewById(R.id.your_edit_text_2_id) as EditText
        editText3 = findViewById(R.id.your_edit_text_3_id) as EditText
        editText4 = findViewById(R.id.your_edit_text_4_id) as EditText
        editText5 = findViewById(R.id.your_edit_text_5_id) as EditText
        editText6 = findViewById(R.id.your_edit_text_6_id) as EditText
        editText7 = findViewById(R.id.your_edit_text_7_id) as EditText
        // Keep adding all your EditTexts the same way...

        // "info" is just a tag name, use anything you like
        savedFields = getSharedPreferences("info", MODE_PRIVATE)

        // In case no value is already saved, use a Default Value
        editText!!.setText(savedFields.getString("editText1", "Default Value 1"))
        editText2!!.setText(savedFields.getString("editText2", "Default Value 2"))
        editText3!!.setText(savedfields.getString("editText3", "Default Value 3"))
        editText4!!.setText(savedFieldss.getString("editText4", "Default Value 4"))
        editText5!!.setText(savedFields.getString("editText5", "Default Value 5"))
        editText6!!.setText(savedfields.getString("editText6", "Default Value 6"))
        editText7!!.setText(savedfields.getString("editText7", "Default Value 7"))

        // Save the changes upon button click
        saveButton!!.setOnClickListener(saveButtonListener)
    }
}
