package com.example.valentina.punto_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity_punto3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_punto3);
        final EditText eLadoc = (EditText) findViewById(R.id.eLadoc);

    }


    public void onRadioButtonClicked(View view) {

        float ladoc, base, altura, lado1, lado2, radio,area;
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.rCuadrado:
                if (checked) {
                    setContentView(R.layout.cuadrado);
                    final EditText eLadoc = (EditText) findViewById(R.id.eLadoc);
                    final EditText eArea = (EditText) findViewById(R.id.eArea);

                    ladoc = Float.parseFloat(((EditText) eLadoc).getText().toString());
                    area=ladoc*ladoc;
                    eArea.setText(String.valueOf(area));


                }

                break;
            case R.id.rTriangulo:
                if (checked)
                    setContentView(R.layout.triangulo);

                    break;
            case R.id.rRectangulo:
                if (checked)

                    break;
            case R.id.rCirculo:
                if (checked)

                    break;


        }
    }
}


