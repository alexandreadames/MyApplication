package com.androiddeveloperbrasil.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText edNum01, edNum02;
    private Button btSomar, btSubtrair, btMultiplicar, btDividir;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum01 = (EditText) findViewById(R.id.edNum01);
        edNum02 = (EditText) findViewById(R.id.edNum02);
        btSomar = (Button) findViewById(R.id.btSomar);
        btSubtrair = (Button) findViewById(R.id.btSubtrair);
        btMultiplicar = (Button) findViewById(R.id.btMultiplicar);
        btDividir = (Button) findViewById(R.id.btDividir);
        tvResultado = (TextView) findViewById(R.id.tvRestulado);

        btSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(edNum01.getText().toString());
                int num2 = Integer.valueOf(edNum02.getText().toString());
                int resultado = num1 + num2;
                tvResultado.setText(String.valueOf(resultado));
            }
        });

        btSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(edNum01.getText().toString());
                int num2 = Integer.valueOf(edNum02.getText().toString());
                int resultado = num1 - num2;
                tvResultado.setText(String.valueOf(resultado));
            }
        });

        btMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(edNum01.getText().toString());
                int num2 = Integer.valueOf(edNum02.getText().toString());
                int resultado = num1 * num2;
                tvResultado.setText(String.valueOf(resultado));
            }
        });

        btDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.valueOf(edNum01.getText().toString());
                int num2 = Integer.valueOf(edNum02.getText().toString());
                int resultado = num1 / num2;
                tvResultado.setText(String.valueOf(resultado));
            }
        });




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
