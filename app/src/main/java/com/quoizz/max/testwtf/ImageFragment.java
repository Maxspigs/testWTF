package com.quoizz.max.testwtf;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImageFragment extends Fragment {
    private ImageView imgView;
    private int imgID;

    public ImageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        imgView = (ImageView) view.findViewById(R.id.iV1);
        imgView.setImageResource(imgID);
        return view;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }
}
