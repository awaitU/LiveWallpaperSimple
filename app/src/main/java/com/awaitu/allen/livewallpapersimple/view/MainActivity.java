package com.awaitu.allen.livewallpapersimple.view;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;


import com.awaitu.allen.livewallpapersimple.R;
import com.awaitu.allen.livewallpapersimple.gl.AdvanceGLWallpaperService;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(
                WallpaperManager.ACTION_CHANGE_LIVE_WALLPAPER);
        intent.putExtra(WallpaperManager.EXTRA_LIVE_WALLPAPER_COMPONENT,
                new ComponentName(this, AdvanceGLWallpaperService.class));
        startActivity(intent);
        finish();
    }
}
