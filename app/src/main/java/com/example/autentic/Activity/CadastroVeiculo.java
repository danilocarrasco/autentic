package com.example.autentic.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.autentic.R;

public class CadastroVeiculo extends AppCompatActivity {

    Spinner Marca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_veiculo);

        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Marca = (Spinner) findViewById(R.id.spinnerMarca);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Marca, android.R.layout.simple_spinner_item);
        Marca.setAdapter(adapter);
    }
}
