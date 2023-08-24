package com.application.pos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import androidx.fragment.app.Fragment;

public class PosBoxFragment extends Fragment {
    View view;

    RelativeLayout placeOrderBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view= inflater.inflate(R.layout.pos_box_fragment, container, false);
        placeOrderBtn = view.findViewById(R.id.placeOrderBtn);

        placeOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OrderSummaryActivity.class);
                startActivity(intent);
            }
        });
        return  view;



    }
}
