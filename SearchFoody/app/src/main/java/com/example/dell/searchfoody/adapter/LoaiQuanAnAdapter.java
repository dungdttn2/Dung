package com.example.dell.searchfoody.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dell.searchfoody.Constant;
import com.example.dell.searchfoody.R;
import com.example.dell.searchfoody.feature.MainActivity;
import com.example.dell.searchfoody.feature.detail.DetailsActivity;
import com.example.dell.searchfoody.model.LoaiQuanAn;
import com.example.dell.searchfoody.model.MonAn;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoaiQuanAnAdapter extends RecyclerView.Adapter<LoaiQuanAnAdapter.QuanAnHolder> {
    private Context context;
    private List<LoaiQuanAn> listLoaiQuanAn;

    public LoaiQuanAnAdapter(Context context, List<LoaiQuanAn> listMonAn) {
        this.context = context;
        this.listLoaiQuanAn = listMonAn;
    }

    @NonNull
    @Override
    public QuanAnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_loai_quan_an, parent, false);
        return new QuanAnHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuanAnHolder holder, int position) {
        holder.onBind(listLoaiQuanAn.get(position));
    }

    @Override
    public int getItemCount() {
        return listLoaiQuanAn.size();
    }

    class QuanAnHolder extends RecyclerView.ViewHolder {
        private LoaiQuanAn loaiQuanAn;
        @BindView(R.id.txt_name)
        TextView txtName;
        @BindView(R.id.txt_line)
        View txtLine;


        QuanAnHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            addListenerItem(view);
        }

        private void addListenerItem(View view) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent forwardResult=new Intent(context,MainActivity.class);
                    forwardResult.putExtra(Constant.EXTRA_LOAI_QUAN_AN, loaiQuanAn);
                    forwardResult.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    context.startActivity(forwardResult);
                }
            });
        }

        void onBind(LoaiQuanAn monAn) {
            this.loaiQuanAn = monAn;
            txtName.setText(loaiQuanAn.getName());
            if(getAdapterPosition()==listLoaiQuanAn.size()-1){
                txtLine.setVisibility(View.GONE);
            }else{
                txtLine.setVisibility(View.VISIBLE);
            }
        }

    }
}
