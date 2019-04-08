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
import com.example.dell.searchfoody.feature.detail.DetailsActivity;
import com.example.dell.searchfoody.model.MonAn;
import com.example.dell.searchfoody.model.QuanAn;

import java.util.List;
import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MonAnAdapter extends RecyclerView.Adapter<MonAnAdapter.QuanAnHolder> {
    private Context context;
    private List<MonAn> listMonAn;

    public MonAnAdapter(Context context, List<MonAn> listMonAn) {
        this.context = context;
        this.listMonAn = listMonAn;
    }

    @NonNull
    @Override
    public QuanAnHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_mon_an, parent, false);
        return new QuanAnHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuanAnHolder holder, int position) {
        holder.onBind(listMonAn.get(position));
    }

    @Override
    public int getItemCount() {
        return listMonAn.size();
    }

    class QuanAnHolder extends RecyclerView.ViewHolder {
        private MonAn monAn;
        @BindView(R.id.txt_mon_an)
        TextView txtMonAn;


        QuanAnHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
            addListenerItem(view);
        }

        private void addListenerItem(View view) {
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
//                    Intent forwardResult=new Intent(context,DetailsActivity.class);
//                    forwardResult.putExtra(Constant.EXTRA_QUAN_AN, monAn);
//                    forwardResult.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    context.startActivity(forwardResult);
                }
            });
        }

        void onBind(MonAn monAn) {
            this.monAn = monAn;
            txtMonAn.setText(monAn.getName());
        }

    }
}
