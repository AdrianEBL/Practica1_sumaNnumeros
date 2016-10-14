package edu.tecii.android.practica1_sumannumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.inputNumber)
    EditText inputNumber;
    @Bind(R.id.inputResult)
    TextView inputResult;
    @Bind(R.id.btnCalculate)
    Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnCalculate)
    public void sumatoria() {
        String valor = inputNumber.getText().toString();
        if(!valor.isEmpty()){
            int num = Integer.parseInt(valor);
            int sum = num*(num+1)/2;

            String resulta = "";
            resulta = "Sumando todos los numeros enteros hasta llegar al numero " + num
                    + " el resultado es: " + sum;
            inputResult.setText(resulta);
        }
    }

}
