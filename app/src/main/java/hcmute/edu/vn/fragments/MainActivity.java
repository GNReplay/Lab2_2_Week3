package hcmute.edu.vn.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.flfragment,firstFragment)
                .setReorderingAllowed(true)
                .addToBackStack("name") // name can be null
                .commit();
        Button btnFragment1 = (Button) findViewById(R.id.btnFragment1);
        btnFragment1.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.flfragment,firstFragment)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });

        Button btnFragment2 = (Button) findViewById(R.id.btnFragment2);
        btnFragment2.setOnClickListener(view -> {
            fragmentManager.beginTransaction()
                    .replace(R.id.flfragment,secondFragment)
                    .setReorderingAllowed(true)
                    .addToBackStack("name") // name can be null
                    .commit();
        });
    }
}