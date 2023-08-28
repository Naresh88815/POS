package com.application.pos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class AddBooksActivity extends AppCompatActivity {
    AppCompatButton addBooksBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_books_activity);
        addBooksBtn = findViewById(R.id.addBookBtn);

        addBooksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddBooksActivity.this, AddBooksListActivity.class);
                startActivity(intent);
            }
        });
    }
}
