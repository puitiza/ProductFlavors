package com.example.productflavors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvDepartamento;
    private TextView tvURLDepartamento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDepartamento = findViewById(R.id.mainActivityTvDepartamento);
        tvURLDepartamento = findViewById(R.id.mainActivityTvURLDepartamento);

        tvDepartamento.setText(Departamento.getDepartamento());
        //Si estamos corriendo la app en Build Variant en modo Sales nos saldrá el mensaje Sales
        tvURLDepartamento.setText(BuildConfig.BASE_URL);
    }
}
