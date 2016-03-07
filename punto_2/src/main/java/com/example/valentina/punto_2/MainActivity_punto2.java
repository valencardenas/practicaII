package com.example.valentina.punto_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity_punto2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_punto2);
        final EditText eNumero1 = (EditText) findViewById(R.id.eNumero1);
        final EditText eNumero2 = (EditText) findViewById(R.id.eNumero2);
        final EditText eResultado = (EditText) findViewById(R.id.eResultado);
        final RadioGroup rGroup = (RadioGroup) findViewById(R.id.rGrupo);
        Button bBoton = (Button) findViewById(R.id.bBoton);


        bBoton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String resultado1;
                float numero1, numero2, resultado;
                int operacion;
                numero1 = Float.parseFloat(((EditText) eNumero1).getText().toString());
                numero2 = Float.parseFloat(((EditText) eNumero2).getText().toString());
                operacion = rGroup.getCheckedRadioButtonId();
                switch (operacion) {
                    case R.id.rSuma:
                        resultado = numero1 + numero2;
                        resultado1 = "=" + resultado;
                        break;
                    case R.id.rResta:
                        resultado = numero1 - numero2;
                        resultado1 = "=" + resultado;
                        break;
                    case R.id.rMultiplicacion:
                        resultado = numero1 * numero2;
                        resultado1 = "=" + resultado;
                        break;
                    case R.id.rDivision:
                        resultado = numero1 / numero2;
                        resultado1 = "=" + resultado;
                        break;
                    default:
                        resultado=0;
                        resultado1="error";
                        break;

                }


                    eResultado.setText(resultado1);

            }

            });
    }
}
