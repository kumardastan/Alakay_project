package kz.edu.sdu.project_alakay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener {

	ImageView sunny;
	ImageView bEDU, bGames, bFairy;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		sunny = (ImageView) findViewById(R.id.sun);
		bEDU = (ImageView) findViewById(R.id.edu);
		bGames = (ImageView) findViewById(R.id.game);
		bFairy = (ImageView) findViewById(R.id.fairy);
		
		Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
				R.anim.clockrotate);
		sunny.startAnimation(animation);
		
		bEDU.setOnClickListener(this);
		bGames.setOnClickListener(this);
		bFairy.setOnClickListener(this);

		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.edu:
			Intent i = new Intent(this, Education.class);
			startActivity(i);
			break;
		case R.id.game:
			Intent i1 = new Intent(this, Games.class);
			startActivity(i1);
			break;
		case R.id.fairy:
			Intent i2 = new Intent(this, Fairy.class);
			startActivity(i2);
			break;
		}
		
	}

	

}
