package com.planet01.kioske.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.planet01.kioske.R;

public class product_view_adaptor extends RecyclerView.Adapter<product_view_adaptor.ViewHolder> {
    private String[] mData;
    private LayoutInflater mInflater;
    private ItemClickListener mClickListener;


    product_view_adaptor(Context context,String[] data){
        this.mInflater = LayoutInflater.from(context);
        this.mData = data;

    }
    @NonNull
    @Override
    public product_view_adaptor.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = mInflater.inflate(R.layout.grid_rv_item_main,parent,false);


        return new ViewHolder(view);




    }

    @Override
    public void onBindViewHolder(@NonNull product_view_adaptor.ViewHolder holder, int position) {

holder.textView.setText(mData[position]);

    }

    @Override
    public int getItemCount() {
        return mData.length;
    }
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.rv_textview);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            if (mClickListener != null) mClickListener.onItemClick(v, getAdapterPosition());

        }
    }

    String getItem(int id) {
        return mData[id];
    }

    // allows clicks events to be caught
    void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
