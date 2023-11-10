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
    ContributeFragment contributeFragment = new ContributeFragment();
    SavedFragment savedFragment = new SavedFragment();
    GoFragment goFragment = new GoFragment();
    UpdatesFragment updatesFragment = new UpdatesFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_bar_layout);

        getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, exploreFragment).commit();

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.mExplore) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, exploreFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mGo) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, goFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mSaved) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, savedFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mContribute) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, contributeFragment).commit();
                    return true;
                } else if (item.getItemId() == R.id.mUpdates) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.idContainerNavView, updatesFragment).commit();
                    return true;
                }

                return false;
            }
        });


    }
}