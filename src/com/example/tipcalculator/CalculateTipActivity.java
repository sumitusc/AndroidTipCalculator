package com.example.tipcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateTipActivity extends Activity {
	
	public EditText etBillAmount;
	public TextView tvTip;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculate_tip);
		etBillAmount = (EditText) findViewById(R.id.etBillAmount);
		tvTip = (TextView) findViewById(R.id.tvTip);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculate_tip, menu);
		return true;
	}

	public void onSubmitTenPercent(View v){
		String strBillValue = etBillAmount.getText().toString();
		if(strBillValue == null || strBillValue.isEmpty()){
			Toast.makeText(this, "Enter a valid bill amount", Toast.LENGTH_SHORT).show();
		}else{
			try{
				double billAmount = Double.parseDouble(strBillValue);
				double tip = billAmount * 0.1;
				tip = roundToTwoDecimals(tip);
				tvTip.setText("$"+Double.toString(tip));
				
			}catch(Exception ex){
				Toast.makeText(this, "Invalid bill amount: "+strBillValue, Toast.LENGTH_SHORT).show();
			}
				
		}
	}
	
	public void onSubmitFifteenPercent(View v){
		String strBillValue = etBillAmount.getText().toString();
		if(strBillValue == null || strBillValue.isEmpty()){
			Toast.makeText(this, "Enter a valid bill amount", Toast.LENGTH_SHORT).show();
		}else{
			try{
				double billAmount = Double.parseDouble(strBillValue);
				double tip = billAmount * 0.15;
				tip = roundToTwoDecimals(tip);
				tvTip.setText("$"+Double.toString(tip));
				
			}catch(Exception ex){
				Toast.makeText(this, "Invalid bill amount: "+strBillValue, Toast.LENGTH_SHORT).show();
			}
				
		}
	}
	
	public void onSubmitTwentyPercent(View v){
		String strBillValue = etBillAmount.getText().toString();
		if(strBillValue == null || strBillValue.isEmpty()){
			Toast.makeText(this, "Enter a valid bill amount", Toast.LENGTH_SHORT).show();
		}else{
			try{
				double billAmount = Double.parseDouble(strBillValue);
				double tip = billAmount * 0.2;
				tip = roundToTwoDecimals(tip);
				tvTip.setText("$"+Double.toString(tip));
				
			}catch(Exception ex){
				Toast.makeText(this, "Invalid bill amount: "+strBillValue, Toast.LENGTH_SHORT).show();
			}
				
		}
	}
	
	private double roundToTwoDecimals(double d){
		return ((double) Math.round(d * 100)/100);
	}
	
}
