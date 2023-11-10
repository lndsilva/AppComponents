package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class NavigationBarActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;

    ExploreFragment exploreFragment = new ExploreFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_bar_layout);

        getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, exploreFragment).commit();

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.idRVExplore) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, exploreFragment).commit();
                    return true;
                }

                return false;
            }
        });


    }
}