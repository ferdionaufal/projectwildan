package com.example.projectwildan;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {


    private Context mCtx;
    private List<recyclerlist> prodlist;

    public ProductAdapter(Context mCtx, List<recyclerlist> prodlist) {
        this.mCtx = mCtx;
        this.prodlist = prodlist;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        ProductViewHolder holder = new ProductViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        recyclerlist recyclerlist = prodlist.get(position);


        holder.textViewTitle.setText(recyclerlist.getTitle());
        holder.textViewDesc.setText(recyclerlist.getShortdesc());
        holder.textViewRating.setText(String.valueOf(recyclerlist.getRating()));
        holder.textViewPrice.setText(String.valueOf(recyclerlist.getPrice()));

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(recyclerlist.getImage()));

    }

    @Override
    public int getItemCount() {
        return prodlist.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
