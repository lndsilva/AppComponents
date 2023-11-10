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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_bar_layout);

        Toast t = new Toast(this);

        t.setGravity(Gravity.CENTER, 100, 300);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.mExplore) {
                    t.makeText(getApplicationContext(), "Cliquei no Explore", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mGo) {
                    t.makeText(getApplicationContext(), "Cliquei no Go", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mSaved) {
                    t.makeText(getApplicationContext(), "Cliquei no Saved", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mContribute) {
                    t.makeText(getApplicationContext(), "Cliquei no Contribute", Toast.LENGTH_SHORT).show();
                } else if (item.getItemId() == R.id.mUpdates) {
                    t.makeText(getApplicationContext(), "Cliquei no Updates", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
    }
}