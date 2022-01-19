package com.ahmad.video_list;
import android.app.*;
import android.os.*;
import android.content.*;
import android.net.*;
import android.widget.*;

public class Splash extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{

		super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);



		VideoView yousuf = findViewById(R.id.splashVideoView1);



       // String ahmad = "https://afro-muelheim.000webhostapp.com/001.mp4";
        String ahmad = "android.resource://" + getPackageName() + "/" + R.raw.algna;
        Uri uri = Uri.parse(ahmad);
        yousuf.setVideoURI(uri);
        yousuf.start();

		


		Integer SPLASH_TIME = 1000;
        new Handler().postDelayed(new Runnable() {


				@Override
				public void run() {

					Intent yousuf = new Intent(Splash.this, List_pro.class);
					startActivity(yousuf);
					finish();
				}
			},

			SPLASH_TIME);
    }

}

  


