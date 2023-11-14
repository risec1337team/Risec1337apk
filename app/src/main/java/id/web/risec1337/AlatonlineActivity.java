package id.web.risec1337;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class AlatonlineActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private WebView webview1;
	private TextView textview1;
	
	private RequestNetwork alat1;
	private RequestNetwork.RequestListener _alat1_request_listener;
	private Intent respon = new Intent();
	private Intent norespon1 = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.alatonline);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		webview1 = findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		textview1 = findViewById(R.id.textview1);
		alat1 = new RequestNetwork(this);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_alat1_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				webview1.setVisibility(View.GONE);
				respon.setClass(getApplicationContext(), Error1Activity.class);
				startActivity(respon);
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				norespon1.setClass(getApplicationContext(), AlatonlineActivity.class);
				startActivity(norespon1);
			}
		};
	}
	
	private void initializeLogic() {
		webview1.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
		android.net.ConnectivityManager cm = (android.net.ConnectivityManager) this.getSystemService(android.content.Context.CONNECTIVITY_SERVICE); android.net.NetworkInfo activeNetwork = cm.getActiveNetworkInfo(); if (activeNetwork != null) { if (activeNetwork.getType() == android.net.ConnectivityManager.TYPE_WIFI) { webview1.setVisibility(View.VISIBLE);
				webview1.loadUrl("https://alat.risec1337.web.id/?m=1"); } else if (activeNetwork.getType() == android.net.ConnectivityManager.TYPE_MOBILE) { webview1.setVisibility(View.VISIBLE);
				webview1.loadUrl("https://alat.risec1337.web.id/?m=1"); } } else { webview1.setVisibility(View.GONE); startActivity(new Intent(AlatonlineActivity.this, Error1Activity.class)); } 
		
		
		
		webview1.setWebViewClient(new WebViewClient() { public void onReceivedError(WebView webview1, int errorCode, String description, String failingUrl) {startActivity(new Intent(AlatonlineActivity.this, Error1Activity.class)); } });
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input) {
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels() {
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels() {
		return getResources().getDisplayMetrics().heightPixels;
	}
}