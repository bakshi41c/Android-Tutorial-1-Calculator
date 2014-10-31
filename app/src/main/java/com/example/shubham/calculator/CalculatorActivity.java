package com.example.shubham.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CalculatorActivity extends Activity {

    /*
    Declaring all the UI Objects. They are declared here so that they are visible
    to all the methods.
     */

    EditText firstNumber_et;
    EditText secondNumber_et;

    Button plus_btn;
    Button minus_btn;
    Button divide_btn;
    Button multiply_btn;

    TextView result_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // This method sets the layout for this activity. All UI objects must be defined after this.
        setContentView(R.layout.activity_calculator);


         /*
        Defining all the UI objects

        The objects are defined and linked up with layout in XML using the unique ID given to
        every UI element.
        */
        firstNumber_et = (EditText)findViewById(R.id.firstNumber);
        secondNumber_et = (EditText)findViewById(R.id.secondNumber);

        plus_btn = (Button)findViewById(R.id.plus_btn);
        minus_btn = (Button)findViewById(R.id.minus_btn);
        divide_btn = (Button)findViewById(R.id.divide_btn);
        multiply_btn = (Button)findViewById(R.id.multiply_btn);

        result_tv = (TextView)findViewById(R.id.result);
    }

    public void buttonOnClick(View btn){

        /*
        This method is invoked when any of the buttons are clicked.

        This is not a special method and can be renamed. But then
        you have to set all the button's 'onClick' property to the name
        of this method in the XML Layout.

        Different buttons are distinguished using the button's ID.
         */

        double result;

        //Getting the text from the textfields and casting them into double.
        double firstNumber = Double.valueOf(firstNumber_et.getText().toString());
        double secondNumber = Double.valueOf(secondNumber_et.getText().toString());

        // Checking to see which button was clicked
        switch(btn.getId()){

            case R.id.plus_btn:
                result = firstNumber + secondNumber;
                break;

            case R.id.minus_btn:
                result = firstNumber - secondNumber;
                break;

            case R.id.multiply_btn:
                result = firstNumber * secondNumber;
                break;

            case R.id.divide_btn:
                result = firstNumber / secondNumber;
                break;

            default:
                result =0;
        }

    // Finally setting result textView to the calculated result
    result_tv.setText(String.valueOf(result));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
