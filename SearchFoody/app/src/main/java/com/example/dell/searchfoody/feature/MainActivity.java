package com.example.dell.searchfoody.feature;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SearchView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.dell.searchfoody.Constant;
import com.example.dell.searchfoody.R;
import com.example.dell.searchfoody.adapter.QuanAnAdapter;
import com.example.dell.searchfoody.feature.detail.DetailsActivity;
import com.example.dell.searchfoody.feature.menu.MenuFragment;
import com.example.dell.searchfoody.ipconfig.IPConfig;
import com.example.dell.searchfoody.model.LoaiQuanAn;
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
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MenuFragment.CloseMenu {

    @BindView(R.id.recyclerview_quan_an)
    RecyclerView recyclerViewQuanAn;
    @BindView(R.id.search_view)
    android.widget.SearchView searchView;

    @BindView(R.id.img_menu)
    ImageView imgMenu;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @BindView(R.id.progress)
    ProgressBar progressBar;

    @BindView(R.id.menu_fragment)
    View menuView;

    private QuanAnAdapter quanAnAdapter;
    private List<QuanAn> listQuanAn;
    private MenuFragment menuFragment;
    private LoaiQuanAn loaiQuanAn = null;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
        initMenu();
        intent = getIntent();
        loaiQuanAn = (LoaiQuanAn) intent.getSerializableExtra(Constant.EXTRA_LOAI_QUAN_AN);
        if (loaiQuanAn != null) {
            getLoaiQuanAnById(IPConfig.GET_LOAI_QUAN_AN_BY_ID);
        } else {
            getListQuanAn(IPConfig.GET_LIST_QUAN_AN);
        }
        listenerSearch();

    }

    private void initMenu() {
        menuFragment = (MenuFragment)
                getSupportFragmentManager().findFragmentById(R.id.menu_fragment);
        menuFragment.setCloseMenu(this);
    }

    private void listenerSearch() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                quanAnAdapter.Fillter(newText.trim());
                return false;
            }
        });
    }

    private void initView() {
        listQuanAn = new ArrayList<>();
        recyclerViewQuanAn.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        quanAnAdapter = new QuanAnAdapter(this, listQuanAn);
        recyclerViewQuanAn.setAdapter(quanAnAdapter);
    }

    @OnClick({R.id.img_menu})
    void imageClick(View view) {
        switch (view.getId()) {
            case R.id.img_menu:

                drawerLayout.openDrawer(menuView);
                break;

        }
    }


    public void getListQuanAn(String url) {
progressBar.setVisibility(View.VISIBLE);
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        listQuanAn.clear();
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject obj = response.getJSONObject(i);
                                String id = obj.getString("id");
                                String ten = obj.getString("ten");
                                String sdt = obj.getString("sdt");
                                String diachi = obj.getString("diachi");
                                String loai = obj.getString("loai");
                                double lat = obj.getDouble("lat");
                                double lng = obj.getDouble("lng");
                                listQuanAn.add(new QuanAn(id, ten, sdt, diachi, loai, lat, lng));

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        quanAnAdapter = new QuanAnAdapter(MainActivity.this, listQuanAn);
                        recyclerViewQuanAn.setAdapter(quanAnAdapter);
                        progressBar.setVisibility(View.GONE);
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("BBB", "Eror: " + error.toString());
                        Toast.makeText(MainActivity.this, "Lỗi mạng", Toast.LENGTH_LONG).show();
                    }
                }
        );

        requestQueue.add(jsonArrayRequest);
    }


    public void getLoaiQuanAnById(String url) {
        progressBar.setVisibility(View.VISIBLE);
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                JSONArray object = null;
                try {
                    object = new JSONArray(response);
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }

                for (int i = 0; i < object.length(); i++) {
                    try {
                        JSONObject obj = object.getJSONObject(i);
                        String id = obj.getString("id");
                        String ten = obj.getString("ten");
                        String sdt = obj.getString("sdt");
                        String diachi = obj.getString("diachi");
                        String loai = obj.getString("loai");
                        double lat = obj.getDouble("lat");
                        double lng = obj.getDouble("lng");
                        listQuanAn.add(new QuanAn(id, ten, sdt, diachi, loai, lat, lng));

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    quanAnAdapter = new QuanAnAdapter(MainActivity.this, listQuanAn);
                    recyclerViewQuanAn.setAdapter(quanAnAdapter);
                    progressBar.setVisibility(View.GONE);
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(MainActivity.this, "Lỗi mạng rồi", Toast.LENGTH_SHORT).show();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap<>();
                map.put("loai", loaiQuanAn.getId());
                return map;
            }
        };
        requestQueue.add(stringRequest);
    }

    @Override
    public void close() {
        drawerLayout.closeDrawers();
    }
}
