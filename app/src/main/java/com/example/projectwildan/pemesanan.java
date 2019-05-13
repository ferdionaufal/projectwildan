package com.example.projectwildan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class pemesanan extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;

    List<recyclerlist> productlistt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        productlistt = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        recyclerView .setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productlistt.add(
                new recyclerlist(
                        1,
                        "Baju Serigala Geologi",
                        "S, M, L, XL, XXL",
                        4.4,
                        80000,
                        R.drawable.satu));

        productlistt.add(
                new recyclerlist(
                        1,
                        "Tote Bag HMTG MAHANDRAGA",
                        "30x40cm",
                        4.5,
                        35000,
                        R.drawable.dua));

        productlistt.add(
                new recyclerlist(
                        1,
                        "Tote Bag Japan Spring",
                        "30x40 cm",
                        4.1,
                        34999,
                        R.drawable.tiga));

        productlistt.add(
                new recyclerlist(
                        1,
                        "T-Shirt DANS Logo",
                        "S, M, L, XL",
                        4.6,
                        80000,
                        R.drawable.empat));

        adapter = new ProductAdapter(this, productlistt);
        recyclerView.setAdapter(adapter);
    }

    public void Nextbutton(View view) {
        Intent intent = new Intent(this, pemesananakhir.class);
        startActivity(intent);
    }
}
