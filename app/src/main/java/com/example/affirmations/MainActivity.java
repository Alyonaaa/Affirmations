package com.example.affirmations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.affirmations.adapter.ItemAdapter;
import com.example.affirmations.data.Datasource;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Affirmation> list = Datasource.LoadAffirmations();

        RecyclerView recyclerView = findViewById(R.id.recicler_view);
        ItemAdapter adapter = new ItemAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }
}