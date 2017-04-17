package com.example.sdoro.retsubactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("Lancia SubActivity");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startSubActivity();
            }
        });
        setContentView(button);
    }
    private void startSubActivity() {
        /*
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
        */
        Intent intent = new Intent(this, SubActivity.class);
        startActivityForResult(intent, 10);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == 10) {
            if (resultCode == 0) {
                // Annullato
            } else if (resultCode == 10) {
                // Confermato
                String messaggio = intent.getStringExtra("messaggio");
                boolean cliccato = intent.getBooleanExtra("cliccato", false);
                long timestamp = intent.getLongExtra("timestamp", 0);
            }
        }
    }
}
