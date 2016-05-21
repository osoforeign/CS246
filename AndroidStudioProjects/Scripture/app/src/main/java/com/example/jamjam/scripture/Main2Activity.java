package com.example.jamjam.scripture;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    /*
    * This function simply displays the string on the second activities page
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle bundle = getIntent().getExtras();

        String bookString    = bundle.getString("bookString");
        String chapterString = bundle.getString("chapterString");
        String verseString   = bundle.getString("verseString");

        TextView txtView = (TextView) findViewById(R.id.official);
        txtView.setText(bookString + " " + chapterString + ":" + verseString);
    }
}