package com.myappneelclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class RatingbarActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView tvRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratingbar);
        ratingBar = findViewById(R.id.ratingbar);
        tvRating = findViewById(R.id.tv_ratingbar);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float ratingbar, boolean b) {
                tvRating.setText(String.valueOf(ratingbar));
            }
        });

    }
}