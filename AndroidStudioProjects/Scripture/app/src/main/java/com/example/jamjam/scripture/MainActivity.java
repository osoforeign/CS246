package com.example.jamjam.scripture;
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

    /*
    * This method transfers the scripture information and
    * changes the activity once the button is pushed
     */
    public void buttonOnClick(View v) {
        EditText inputBook    = (EditText) findViewById(R.id.edittextbook);
        EditText inputChapter = (EditText) findViewById(R.id.edittextchapter);
        EditText inputVerse   = (EditText) findViewById(R.id.edittextverse);

        String bookString    = inputBook.getText().toString();
        String chapterString = inputChapter.getText().toString();
        String verseString   = inputVerse.getText().toString();

        Intent intent = new Intent(MainActivity.this, Main2Activity.class);

        intent.putExtra("bookString", bookString);
        intent.putExtra("chapterString", chapterString);
        intent.putExtra("verseString", verseString);

        startActivity(intent);
    }
}
