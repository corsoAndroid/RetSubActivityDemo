package com.example.sdoro.retsubactivitydemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SubActivity extends AppCompatActivity {

    @Override
     protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("Termina SubActivity");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("messaggio", "ciao, come va?");
                intent.putExtra("cliccato", true);
                intent.putExtra("timestamp", System.currentTimeMillis());
                setResult(10, intent);
                finish();
            }
        });
        setContentView(button);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("messaggio", "pigiato BACK!");
        intent.putExtra("cliccato", false);
        intent.putExtra("timestamp", System.currentTimeMillis());
        setResult(10, intent);
        finish();
    }

}
