package com.example.freddy.radiobutton;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton Azul;
    RadioButton Amarillo;
    RadioButton Rojo;
    ImageView Colores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialUISetup();
    }
    public void initialUISetup() {


        Colores = (ImageView) findViewById(R.id.colores);
        Azul = (RadioButton) findViewById(R.id.azul);
        Amarillo = (RadioButton) findViewById(R.id.amarillo);
        Rojo = (RadioButton) findViewById(R.id.rojo);

        Azul.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        Amarillo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
        Rojo.setOnCheckedChangeListener(new myCheckBoxChangeClicker());
    }

    class myCheckBoxChangeClicker implements RadioButton.OnCheckedChangeListener {

        @Override


        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


            /*Primer Ejercicio*/


            if (buttonView == Azul) {
                Colores.setBackgroundColor(Color.rgb(000, 000, 255));
                Amarillo.setChecked(false);
                Rojo.setChecked(false);
            } else if (buttonView == Amarillo) {
                Colores.setBackgroundColor(Color.rgb(255, 255, 000));
                Azul.setChecked(false);
                Rojo.setChecked(false);

            } else if (buttonView == Rojo) {
                Colores.setBackgroundColor(Color.rgb(255, 000, 000));
                Azul.setChecked(false);
                Amarillo.setChecked(false);
            }




        }

    }
}
