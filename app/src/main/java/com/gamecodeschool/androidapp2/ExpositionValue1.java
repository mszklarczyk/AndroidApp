package com.gamecodeschool.androidapp2;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
//import android.support.v7.app.AppCompatActivity;

public class ExpositionValue1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button BtnBack;
    private TextView t1;
    private TextView t2;
    private TextView t3;
    private TextView t4;
    private TextView t5;
    private TextView t6;
    DatabaseHelper helper;

    String[] spinnerValue={"X0", "XC1", "XC2", "XC3", "XC4", "XS1", "XS2", "XS3", "XD1", "XD2", "XD3", "XF1", "XF2", "XF3", "XF4", "XA1", "XA2", "XA3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exposition_value1);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinnerKlasyEkspozycji);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,spinnerValue);

        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);

        t1=findViewById(R.id.textView1f);
        t2=findViewById(R.id.textView2f);
        t3=findViewById(R.id.textView3f);
        t4=findViewById(R.id.textView4f);
        t5=findViewById(R.id.textView5f);
        t6=findViewById(R.id.textView6f);

        BtnBack = findViewById(R.id.BtnActivityTwo);
        BtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    //spinnerKlasyEkspozycji: Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        //Toast.makeText(getApplicationContext(), spinnerValue[position], Toast.LENGTH_LONG).show();
        // https://androidscribbles.wordpress.com/2011/08/10/spinner-data-source-from-a-string-array/
        helper= new DatabaseHelper(this);
        SQLiteDatabase db = helper.getWritableDatabase();
        Cursor resultSet = db.rawQuery("Select * from tabPNEN_206 WHERE ID ='"+spinnerValue[position] +"'" ,null);

        resultSet.moveToFirst();
        String ID_str = resultSet.getString(resultSet.getColumnIndex("ID"));
        String Min_klasa_str = resultSet.getString(resultSet.getColumnIndex("Min_klasa"));
        String Min_cement1_str = resultSet.getString(resultSet.getColumnIndex("Min_cement1"));
        String Min_cement2_str = resultSet.getString(resultSet.getColumnIndex("Min_cement2"));
        String Min_cement3_str = resultSet.getString(resultSet.getColumnIndex("Min_cement3"));
        String Min_PL1_str = resultSet.getString(resultSet.getColumnIndex("Min_PL1"));
        String Min_PL2_str = resultSet.getString(resultSet.getColumnIndex("Min_PL2"));
        String Max_woda_str = resultSet.getString(resultSet.getColumnIndex("Max_woda"));
        String Max_wc_str = resultSet.getString(resultSet.getColumnIndex("Max_wc"));
        String Min_powietrze_str = resultSet.getString(resultSet.getColumnIndex("Min_powietrze"));
        String Wymagania_cement_str = resultSet.getString(resultSet.getColumnIndex("Wymagania_cement"));
        String Wymagania_kruszywo_str = resultSet.getString(resultSet.getColumnIndex("Wymagania_kruszywo"));
        String Otulenie_str = resultSet.getString(resultSet.getColumnIndex("Otulenie"));

        resultSet.close();

        t1.setText(Min_klasa_str);
        t2.setText(Min_cement1_str);
        t3.setText(Min_cement2_str);
        t4.setText(Min_cement3_str);
        t5.setText(Min_PL1_str);
        t6.setText(Min_PL2_str);
        //Toast.makeText(getApplicationContext(), Min_klasa_str, Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
// TODO Auto-generated method stub

    }

    public void onBackPressed(){
        finish();
    }
}