package com.gamecodeschool.androidapp2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper helper;

    private Button BtnExpositionMove1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helper= new DatabaseHelper(this);

        BtnExpositionMove1 = findViewById(R.id.BtnExposition1);
        BtnExpositionMove1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToExposition1();
            }
        });

        // Let's take a look at Toast and Log in action
        Toast.makeText(this, "Can you see me",
                Toast.LENGTH_SHORT).show();
        Log.i("info", "Done creating the app");
    }
    private void moveToExposition1(){
        Intent intent=new Intent(MainActivity.this, ExpositionValue1.class);
        startActivity(intent);
    }


    public void topClick(View v){
        Toast.makeText(this, "Top button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the top button");
    }
    public void bottomClick(View v){
        Toast.makeText(this, "Bottom button clicked",
                Toast.LENGTH_SHORT).show();
        Log.i("info","The user clicked the bottom button");
    }

}