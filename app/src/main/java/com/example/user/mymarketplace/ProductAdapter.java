package com.example.user.mymarketplace;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 11/23/2019.
 */
/*
RecyclerView.Adapter
RecyclerView.ViewHolder
* */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>{

    private Context cntx;
    private List<Product> productList;

    public ProductAdapter(Context cntx, List<Product> productList) {
        this.cntx = cntx;
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(cntx);
        View view = inflater.inflate(R.layout.list_layout,null);
       // ProductViewHolder holder = new ProductViewHolder(view);
      //  return holder;
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {

      Product product = productList.get(position);

      holder.titleTextView.setText(product.getTitle());
      holder.descriptionTextView.setText(product.getDescription());
      holder.priceTextView.setText(String.valueOf(product.getPrice()));

      holder.imageView.setImageDrawable(cntx.getResources().getDrawable(product.getImage()));
    }

    @Override
    public int getItemCount() {

        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView titleTextView, descriptionTextView, priceTextView;

        public ProductViewHolder(@NonNull View itemView) {

            super(itemView);

            imageView = itemView.findViewById(R.id.image);
            titleTextView = itemView.findViewById(R.id.textViewTitle);
            descriptionTextView = itemView.findViewById(R.id.textViewDesc);
            priceTextView = itemView.findViewById(R.id.textViewPrice);
        }
    }
}
