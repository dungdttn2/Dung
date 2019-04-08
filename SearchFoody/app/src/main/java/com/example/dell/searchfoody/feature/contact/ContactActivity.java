package com.example.dell.searchfoody.feature.contact;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.dell.searchfoody.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactActivity extends AppCompatActivity {
    @BindView(R.id.txt_sdt)
    TextView txtSdt;
    @BindView(R.id.txt_email)
    TextView txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        ButterKnife.bind(this);

    }


    @OnClick({R.id.img_call_phone,R.id.img_email})
    void imageClick(View view) {
        switch (view.getId()) {
            case R.id.img_call_phone:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + txtSdt.getText().toString()));
                startActivity(intent);
                break;
            case R.id.img_email:
//                Intent intentEmail = new Intent(Intent.ACTION_SENDTO);
//                intentEmail.setData(Uri.parse("mailto:")); // only email apps should handle this
//                intentEmail.putExtra(Intent.EXTRA_EMAIL, txtEmail.getText().toString().trim());
//                intentEmail.putExtra(Intent.EXTRA_SUBJECT, "Chủ đề");
//                if (intentEmail.resolveActivity(getPackageManager()) != null) {
//                    startActivity(intentEmail);
//                }
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:"+txtEmail.getText().toString().trim()));
                startActivity(Intent.createChooser(emailIntent, "Send feedback"));
                break;

        }
    }
}
