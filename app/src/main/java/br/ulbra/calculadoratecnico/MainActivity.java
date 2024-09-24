package br.ulbra.calculadoratecnico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText txtDecimalA;
    EditText txtDecimalB;
    Button btnsum;
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtDecimalA = findViewById(R.id.txtDecimalA);
        txtDecimalB = findViewById((R.id.txtDecimalB));
        txtResultado = findViewById(R.id.txtResultado);
        btnsum = findViewById(R.id.btnsum);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double v1, v2, result;
                try {
                    v1 = Double.parseDouble(txtDecimalA.getText().toString());
                    v2 = Double.parseDouble(txtDecimalB.getText().toString());
                    result = v1 + v2;
                    txtResultado.setText("o resultado é"+result);

                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "deu erro", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    ;
}
