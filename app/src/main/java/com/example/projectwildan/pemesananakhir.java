package com.example.projectwildan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class pemesananakhir extends AppCompatActivity {

    EditText editTextName, editTextAlamat, editTextnomor,editTextbarang;
    Button orderbutton;

    DatabaseReference databaseOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesananakhir);

        databaseOrder = FirebaseDatabase.getInstance().getReference("order");

        editTextName = (EditText) findViewById(R.id.formnamaregister);
        editTextAlamat = (EditText) findViewById(R.id.alamatregister);
        editTextnomor = (EditText) findViewById(R.id.nomorhpregister);
        editTextbarang = (EditText) findViewById(R.id.namabarangregister);

        orderbutton = (Button) findViewById(R.id.orderbutton);
        orderbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addorder();

            }
        });
    }

    private void addorder(){
        String name = editTextName.getText().toString().trim();
        String alamat = editTextAlamat.getText().toString().trim();
        Integer nomor = Integer.valueOf(editTextnomor.getText().toString().trim());
        String barang = editTextbarang.getText().toString().trim();

        if(!TextUtils.isEmpty(name)){

            String id = databaseOrder.push().getKey();

            ordermodel order = new ordermodel(id, name, alamat, nomor, barang);

            databaseOrder.child(id).setValue(order);

            Toast.makeText(this, "Order Sukses", Toast.LENGTH_LONG).show();

            Intent intent = new Intent(this, menu.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"Harus isi Nama", Toast.LENGTH_LONG).show();
        }
    }


    public void buttonbaack(View view) {
        Intent intent = new Intent(this, pemesanan.class);
        startActivity(intent);
    }




}
