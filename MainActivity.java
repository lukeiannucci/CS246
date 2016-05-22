package com.example.luke.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View v) {
        if(v.getId() == R.id.button){
            final EditText scripture = (EditText) findViewById(R.id.sBook);
            final EditText chapter = (EditText) findViewById(R.id.sChapter);
            final EditText verse = (EditText) findViewById(R.id.sVerse);
            Intent i = new Intent(MainActivity.this, Display.class);
            i.putExtra("scriptureBook", scripture.getText().toString());
            i.putExtra("scriptureChapter", chapter.getText().toString());
            i.putExtra("scriptureVerse", verse.getText().toString());
            startActivity(i);
        }
    }
}
