package com.example.smart_hall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Sound extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
    Bundle savedInstanceState){
		View view=inflater.inflate(R.layout.tab2, container, false);
		return view;
	}

}
