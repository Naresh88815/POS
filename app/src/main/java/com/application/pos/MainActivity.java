package com.application.pos;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    LinearLayout topBarLayout, buttons_ltb;
    SearchView searchbar;
    ImageView ltbLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topBarLayout = findViewById(R.id.top_bar_layout);
        buttons_ltb = findViewById(R.id.buttons_ltb);
        searchbar = findViewById(R.id.search_bar);

        searchbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ltbLogo = findViewById(R.id.ltbLogo);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;
                        Fragment posFragment = null;

                        if (item.getItemId() == R.id.navigate_home) {
                            selectedFragment = new FragmentHome();
                        } else if (item.getItemId() == R.id.navigate_orders) {
                            selectedFragment = new FragmentOrder();
                        } else if (item.getItemId() == R.id.navigate_pos) {
                            selectedFragment = new FragmentPOS();
                            posFragment = selectedFragment; // Set posFragment when PosMainFragment is selected
                        } else if (item.getItemId() == R.id.navigate_box) {
                            selectedFragment = new FragmentBox();
                        } else if (item.getItemId() == R.id.navigate_more) {
                            selectedFragment = new FragmentMore();
                        }

                        if (selectedFragment != null) {

                            if (selectedFragment == posFragment) {
                                topBarLayout.setVisibility(View.GONE);
//                                ltbLogo.setVisibility(View.GONE);
//                                searchbar.setVisibility(View.GONE);
//                                buttons_ltb.setVisibility(View.GONE);
                            } else {
                                topBarLayout.setVisibility(View.VISIBLE);
//                                ltbLogo.setVisibility(View.VISIBLE);
//                                searchbar.setVisibility(View.VISIBLE);
//                                buttons_ltb.setVisibility(View.VISIBLE);
                            }

                            FragmentManager fragmentManager = getSupportFragmentManager();
                            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                            fragmentTransaction.replace(R.id.fragment_container, selectedFragment);
                            fragmentTransaction.commit();
                            return true;
                        }

                        return false;
                    }
                }
        );

        // Display the initial fragment
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new FragmentHome())
                    .commit();
        }
    }

}
