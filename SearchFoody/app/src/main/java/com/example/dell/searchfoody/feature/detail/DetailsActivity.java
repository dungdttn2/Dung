package com.example.dell.searchfoody.feature.detail;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dell.searchfoody.Constant;
import com.example.dell.searchfoody.R;
import com.example.dell.searchfoody.adapter.MonAnAdapter;
import com.example.dell.searchfoody.feature.MainActivity;
import com.example.dell.searchfoody.ipconfig.IPConfig;
import com.example.dell.searchfoody.model.MonAn;
import com.example.dell.searchfoody.model.QuanAn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailsActivity extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerViewMonAn;
    @BindView(R.id.txt_name)
    TextView txtName;
    @BindView(R.id.txt_sdt)
    TextView txtSdt;
    @BindView(R.id.txt_address)
    TextView txtAddress;
    @BindView(R.id.txt_loai)
    TextView txtLoai;
    private Intent intent;
    private QuanAn quanAn;
    private MonAnAdapter monAnAdapter;
    private List<MonAn> listMonAn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        ButterKnife.bind(this);
        intent = getIntent();
        quanAn = (QuanAn) intent.getSerializableExtra(Constant.EXTRA_QUAN_AN);
        setData();
        initView();
    }

    private void initView() {
        listMonAn=new ArrayList<>();
        recyclerViewMonAn.setLayoutManager(new LinearLayoutManager(DetailsActivity.this));
        monAnAdapter=new MonAnAdapter(this,listMonAn);
        recyclerViewMonAn.setAdapter(monAnAdapter);

    }

    private void setData() {
        txtName.setText(quanAn.getName());
        txtSdt.setText( quanAn.getSdt());
        txtAddress.setText( quanAn.getAddress());
        getLoaiQuanAn(IPConfig.GET_LOAI_QUAN_AN);

    }

    public void getLoaiQuanAn(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONArray object = null;
                try {
                    object = new JSONArray(response);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < object.length(); i++) {
                    try {
                        JSONObject obj = object.getJSONObject(i);
                        String ten = obj.getString("ten");
                        txtLoai.setText(ten);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                getListMonAn(IPConfig.GET_LIST_MON_AN);
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(DetailsActivity.this, "Lỗi mạng", Toast.LENGTH_SHORT).show();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();
                map.put("maloai", quanAn.getLoai());
                return map;
            }
        };
        requestQueue.add(stringRequest);
    }

    public void getListMonAn(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONArray object = null;
                try {
                    object = new JSONArray(response);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < object.length(); i++) {
                    try {
                        JSONObject obj = object.getJSONObject(i);
                        String id = obj.getString("id");
                        String ten = obj.getString("ten");
                        listMonAn.add(new MonAn(id,ten));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
                monAnAdapter.notifyDataSetChanged();
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(DetailsActivity.this, "Lỗi mạng", Toast.LENGTH_SHORT).show();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();
                map.put("idquan", quanAn.getId());
                return map;
            }
        };
        requestQueue.add(stringRequest);
    }
}
