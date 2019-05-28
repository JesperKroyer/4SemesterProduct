package com.example.ransomewaretest;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText textEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textEdit = findViewById(R.id.passwordfield);
    }


    /*@Override
    protected void onStop(){
        super.onStop();
        if(!textEdit.getText().toString().equals("q123")) {
            Intent Newintent = new Intent(getBaseContext(), MainActivity.class);
            Newintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                    Intent.FLAG_ACTIVITY_CLEAR_TASK |
                    Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(Newintent);
        }
    }*/

  @Override
    protected void onPause() {
        super.onPause();
       if(!textEdit.getText().toString().equals("q123")) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP |
                Intent.FLAG_ACTIVITY_CLEAR_TASK |
                Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }
    }

    public void confirm(View view) {
        if(textEdit.getText().toString().equals("q123")) {
            finish();
            System.exit(0);
        }
        else {
            Toast.makeText(this, "Wrong Password", Toast.LENGTH_LONG).show();
        }
    }


}
