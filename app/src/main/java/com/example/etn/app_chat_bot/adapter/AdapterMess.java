package com.example.etn.app_chat_bot.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.etn.app_chat_bot.R;
import com.example.etn.app_chat_bot.model.ModelMess;

import java.util.List;

public class AdapterMess extends RecyclerView.Adapter<AdapterMess.ViewHolder>{

    Context context;
    List<ModelMess>contents;

    int BOT=543;

    public AdapterMess(Context context, List<ModelMess> contents) {
        this.context = context;
        this.contents = contents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if(viewType==BOT)
        {
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_for_bot,parent,false));
        }
        else
            return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_chat_for_user,parent,false));


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if(contents.get(position).isBot())
        {
            holder.txt_content.setText(contents.get(position).getContent());
            holder.txt_content.setBackgroundColor(Color.parseColor("#61BCA8A8"));
        }
        else
            holder.txt_content.setText(contents.get(position).getContent());

    }

    @Override
    public int getItemCount() {
        return contents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txt_content;
            public ViewHolder(@NonNull View itemview)
            {
                super(itemview);
                txt_content=itemview.findViewById(R.id.txt_content);


            }
    }

    @Override
    public int getItemViewType(int position) {

        if(contents.get(position).isBot())
        {
           return BOT;
        }
        return 43;
    }
}
