package com.example.projectwildan;

import android.app.Activity;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class orderlist extends ArrayAdapter<ordermodel> {

    private Activity context;
    private List<ordermodel> orderliss;

    public orderlist(Activity context, List<ordermodel> orderliss){
        super (context, R.layout.listorder_layout, orderliss);
        this.context = context;
        this.orderliss = orderliss;
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.listorder_layout, null, true);

        TextView textViewName = (TextView) listViewItem.findViewById(R.id.namaoy);
        TextView textViewAlamat = (TextView) listViewItem.findViewById(R.id.alamatoy);
        TextView textViewHp = (TextView) listViewItem.findViewById(R.id.hpoy);
        TextView textViewBarang = (TextView) listViewItem.findViewById(R.id.barangoy);

        ordermodel ordermodel = orderliss.get(position);

        textViewName.setText(ordermodel.getOrderName());
        textViewAlamat.setText(ordermodel.getOrderAlamat());
        textViewHp.setText(String.valueOf(ordermodel.getOrderHp()));
        textViewBarang.setText(ordermodel.getOrderBarang());

        return listViewItem;

    }
}
