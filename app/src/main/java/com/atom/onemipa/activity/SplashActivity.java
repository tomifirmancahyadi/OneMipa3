package com.atom.onemipa.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.atom.onemipa.HomeActivity;
import com.atom.onemipa.R;
import com.atom.onemipa.auth.ui.login.LoginActivity;

public class SplashActivity extends BaseActivity {
    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.splash_acvtivity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        },1500);
    }
}
