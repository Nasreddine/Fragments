package edu.nasredine.cheniki.fragments;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity_layout);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String s = extras.getString("planete_item");
            TextView view = (TextView) findViewById(R.id.detailsText);
            view.setText(s);
        }

    }
}

