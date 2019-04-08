package com.example.dell.searchfoody.feature.menu;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.example.dell.searchfoody.R;
import com.example.dell.searchfoody.adapter.LoaiQuanAnAdapter;
import com.example.dell.searchfoody.adapter.QuanAnAdapter;
import com.example.dell.searchfoody.feature.MainActivity;
import com.example.dell.searchfoody.feature.contact.ContactActivity;
import com.example.dell.searchfoody.ipconfig.IPConfig;
import com.example.dell.searchfoody.model.LoaiQuanAn;
import com.example.dell.searchfoody.model.QuanAn;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuFragment extends Fragment {
    View root;
    @BindView(R.id.recycler_menu)
    RecyclerView recyclerViewMenu;
    private List<LoaiQuanAn> listLoai;
    private LoaiQuanAnAdapter loaiQuanAnAdapter;
    private CloseMenu closeMenu;

    public void setCloseMenu(CloseMenu closeMenu) {
        this.closeMenu = closeMenu;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        root = inflater.inflate(R.layout.fragment_menu, container, false);

        ButterKnife.bind(this, root);
        initComponent();
        getListLoaiQuanAn(IPConfig.GET_ALL_LOAI_QUAN_AN);
        return root;

    }

    private void initComponent() {
        listLoai = new ArrayList<>();
        recyclerViewMenu.setLayoutManager(new LinearLayoutManager(getActivity()));
        loaiQuanAnAdapter = new LoaiQuanAnAdapter(getActivity(), listLoai);
        recyclerViewMenu.setAdapter(loaiQuanAnAdapter);
    }

    @OnClick({R.id.layout_introduce_app, R.id.layout_lien_he})
    void imageClick(View view) {
        switch (view.getId()) {
            case R.id.layout_introduce_app:
                closeMenu.close();
                introduceApp();
                break;
            case R.id.layout_lien_he:
                Intent intent=new Intent(getContext(),ContactActivity.class);
                startActivity(intent);
                break;

        }
    }

    private void introduceApp() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Giới thiệu app");
        builder.setMessage("app tìm quán ăn" +
                "zzz");
        builder.setIcon(R.drawable.ic_introduce);
        builder.setNegativeButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        Dialog dialog = builder.create();
        dialog.show();

    }

    public void getListLoaiQuanAn(String url) {

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        listLoai.clear();
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject obj = response.getJSONObject(i);
                                String id = obj.getString("id");
                                String ten = obj.getString("ten");
                                listLoai.add(new LoaiQuanAn(id, ten));

                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                        loaiQuanAnAdapter.notifyDataSetChanged();
                    }
                },

                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.d("BBB", "Eror: " + error.toString());
                        Toast.makeText(getContext(), "Lỗi mạng", Toast.LENGTH_LONG).show();
                    }
                }
        );

        requestQueue.add(jsonArrayRequest);
    }
    public interface CloseMenu{
        void close();
    }
}
