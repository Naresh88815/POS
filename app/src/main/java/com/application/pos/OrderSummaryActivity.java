package com.application.pos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class OrderSummaryActivity extends AppCompatActivity {
    RelativeLayout orderSummaryPlaceOrderBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_summary);

        orderSummaryPlaceOrderBtn = findViewById(R.id.orderSummaryPlaceOrderBtn);

        orderSummaryPlaceOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderSummaryActivity.this, PaymentActivity.class);
                startActivity(intent);
            }
        });
    }
}
