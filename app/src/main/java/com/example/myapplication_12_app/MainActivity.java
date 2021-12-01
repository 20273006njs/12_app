package com.example.myapplication_12_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager LayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(LayoutManager);
        PersonAdapter adapter = new PersonAdapter();

        adapter.addItem(new Person("남지수","010-1000-1000"));
        adapter.addItem(new Person("김지수","010-2000-2000"));
        adapter.addItem(new Person("박지수","010-3000-3000"));

        recyclerView.setAdapter(adapter);
    }
}