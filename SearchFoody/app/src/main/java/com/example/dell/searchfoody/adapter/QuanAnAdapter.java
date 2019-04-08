package com.example.dell.searchfoody.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.example.dell.searchfoody.Constant;
import com.example.dell.searchfoody.R;
import com.example.dell.searchfoody.feature.detail.DetailsActivity;
import com.example.dell.searchfoody.feature.maps.MapsActivity;
import com.example.dell.searchfoody.model.QuanAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QuanAnAdapter extends RecyclerView.Adapter<QuanAnAdapter.QuanAnHolder> {
    private Context context;
    private List<QuanAn> listQuanAn;
    private List<QuanAn> listQuanAnTwo;

    public QuanAnAdapter(Context context, List<QuanAn> listQuanAn) {
        this.context = context;
        this.listQuanAn = listQuanAn;
        this.listQuanAnTwo=new ArrayList<>();
        this.listQuanAnTwo.addAll(listQuanAn);
    }

    @NonNull
    @Override
    public QuanAnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_quan_an, parent, false);
        return new QuanAnHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuanAnHolder holder, int position) {
        holder.onBind(listQuanAn.get(position));
    }

    @Override
    public int getItemCount() {
        return listQuanAn.size();
    }

    class QuanAnHolder extends RecyclerView.ViewHolder {
        private QuanAn quanAn;
        @BindView(R.id.txt_name)
        TextView txtName;
        @BindView(R.id.txt_sdt)
        TextView txtSdt;
        @BindView(R.id.txt_address)
        TextView txtAddress;
        @BindView(R.id.img_maps)
        ImageView imgMaps;

        QuanAnHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            addListenerItem(view);
        }

        private void addListenerItem(View view) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            imgMaps.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    quanAn.setImagePosition(getPosition());
                    Intent forwardResult=new Intent(context,MapsActivity.class);
                    forwardResult.putExtra(Constant.EXTRA_QUAN_AN,quanAn);
                    forwardResult.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(forwardResult);
                }
            });
        }

        void onBind(QuanAn quanAn) {
            this.quanAn = quanAn;
            txtName.setText(quanAn.getName());
            txtSdt.setText("Hotline: "+quanAn.getSdt());
            txtAddress.setText("Địa chỉ: "+quanAn.getAddress());
        }

    }

    public void Fillter(String newChar){
        newChar=newChar.toLowerCase(Locale.getDefault());
        listQuanAn.clear();
        if(newChar.length()==0){
            listQuanAn.addAll(listQuanAnTwo);
        }else{
            for(QuanAn quanAn:listQuanAnTwo){
                if(quanAn.getName().toLowerCase(Locale.getDefault()).contains(newChar)){
                    listQuanAn.add(quanAn);
                }
            }
        }
        notifyDataSetChanged();
    }
}
