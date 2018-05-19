package com.nisa.bismillah_dokter.fragment;


import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.nisa.bismillah_dokter._sliders.FragmentSlider;
import com.nisa.bismillah_dokter._sliders.SliderIndicator;
import com.nisa.bismillah_dokter._sliders.SliderPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.nisa.bismillah_dokter.R;
import com.nisa.bismillah_dokter._sliders.SliderView;
import com.nisa.bismillah_dokter.persyaratan;
import com.nisa.bismillah_dokter.profile;


public class fragment_home extends Fragment {

    CardView pp,syrt;

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;


    public fragment_home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fragment_home, container , false);
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        setupSlider();

        pp = (CardView) rootView.findViewById(R.id.prof);
        syrt = (CardView) rootView.findViewById(R.id.rat);

        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), profile.class);
                startActivity(i);
            }
        });
        syrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), persyaratan.class);
                startActivity(i);

                getActivity().finish();
            }
        });


        return rootView;
    }

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        //gambar nya harus dimasuki dulu ke database

        fragments.add(FragmentSlider.newInstance("http://192.168.100.13/Dotcher/foto_do/dokter_edit.png"));
        fragments.add(FragmentSlider.newInstance("http://192.168.100.13/Dotcher/foto_do/astridsmith.png"));
        fragments.add(FragmentSlider.newInstance("http://192.168.100.13/Dotcher/foto_do/dokter_telepon.jpg"));
        fragments.add(FragmentSlider.newInstance("http://192.168.100.13/Dotcher/foto_do/tikelkesehatan.jpeg"));

        mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }
}
