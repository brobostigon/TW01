package com.taylorworld.tw01

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText;

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(findViewById(R.id.my_toolbar))

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

//    public class ChrStats extends Activity
//    {

//        private SharedPreferences savedFields
//        private Button saveButton;
//        private EditText editText;
//        private EditText editText2;
//        private EditText editText3;
//        private EditText editText4;
//        private EditText editText5;
//        private EditText editText6;
//        private EditText editText7;
// Add all your EditTexts...

// Upon creating your Activity, reload all the saved values.
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.your_layout);

//            saveButton = (Button) findViewById (R.id.your_save_button_id);
//            editText = (EditText) findViewById (R.id.your_edit_text_1_id);
//            editText2 = (EditText) findViewById (R.id.your_edit_text_2_id);
//            editText3 = (EditText) findViewById (R.id.your_edit_text_3_id);
//            editText4 = (EditText) findViewById (R.id.your_edit_text_4_id);
//            editText5 = (EditText) findViewById (R.id.your_edit_text_5_id);
//            editText6 = (EditText) findViewById (R.id.your_edit_text_6_id);
//            editText7 = (EditText) findViewById (R.id.your_edit_text_7_id);
            // Keep adding all your EditTexts the same way...

            // "info" is just a tag name, use anything you like
//            savedFields = getSharedPreferences("info", MODE_PRIVATE);

            // In case no value is already saved, use a Default Value
//            editText.setText(savednotes.getString("editText1", "Default Value 1"));
//            editText2.setText(savednotes.getString("editText2", "Default Value 2"));
//            editText3.setText(savednotes.getString("editText3", "Default Value 3"));
//            editText4.setText(savednotes.getString("editText4", "Default Value 4"));
//            editText5.setText(savednotes.getString("editText5", "Default Value 5"));
//            editText6.setText(savednotes.getString("editText6", "Default Value 6"));
//            editText7.setText(savednotes.getString("editText7", "Default Value 7"));

            // Save the changes upon button click
//            saveButton.setOnClickListener(saveButtonListener);
//        }

//        public OnClickListener saveButtonListener = new OnClickListener () {
//            @Override
//            public void onClick(View v) {
//                SharedPreferences.Editor preferencesEditor = savedFields . edit ();
//                if (editText.getText().length() > 0) // Not empty
//                    preferencesEditor.putString("editText", editText.getText());
//                if (editText2.getText().length() > 0) // Not empty
//                    preferencesEditor.putString("editText2", editText2.getText());
//                if (editText3.getText().length() > 0) // Not empty
//                    preferencesEditor.putString("editText3", editText3.getText());
//                if (editText4.getText().length() > 0) // Not empty
//                    preferencesEditor.putString("editText4", editText4.getText());
//                if (editText5.getText().length() > 0) // Not empty
//                    preferencesEditor.putString("editText5", editText5.getText());
//                if (editText6.getText().length() > 0) // Not empty
//                    preferencesEditor.putString("editText6", editText6.getText());
//                if (editText7.getText().length() > 0) // Not empty
//                    preferencesEditor.putString("editText7", editText7.getText());
                // You can make a function so you woudn't have to repeat the same code for each EditText

                // At the end, save (commit) all the changes
//                preferencesEditor.commit();
//            }
//       }
    }
//}