package kz.edu.sdu.project_alakay;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;


public class MainActivity extends Activity implements OnClickListener {

	ImageView sunny;
	ImageView bEDU, bGames, bFairy;
	
	MediaPlayer sunnyButton_Sound;
	
	int tt = 0;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//identification of buttons
		sunny = (ImageView) findViewById(R.id.sun);
		bEDU = (ImageView) findViewById(R.id.edu);
		bGames = (ImageView) findViewById(R.id.game);
		bFairy = (ImageView) findViewById(R.id.fairy);
		
		sunnyButton_Sound = MediaPlayer.create(this, R.raw.nnn);
		
		//Animation of the sun. Start to rotate ~3.5 seconds.
		//ClockRotate.xml
		/*	
		 * 	
		 * Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
		 * R.anim.clockrotate);
		 * sunny.startAnimation(animation);
		 * 
		*/
		
		bEDU.setOnClickListener(this);
		bGames.setOnClickListener(this);
		bFairy.setOnClickListener(this);
		sunny.setOnClickListener(this);

		//some random to choose one of mediaaudiofile
		/*Random r = new Random();
		int ki = r.nextInt(2)+1;
		
		switch (ki) {
		case 1:
			sunnyButton_Sound = MediaPlayer.create(this, R.raw.mmm);
			break;
		case 2:
			sunnyButton_Sound = MediaPlayer.create(this, R.raw.nnn);
		}
		*/
		
		
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
			
		case R.id.sun:
			if (tt == 0) {
				sunnyButton_Sound.start();
				tt = 1;
			}
			else if(tt == 1){
				sunnyButton_Sound.pause();
				tt = 0;
				}
			break;
		}
	}
}
