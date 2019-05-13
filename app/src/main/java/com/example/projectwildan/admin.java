package com.example.projectwildan;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class admin extends AppCompatActivity {

    DatabaseReference databaseOrder;

    ListView listViewOrder;

    List<ordermodel> orderliss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        listViewOrder = (ListView) findViewById(R.id.listviewOrders);

        orderliss = new ArrayList<>();


        databaseOrder = FirebaseDatabase.getInstance().getReference().child("order");
        databaseOrder.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange( DataSnapshot dataSnapshot) {

                orderliss.clear();

                for (DataSnapshot orderSnapshot: dataSnapshot.getChildren()){
                    ordermodel ordermodel = orderSnapshot.getValue(ordermodel.class);

                    orderliss.add(ordermodel);
                }

                orderlist adapter = new orderlist(admin.this, orderliss);
                listViewOrder.setAdapter(adapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
