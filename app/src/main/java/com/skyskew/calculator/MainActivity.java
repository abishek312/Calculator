package com.skyskew.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private  EditText oper1,oper2;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oper1=(EditText)findViewById(R.id.eTop1);
        oper2=(EditText)findViewById(R.id.eTop2);
        result=(TextView)findViewById(R.id.Tvresult);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void addOperation(View v)
    {

        int res=Integer.parseInt(oper1 .getText().toString())+Integer.parseInt(oper2.getText().toString());
        result.setText(String.valueOf(res));

    }
    public void subOperation(View v)
    {
        int res=Integer.parseInt(oper1 .getText().toString())-Integer.parseInt(oper2.getText().toString());
        result.setText(String.valueOf(res));

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
