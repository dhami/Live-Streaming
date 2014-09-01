package com.example.livebroacasting;

import java.util.ArrayList;

import com.example.adapter.SettingListViewAdapter;
import com.example.livebroadcasting.helper.SettingInfo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class SettingActivity extends Activity {

	private ListView listview;
	static String KEY_SETTINGTITLE = "SettingTitle";
	final static String KEY_SETTINGIMAGE = "SettingImage";

	ImageView Img_share, Img_account;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.setting);

		Img_share = (ImageView) findViewById(R.id.Img_share);
		Img_account = (ImageView) findViewById(R.id.Img_account);
		listview = (ListView) findViewById(R.id.list);

		Img_share.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SettingActivity.this,
						ShareActivity.class);
				startActivity(intent);

			}
		});

		Img_account.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(SettingActivity.this,
						AccountActivity.class);
				startActivity(intent);

			}
		});

		listview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> adapterView, View arg1,
					int pos, long arg3) {
				// TODO Auto-generated method stub

				//SettingInfo settingInfo = (SettingInfo) adapterView
					//	.getAdapter().getItem(pos);

				// Intent intent = new Intent(SettingActivity.this,
				// SettingProfileActivity.class);
				// intent.putExtra("title", settingInfo.SettingTitle);
				// startActivity(intent);

			}
		});

		ArrayList<SettingInfo> list = new ArrayList<SettingInfo>();
		list.add(new SettingInfo("Profile", R.drawable.account));
		list.add(new SettingInfo("About", R.drawable.about));
		list.add(new SettingInfo("Notification", R.drawable.notification));
		list.add(new SettingInfo("Filter", R.drawable.filter));

		SettingListViewAdapter settingListViewAdapter = new SettingListViewAdapter(
				SettingActivity.this, R.layout.setting_list, list);
		listview.setAdapter(settingListViewAdapter);
	}
}
