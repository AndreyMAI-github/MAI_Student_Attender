package com.mai.mai_student_attender;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mai.mai_student_attender.databinding.ActivityPanelBinding;
import com.mai.mai_student_attender.panel_elements.discipline.DisciplineFragment;
import com.mai.mai_student_attender.panel_elements.groups.GroupsFragment;
import com.mai.mai_student_attender.panel_elements.home.HomeFragment;
import com.mai.mai_student_attender.panel_elements.settings.SettingsFragment;

public class PanelActivity extends AppCompatActivity {

    /*private ActivityPanelBinding binding;*/

    int currentState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        BottomNavigationView navView = findViewById(R.id.nav_view);

        HomeFragment homeFragment = new HomeFragment();
        GroupsFragment groupsFragment = new GroupsFragment();
        DisciplineFragment disciplineFragment = new DisciplineFragment();
        SettingsFragment settingsFragment = new SettingsFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.panel_out, homeFragment, "_").commit();

        navView.setOnNavigationItemSelectedListener(item -> {
            if (currentState != 0 && item.getItemId() == R.id.navigation_home) {
                currentState = 0;
                getSupportFragmentManager().beginTransaction().replace(R.id.panel_out, homeFragment, "_").commit();
                Log.e("TAG", "onDestinationChanged: ");
            } else if (currentState != 1 && item.getItemId() == R.id.navigation_groups) {
                currentState = 1;
                getSupportFragmentManager().beginTransaction().replace(R.id.panel_out, groupsFragment, "_").commit();
                Log.e("TAG", "onDestinationChanged: ");
            }else if (currentState != 2 && item.getItemId() == R.id.navigation_discipline) {
                currentState = 2;
                getSupportFragmentManager().beginTransaction().replace(R.id.panel_out, disciplineFragment, "_").commit();
                Log.e("TAG", "onDestinationChanged: ");
            }else if (currentState != 3 && item.getItemId() == R.id.navigation_settings) {
                currentState = 3;
                getSupportFragmentManager().beginTransaction().replace(R.id.panel_out, settingsFragment, "_").commit();
                Log.e("TAG", "onDestinationChanged: ");
            }

            return true;
        });

    }

}