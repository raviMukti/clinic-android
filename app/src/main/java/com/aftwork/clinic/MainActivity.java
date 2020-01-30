package com.aftwork.clinic;

import android.os.Bundle;

import com.aftwork.clinic.ui.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        BottomNavigationView navView = findViewById( R.id.nav_view );
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_message, R.id.navigation_book, R.id.navigation_home, R.id.navigation_account )
                .build();
        NavController navController = Navigation.findNavController( this, R.id.nav_host_fragment );
        NavigationUI.setupActionBarWithNavController( this, navController, appBarConfiguration );
        NavigationUI.setupWithNavController( navView, navController );

        //Load Fragment Home sebagai default
        loadFragment(new HomeFragment() );
    }

    //Function Load Fragment
    private void loadFragment(Fragment fr){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace( R.id.fragment_sebelum_login, fr );
        fragmentTransaction.commit();
    }

}
