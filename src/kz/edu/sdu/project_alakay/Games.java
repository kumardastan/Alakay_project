package kz.edu.sdu.project_alakay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Games extends Activity implements OnClickListener{
 
	ImageButton imageButton_oneplusone;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setContentView(R.layout.activity_games);
		super.onCreate(savedInstanceState);
		
		imageButton_oneplusone = (ImageButton) findViewById(R.id.oneplusone);
		
		imageButton_oneplusone.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.oneplusone:
			Intent intent = new Intent(this, gameoneplusone.class);
			startActivity(intent);
			break;

		default:
			break;
		}
		
	}

}
