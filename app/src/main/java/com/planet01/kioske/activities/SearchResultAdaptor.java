package com.planet01.kioske.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.planet01.kioske.R;
import com.planet01.kioske.activities.Model.search_result_model;

import java.util.List;

public class SearchResultAdaptor extends RecyclerView.Adapter<SearchResultAdaptor.ViewHolder> {



    List<search_result_model> search_result_model_list;
    Context context;


   public SearchResultAdaptor(Context context,List<search_result_model> search_result_model_list)
   {
this.context = context;
this.search_result_model_list = search_result_model_list;

   }
    @NonNull
    @Override
    public SearchResultAdaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.search_rv,null);
       ViewHolder vh = new ViewHolder(v);
// set the view's size, margins, paddings and layout parameters
        // pass the view to View Holder
        return vh;


    }

    @Override
    public void onBindViewHolder(@NonNull SearchResultAdaptor.ViewHolder holder, int position) {

       search_result_model search_result_model = search_result_model_list.get(position);
       holder.search_prdct_name.setText(search_result_model.getSearch_product_title());
       holder.search_prdct_price.setText(String.valueOf(search_result_model.getSearch_product_price()));
       holder.search_prdct_size.setText(search_result_model.getSearch_product_size());
       holder.search_prdct_image.setImageDrawable(context.getResources().getDrawable(search_result_model.getSearch_product_image()));
    }

    @Override
    public int getItemCount() {
        return search_result_model_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView search_prdct_name;
        TextView search_prdct_price;
        TextView search_prdct_size;
        ImageView search_prdct_image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            search_prdct_name = itemView.findViewById(R.id.search_product_name);
            search_prdct_price = itemView.findViewById(R.id.search_product_price);
            search_prdct_size = itemView.findViewById(R.id.search_product_size);
            search_prdct_image = itemView.findViewById(R.id.search_product_image);



        }
    }
}
