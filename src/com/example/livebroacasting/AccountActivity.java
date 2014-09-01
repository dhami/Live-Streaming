package com.example.livebroacasting;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.Spinner;

public class AccountActivity extends Activity{
	
	private Spinner spinner1, spinner2;
	RadioButton Individual, Company;
	ScrollView ScrlIndv, ScrlCmp;

	ImageView Img_share, Img_setting, Img_menu;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account);
		
		ScrlIndv = (ScrollView) findViewById(R.id.ScrlIndv);
		ScrlCmp = (ScrollView) findViewById(R.id.ScrlCmp);
		ScrlCmp.setVisibility(View.INVISIBLE);

		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		spinner2.setVisibility(View.INVISIBLE);

		Company = (RadioButton) findViewById(R.id.Company);
		Individual = (RadioButton) findViewById(R.id.Individual);

		Img_setting = (ImageView) findViewById(R.id.Img_setting);
		Img_share = (ImageView) findViewById(R.id.Img_share);
		

		List<String> list = new ArrayList<String>();
		list.add("Gender");
		list.add("Male");
		list.add("Female");
		
		ArrayAdapter<String> dataadapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, list);
		dataadapter
				.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

		spinner1.setAdapter(dataadapter);
		
		List<String> list1 = new ArrayList<String>(); 
		 list1.add("Country");
		 list1.add("england");
		 list1.add("u s a"); 
		 list1.add("russia");
		 list1.add("nepal");
		 list1.add("india"); 
		 list1.add("pakistan");
		 list1.add("brazil");
		 list1.add("singapore");
		 list1.add("france");
		 list1.add("germany");
		 list1.add("australia");
		 list1.add("new zealand");
		 list1.add("kenya");
		 list1.add("bangladesh");
		 list1.add("italy");
		 list1.add("sri lanka");
		 list1.add("west indies");
		 list1.add("norway");
		 list1.add("malaysia");
		 list1.add("maldives");
		 list1.add("mexico");
		 list1.add("kuwait");
		 list1.add("libya");
		 list1.add("oman");
		 list1.add("netherlands");
		 list1.add("switzerland");
		 list1.add("syria");
		 list1.add("turkey");
		 list1.add("tongo");
		 list1.add("tunisia");
		 list1.add("north korea");
		 list1.add("belarus");
		 ArrayAdapter<String>
		 countryadapter = new ArrayAdapter<String>(this,
		 android.R.layout.simple_spinner_item, list1);
		 
		 countryadapter
		 .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		 spinner2.setAdapter(countryadapter);
		 
		 Company.setOnClickListener(new OnClickListener() {

			 
			 
				@Override
				public void onClick(View v) {

					spinner1.setVisibility(View.GONE);

					ScrlIndv.setVisibility(View.GONE);
					spinner2.setVisibility(View.VISIBLE);
					ScrlCmp.setVisibility(View.VISIBLE);

				}
			});
		 
		 Individual.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {

					ScrlIndv.setVisibility(View.VISIBLE);
					ScrlCmp.setVisibility(View.GONE);
					spinner2.setVisibility(View.GONE);
					spinner1.setVisibility(View.VISIBLE);

				}
			});
		 
		 Img_setting.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) { // TODO Auto-generated method stub

					Intent i = new Intent(AccountActivity.this,
							SettingActivity.class);
					startActivity(i);

				}
			});

			Img_share.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) { // TODO Auto-generated method stub

					Intent intent = new Intent(AccountActivity.this,
							ShareActivity.class);
					startActivity(intent);

				}
			});
	}

}
