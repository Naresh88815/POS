package com.application.pos;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

public class FragmentMore extends Fragment {
    View view;

    AppCompatButton add_books, add_merchandise, add_vendors;
    LinearLayout holdOrdersBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        view= inflater.inflate(R.layout.fragment_more, container, false);
        add_books = view.findViewById(R.id.add_books);
        add_merchandise = view.findViewById(R.id.add_merchandise);
        add_vendors = view.findViewById(R.id.add_vendors);
        holdOrdersBtn = view.findViewById(R.id.holdOrdersBtn);

        add_books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BooksActivity.class);
                startActivity(intent);
            }
        });

        add_merchandise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BooksActivity.class);
                startActivity(intent);
            }
        });

        add_vendors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BooksActivity.class);
                startActivity(intent);
            }
        });

        holdOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HoldOrdersActivity.class);
                startActivity(intent);
            }
        });


        return  view;
    }
}
