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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.Button;
import android.widget.ImageView;
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

public class MenuActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private TextView textview1;
	private LinearLayout linear13;
	private ImageView imageview2;
	private Button button2;
	private TextView textview4;
	private Button button3;
	private TextView textview5;
	private Button button4;
	private TextView textview6;
	private Button button5;
	private TextView textview7;
	private TextView textview8;
	
	private RequestNetwork awalan2;
	private RequestNetwork.RequestListener _awalan2_request_listener;
	private Intent risec1337tutor = new Intent();
	private Intent kumpulanscript = new Intent();
	private Intent tutorialperetas = new Intent();
	private Intent alatonline = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.menu);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		linear3 = findViewById(R.id.linear3);
		linear5 = findViewById(R.id.linear5);
		linear6 = findViewById(R.id.linear6);
		linear7 = findViewById(R.id.linear7);
		linear9 = findViewById(R.id.linear9);
		linear10 = findViewById(R.id.linear10);
		linear11 = findViewById(R.id.linear11);
		linear12 = findViewById(R.id.linear12);
		textview1 = findViewById(R.id.textview1);
		linear13 = findViewById(R.id.linear13);
		imageview2 = findViewById(R.id.imageview2);
		button2 = findViewById(R.id.button2);
		textview4 = findViewById(R.id.textview4);
		button3 = findViewById(R.id.button3);
		textview5 = findViewById(R.id.textview5);
		button4 = findViewById(R.id.button4);
		textview6 = findViewById(R.id.textview6);
		button5 = findViewById(R.id.button5);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		awalan2 = new RequestNetwork(this);
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				risec1337tutor.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				risec1337tutor.setClass(getApplicationContext(), RisectutorActivity.class);
				startActivity(risec1337tutor);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				kumpulanscript.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				kumpulanscript.setClass(getApplicationContext(), KumpulanscriptActivity.class);
				startActivity(kumpulanscript);
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				tutorialperetas.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				tutorialperetas.setClass(getApplicationContext(), Error1Activity.class);
				startActivity(tutorialperetas);
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				alatonline.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
				alatonline.setClass(getApplicationContext(), AlatonlineActivity.class);
				startActivity(alatonline);
			}
		});
		
		_awalan2_request_listener = new RequestNetwork.RequestListener() {
			@Override
			public void onResponse(String _param1, String _param2, HashMap<String, Object> _param3) {
				final String _tag = _param1;
				final String _response = _param2;
				final HashMap<String, Object> _responseHeaders = _param3;
				
			}
			
			@Override
			public void onErrorResponse(String _param1, String _param2) {
				final String _tag = _param1;
				final String _message = _param2;
				
			}
		};
	}
	
	private void initializeLogic() {
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