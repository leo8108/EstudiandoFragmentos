package com.leonardo.estudiandofragmentos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragmento fragmento = new Fragmento();
        getSupportFragmentManager().beginTransaction().add(R.id.contenedor1,fragmento).commit();
    }
}