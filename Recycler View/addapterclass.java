package com.example.recyclerviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class addapterclass extends RecyclerView.Adapter<addapterclass.viewHholderclass> {


    private String[] data;
    public addapterclass(String[] data){
        this.data=data;

    }

    @NonNull
    @Override
    public viewHholderclass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.listvieww,parent,false);
        return new viewHholderclass(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHholderclass holder, int position) {
        String textview1= data[position];
        holder.textView.setText(textview1);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class viewHholderclass extends RecyclerView.ViewHolder{
        ImageView img;
        TextView textView;
        public viewHholderclass(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imgid);
            textView=textView.findViewById(R.id.textid);
        }
    }


}
