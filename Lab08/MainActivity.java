package com.quoizz.max.testwtf;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "MainActivity";
    private List<Integer> imagesID = new ArrayList<>();
    private List<Integer> viewPagersId = new ArrayList<>();
    private List<ImageFragment> imagesFrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createImagesID();
        createIdViewPager();

        Log.d(TAG, "Starting ViewPager");
        for (Integer vpId: viewPagersId) {
            addImageFragments();
            Collections.shuffle(imagesFrag);
            ImageAdapter adapter = new ImageAdapter(getSupportFragmentManager(), imagesFrag);
            ViewPager vp = findViewById(vpId);
            vp.setAdapter(adapter);
        }
        Log.d(TAG, "Success !!");
    }

    private void createImagesID() {
        imagesID.add(R.drawable.s1); imagesID.add(R.drawable.s2); imagesID.add(R.drawable.s3); imagesID.add(R.drawable.s4);
        imagesID.add(R.drawable.s5); imagesID.add(R.drawable.s6); imagesID.add(R.drawable.s7); imagesID.add(R.drawable.s8);
        imagesID.add(R.drawable.s9); imagesID.add(R.drawable.s10); imagesID.add(R.drawable.s11); imagesID.add(R.drawable.s12);
        imagesID.add(R.drawable.s13); imagesID.add(R.drawable.s14); imagesID.add(R.drawable.s15); imagesID.add(R.drawable.s16);
    }


    private void addImageFragments() {
        imagesFrag = new ArrayList<>();
        for (Integer imgId: imagesID) {
            ImageFragment imgFrag = new ImageFragment();
            imgFrag.setImgID(imgId);
            imagesFrag.add(imgFrag);
        }
    }

    private void createIdViewPager() {
        viewPagersId.add(R.id.vp1);
        viewPagersId.add(R.id.vp2);
        viewPagersId.add(R.id.vp3);
        viewPagersId.add(R.id.vp4);
        viewPagersId.add(R.id.vp5);
        viewPagersId.add(R.id.vp6);
        viewPagersId.add(R.id.vp7);
        viewPagersId.add(R.id.vp8);
        viewPagersId.add(R.id.vp9);
        viewPagersId.add(R.id.vp10);
        viewPagersId.add(R.id.vp11);
        viewPagersId.add(R.id.vp12);
        viewPagersId.add(R.id.vp13);
        viewPagersId.add(R.id.vp14);
        viewPagersId.add(R.id.vp15);
        viewPagersId.add(R.id.vp16);
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }

    public void onSaveInstanceState(Bundle outState) {
        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);
    }
}
