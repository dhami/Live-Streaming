package com.example.adapter;

import java.util.ArrayList;

import com.example.livebroacasting.R;
import com.example.livebroadcasting.helper.SettingInfo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class SettingListViewAdapter extends ArrayAdapter<SettingInfo>{
	
	Context context;
	ArrayList<SettingInfo> list;
	
	
	public SettingListViewAdapter(Context context,
			int resource, ArrayList<SettingInfo> items) {
		
		super(context,resource,items);
		// TODO Auto-generated constructor stub
		
		this.context = context;
		this.list = items;
		
	}

	private class ViewHolder {
		TextView settingTitle;
		ImageView settingImage;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return super.getCount();
	}

	@Override
	public SettingInfo getItem(int position) {
		// TODO Auto-generated method stub
		return super.getItem(position);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		ViewHolder holder = null;
		SettingInfo settingInfo = getItem(position);
		LayoutInflater mLayoutInflater = (LayoutInflater) context
				.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
		
		if(convertView == null){
			convertView = mLayoutInflater.inflate(R.layout.setting_list, null);
			holder = new ViewHolder();
			holder.settingImage = (ImageView) convertView
					.findViewById(R.id.SettingImage);
			holder.settingTitle = (TextView) convertView
					.findViewById(R.id.SettingTitle);
			convertView.setTag(holder);
		}else{
			holder = (ViewHolder) convertView.getTag();
		}
		holder.settingImage.setImageResource(settingInfo.SettingImage);
		holder.settingTitle.setText(settingInfo.SettingTitle);
		return convertView;
	}

}
