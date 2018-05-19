package com.nisa.bismillah_dokter.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.nisa.bismillah_dokter.R;
import com.nisa.bismillah_dokter.helper.GPStrack;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_map extends Fragment {

    private static final int REQUEST_LOCATION = 1;
    private GoogleMap mMap;
    private GoogleApiClient googleApiClient;
    private GPStrack gpStrack;
    private double lat;
    private double lon;
    private String name_location;
    private LatLng lokasiku;
    private Intent intent;
    EditText edtseacrh;
    public fragment_map() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_map, container, false);
    }

}
