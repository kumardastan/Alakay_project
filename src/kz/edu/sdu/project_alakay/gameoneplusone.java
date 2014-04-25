package kz.edu.sdu.project_alakay;

import java.util.Random;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.widget.TextView;

public class gameoneplusone extends Activity {
	
	TextView ET1;
	TextView ET2;
	
	
	Random r1;
	Random r2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_games_oneplusone);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		super.onCreate(savedInstanceState);
		
		ET1 = (TextView) findViewById(R.id.oneplusone_first);
		ET2 = (TextView) findViewById(R.id.oneplusone_second);
		
		r1 = new Random();
		r2 = new Random();

		int i1 = r1.nextInt(100);
		int i2 = r2.nextInt(100);
		
		
		ET1.setText(String.valueOf(i1));
		ET2.setText(String.valueOf(i2));
		
		
	}

	
	

}
