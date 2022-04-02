package com.febry.kelaslnta;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//Controller
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<Data> data;
    private Context context;

    public RecyclerViewAdapter(ArrayList<Data> data, Context context){
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.getTitle().setText(data.get(position).getTitle());
        holder.getDescription().setText(data.get(position).getDescription());

        holder.getButton().setOnClickListener(view -> {
            Toast.makeText(context, "Button dari " + data.get(position).getTitle() + " telah diclick", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    //View
    public static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title, description;
        private Button button;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.tv_title);
            description = itemView.findViewById(R.id.tv_desc);
            button = itemView.findViewById(R.id.btn_rv);
        }

        public TextView getTitle() {
            return title;
        }

        public TextView getDescription() {
            return description;
        }

        public Button getButton() {
            return button;
        }
    }

}
