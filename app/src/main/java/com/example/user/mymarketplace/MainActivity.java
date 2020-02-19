package com.example.user.mymarketplace;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ProductAdapter adapter;

    List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(new Product(1,"Accer Laptop", R.drawable.laptop, 1000.0,"Core i7 Accer Laptop"));
        productList.add(new Product(2,"Robotics Class", R.drawable.robotics, 1000.0,"Become a Robotics Expert"));
        productList.add(new Product(3,"Programming Class", R.drawable.programming, 2000.0,"Become A Top Notch Software Developer"));

        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}
