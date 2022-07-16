package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void contar(View view){
        this.contador++;
        TextView caixaDeTexto = findViewById(R.id.txtValor);
        caixaDeTexto.setText(String.valueOf(contador));
    }

    public void zerar(View view){
        this.contador = 0;
        TextView caixaDeTexto = findViewById(R.id.txtValor);
        caixaDeTexto.setText(String.valueOf(contador));
    }
}