package com.febry.kelaslnta;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Vector;

public class RecyclerViewKeduaAdapter extends RecyclerView.Adapter<RecyclerViewKeduaAdapter.ViewHolder> {

    private ArrayList<Data> data;

    public RecyclerViewKeduaAdapter(ArrayList<Data> data){
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rvkedua_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTvRv().setText(data.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvRv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvRv = itemView.findViewById(R.id.tv_rvkedua);
        }

        public TextView getTvRv() {
            return tvRv;
        }
    }

}
