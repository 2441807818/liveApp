package com.microkun.project.live.ui;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.microkun.project.live.databinding.ActivityMainBinding;
import com.microkun.project.live.ui.live.adapter.ViewPagerAdapter;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (adapter == null) {
            adapter = new ViewPagerAdapter(getSupportFragmentManager(), getLifecycle());
            binding.viewPager2.setAdapter(adapter);
        }
    }
}