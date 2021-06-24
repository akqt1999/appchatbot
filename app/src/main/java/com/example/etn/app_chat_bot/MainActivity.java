package com.example.etn.app_chat_bot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.etn.app_chat_bot.adapter.AdapterMess;
import com.example.etn.app_chat_bot.model.ModelMess;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    AdapterMess adapterMess;
    EditText edt_message;
    ImageButton btn_send;
    Button btn_test;

    List<ModelMess>contents=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();







    }



    private void init() {

        edt_message=findViewById(R.id.edt_message);
        btn_send=findViewById(R.id.btn_send);

        recyclerView=findViewById(R.id.recycler_view);
        adapterMess=new AdapterMess(this,contents);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapterMess);

    }
//  tôi muốn mua điện
    public void btnSend(View view) {
        contents.add(new ModelMess(edt_message.getText().toString().trim(),false));

        String mess=edt_message.getText().toString().trim();

        if(edt_message.getText().toString().trim().contains("hello"))
            contents.add(new ModelMess("chao ban! dit me ban",true));
        else if (edt_message.getText().toString().trim().contains("toi muon mua dien thoai"))
            contents.add(new ModelMess("muon mua dien thoai trong tam gia bao nhieu ?",true));
        else if (mess.contains("5tr")||mess.contains("5000000"))
            contents.add(new ModelMess("ban co the mua nhung dien thoai nay :\nOppo a31 \nnokia 5.0\nvivo s1\nrealme c3",true));
        else if (edt_message.getText().toString().trim().contains("ngu"))
            contents.add(new ModelMess("may ngu chu ",true));
        else if (edt_message.getText().toString().trim().contains("Hello"))
            contents.add(new ModelMess("chao ban! dit me ban",true));
        else if (edt_message.getText().toString().trim().contains("hello"))
            contents.add(new ModelMess("chao ban! dit me ban",true));
        else if (edt_message.getText().toString().trim().contains("hello"))
            contents.add(new ModelMess("chao ban! dit me ban",true));
        else if (edt_message.getText().toString().trim().contains("hello"))
            contents.add(new ModelMess("chao ban! dit me ban",true));
        else if (edt_message.getText().toString().trim().contains("hello"))
            contents.add(new ModelMess("chao ban! dit me ban",true));
        else if (edt_message.getText().toString().trim().contains("hello"))
            contents.add(new ModelMess("chao ban! dit me ban",true));



        edt_message.setText("");
        adapterMess.notifyDataSetChanged();
        recyclerView.scrollToPosition(contents.size()-1);

    }
}