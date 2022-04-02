package com.febry.kelaslnta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnSwitchActivity, btnSave;
    private TextView textView;
    private EditText editText;

    private RecyclerView recyclerView;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        Glide.with(this).load("https://raw.githubusercontent.com/bumptech/glide/master/static/glide_logo.png").into(imageView);


        Glide.with(this).load("https://upload.wikimedia.org/wikipedia/commons/b/b3/4cbe8d_f1ed2800a49649848102c68fc5a66e53mv2.gif").into(imageView);

//
//        ArrayList<Data> data = new ArrayList<>();
//
//        for(int i = 1; i <= 30; i++){
//            Data newData = new Data("item " + i, "Description ke " + i);
//            data.add(newData);
//        }
//
//        data.add(new Data("Ini tambahan yang manual", "Data manual"));
//
//
//        recyclerView = findViewById(R.id.rv_list);
//
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setHasFixedSize(true); //optimisasi boleh ada boleh gak
//        recyclerView.setAdapter(new RecyclerViewKeduaAdapter(data));


//        btnSwitchActivity = findViewById(R.id.btn_switch_acitvity);
//        btnSave = findViewById(R.id.btn_save);
//        textView = findViewById(R.id.textView);
//        editText = findViewById(R.id.editTextTextPersonName);
//
//
//        btnSave.setOnClickListener(view -> {
//            textView.setText(editText.getText().toString());
//        });
//
//
//        btnSwitchActivity.setOnClickListener(view -> {
//            Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
//            startActivity(intent);
//        });

    }

    @Override
    protected void onStart() {
        System.out.println("onStart");

        super.onStart();
    }

    @Override
    protected void onResume() {
        System.out.println("onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        System.out.println("onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        System.out.println("onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        System.out.println("onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        System.out.println("onRestart");
        super.onRestart();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putString("TEXT", textView.getText().toString());

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        textView.setText(savedInstanceState.getString("TEXT"));
    }
}
