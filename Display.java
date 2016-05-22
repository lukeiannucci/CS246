package com.example.luke.scripturereference;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Luke on 5/21/2016.
 */
public class Display extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        TextView book = (TextView)findViewById(R.id.favoriteBook);
        TextView chapter = (TextView)findViewById(R.id.favoriteChapter);
        TextView verse = (TextView)findViewById(R.id.favoriteVerse);
        book.setText(getIntent().getExtras().getString("scriptureBook"));
        chapter.setText(getIntent().getExtras().getString("scriptureChapter"));
        verse.setText(getIntent().getExtras().getString("scriptureVerse"));
    }
}


