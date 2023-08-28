package com.application.pos;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class BooksActivity extends AppCompatActivity {

    AppCompatButton filtersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.books_activity);

        filtersBtn = findViewById(R.id.filtersBtn);

        filtersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BooksActivity.this, AddBooksActivity.class);
                startActivity(intent);
            }
        });
    }
}
