package com.example.dell.searchfoody.feature.maps;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.dell.searchfoody.Constant;
import com.example.dell.searchfoody.R;
import com.example.dell.searchfoody.feature.MainActivity;
import com.example.dell.searchfoody.feature.detail.DetailsActivity;
import com.example.dell.searchfoody.model.QuanAn;
import com.example.dell.searchfoody.model.ToaDo;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

public class CustomMaps implements GoogleMap.InfoWindowAdapter {
    private Activity context;
    private QuanAn quanAn;
    private GoogleMap googleMap;

    public CustomMaps(Activity context, QuanAn toaDo, GoogleMap googleMap) {
        this.context = context;
        this.quanAn = toaDo;
        this.googleMap = googleMap;
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        final LayoutInflater inflater = context.getLayoutInflater();
        View root = inflater.inflate(R.layout.row_item_map_address, null);
        ImageView imgIcon = root.findViewById(R.id.img_icon);
        TextView txtName = root.findViewById(R.id.txt_name);
        TextView txtSdt = root.findViewById(R.id.txt_sdt);
        setImage(imgIcon);
        txtName.setText(quanAn.getName());
        txtSdt.setText("Hotline: "+quanAn.getSdt());

        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                Intent intent = new Intent(context, DetailsActivity.class);
                intent.putExtra(Constant.EXTRA_QUAN_AN, quanAn);
                context.startActivity(intent);
            }
        });
        return root;
    }

    private void setImage(ImageView imgIcon) {
        if (quanAn.getImagePosition() == 0) {
            imgIcon.setImageResource(R.drawable.image_res);
        }else if (quanAn.getImagePosition() == 1) {
            imgIcon.setImageResource(R.drawable.res_one);
        }else if (quanAn.getImagePosition() == 2) {
            imgIcon.setImageResource(R.drawable.res_two);
        }else{
            imgIcon.setImageResource(R.drawable.default_img);
        }
    }



}
