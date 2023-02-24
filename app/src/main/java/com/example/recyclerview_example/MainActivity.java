package com.example.recyclerview_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclrview);

        ArrayList<Fruits> fruits = new ArrayList<>();
       fruits.add(new Fruits("Apple","Red","https://cuisinicity.com/wp-content/uploads/2014/09/RED-APPLE-Medium-500x566.jpg"));
        fruits.add(new Fruits("Banana","yellow","https://latinatrading-llm.net/wp-content/uploads/2019/02/1558047b86c364c.jpg"));
        fruits.add(new Fruits("Grapes","Green","https://www.waimeanurseries.co.nz/assets/Uploads/Grape-green-iStock-000014085833Medium.jpg"));
        fruits.add(new Fruits("BGrapes","Black","https://patch.com/img/cdn/users/1783961/2015/08/raw/20150855d62013a5c73.jpg"));
        fruits.add(new Fruits("Orange","orange","https://dvineuncorked.files.wordpress.com/2011/09/orange.jpg"));
        fruits.add(new Fruits("Berry","Red","https://www.femalefirst.co.uk/image-library/port/1000/b/berries-0243-jpg.jpg"));

        fruitsListAdapter fruitsListAdapter = new fruitsListAdapter(this);
        fruitsListAdapter.setFruits(fruits);

        recyclerView.setAdapter(fruitsListAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}