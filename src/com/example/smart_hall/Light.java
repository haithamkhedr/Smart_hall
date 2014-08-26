package com.example.smart_hall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class Light extends Fragment {
	private TextView textView;
	private SeekBar seekBar;
	@Override
	public View  onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) 
	{
		View view=inflater.inflate(R.layout.light, container, false);
		seekBar = (SeekBar)view.findViewById(R.id.seekBar1);
		textView = (TextView)view.findViewById(R.id.textView1);
		textView.setText(seekBar.getProgress() + "/" + seekBar.getMax());
		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			int progress = 0;

			@Override
			public void onProgressChanged(SeekBar seekBar, int progresValue, boolean fromUser) {
				progress = progresValue;
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// Do something here, if you want to do anything at the start of
				// touching the seekbar
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// Display the value in textview
				textView.setText(progress + "/" + seekBar.getMax());
			}
		});
		return view;
	}

}
