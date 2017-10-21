package com.gilbertopapa.gasolina_ou_alcool;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText edt_alcool, edt_gasolina;
    private Button btn_calcular;
    private TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edt_alcool = (EditText) findViewById(R.id.edt_alcool);
        edt_gasolina = (EditText) findViewById(R.id.edt_gasolina);
        btn_calcular = (Button) findViewById(R.id.calcular);
        text_result = (TextView) findViewById(R.id.text_result);


        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                double priceGasolina = 0, priceAlcool = 0, priceResult = 0;

                priceGasolina = Double.parseDouble(String.valueOf(edt_gasolina.getText()));
                priceAlcool = Double.parseDouble(String.valueOf(edt_alcool.getText()));


                if (priceAlcool == 0 && priceGasolina == 0) {

                    Toast.makeText(getApplicationContext(), "Preecha os campos", Toast.LENGTH_LONG).show();
                } else {
                    if (priceGasolina * 0.70 > priceAlcool) {

                        text_result.setText("Abasteça com Álcool");

                    } else {
                        text_result.setText("Abasteça com Gasolina");

                    }


                }


            }
        });

    }
}
