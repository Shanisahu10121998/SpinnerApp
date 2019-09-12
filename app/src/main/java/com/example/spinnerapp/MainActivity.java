package com.example.spinnerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
ArrayAdapter arrayAdapter;
private static final String[] Android_Version={
        "select version",
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Ginger Bread",
        "Honey Comb",
        "Icecream",
        "Jellybean",
        "Kitkat",
        "Lolypop",
        "Marshmallow",
        "Noughat",
        "Oreo",
        "Pie"
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner1);
        arrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,Android_Version);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        break;
                    case 1:
                        setContentView(R.layout.cupcake);
                        break;
                    case 2:
                        setContentView(R.layout.donut);
                        break;
                    case 3:
                        setContentView(R.layout.eclair);
                        break;
                    case 4:
                        setContentView(R.layout.froyo);
                        break;
                    case 5:
                        setContentView(R.layout.gingerbread);
                        break;
                    case 6:
                        setContentView(R.layout.honeycomb);
                        break;
                    case 7:
                        setContentView(R.layout.icecream);
                        break;
                    case 8:
                        setContentView(R.layout.jellybean);
                        break;
                    case 9:
                        setContentView(R.layout.kitkat);
                        break;
                    case 10:
                        setContentView(R.layout.lollipop);
                        break;
                    case 11:
                        setContentView(R.layout.marshmallow);
                        break;
                    case 12:
                        setContentView(R.layout.noughat);
                        break;
                    case 13:
                        setContentView(R.layout. oreo);
                        break;
                    case 14:
                        setContentView(R.layout. pie);
                        break;



                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onBackPressed() {
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner1);
        arrayAdapter=new ArrayAdapter(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,Android_Version);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        break;
                    case 1:
                        setContentView(R.layout.cupcake);
                        break;
                    case 2:
                        setContentView(R.layout.donut);
                        break;
                    case 3:
                        setContentView(R.layout.eclair);
                        break;
                    case 4:
                        setContentView(R.layout.froyo);
                        break;
                    case 5:
                        setContentView(R.layout.gingerbread);
                        break;
                    case 6:
                        setContentView(R.layout.honeycomb);
                        break;
                    case 7:
                        setContentView(R.layout.icecream);
                        break;
                    case 8:
                        setContentView(R.layout.jellybean);
                        break;
                    case 9:
                        setContentView(R.layout.kitkat);
                        break;
                    case 10:
                        setContentView(R.layout.lollipop);
                        break;
                    case 11:
                        setContentView(R.layout.marshmallow);
                        break;
                    case 12:
                        setContentView(R.layout.noughat);
                        break;
                    case 13:
                        setContentView(R.layout. oreo);
                        break;
                    case 14:
                        setContentView(R.layout. pie);
                        break;



                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
