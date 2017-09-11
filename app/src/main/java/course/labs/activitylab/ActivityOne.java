package course.labs.activitylab;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class ActivityOne extends Activity {

		// string for logcat documentation
		private final static String TAG = "Lab-ActivityOne";

		// lifecycle counts
		//TODO: Create 7 counter variables, each corresponding to a different one of the lifecycle callback methods.
		//TODO:  increment the variables' values when their corresponding lifecycle methods get called.
		int onCreateCounter;
		int onStartCounter;
		int onResumeCounter;
		int onPauseCounter;
		int onStopCounter;
		int onRestartCounter;
		int onDestroyCounter;

		TextView create = (TextView) findViewById(R.id.create);
		TextView start = (TextView) findViewById(R.id.start);
		TextView resume = (TextView) findViewById(R.id.resume);
		TextView pause = (TextView) findViewById(R.id.pause);
		TextView stop = (TextView) findViewById(R.id.stop);
		TextView restart = (TextView) findViewById(R.id.restart);
		TextView destroy = (TextView) findViewById(R.id.destroy);

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_one);
			
			//Log cat print out
			Log.i(TAG, "onCreate called");
			
			//TODO: update the appropriate count variable & update the view
			onCreateCounter++;
			create.setText(onCreateCounter);
		}

		@Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.activity_one, menu);
			return true;
		}
		
		// lifecycle callback overrides
		
		@Override
		public void onStart(){
			super.onStart();
			
			//Log cat print out
			Log.i(TAG, "onStart called");
			
			//TODO:  update the appropriate count variable & update the view

			onStartCounter++;
			start.setText(onStartCounter);
		}

		@Override
		public void onResume(){
			super.onResume();

			Log.i(TAG, "onResume called");

			onResumeCounter++;
			resume.setText(onResumeCounter);
		}

		@Override
		public void onPause(){
			super.onPause();

			Log.i(TAG, "onPause called");

			onPauseCounter++;
			pause.setText(onPauseCounter);
		}

		@Override
		public void onStop(){
			super.onStop();

			Log.i(TAG, "onStop called");

			onStopCounter++;
			stop.setText(onStopCounter);
		}

		@Override
		public void onRestart(){
			super.onRestart();

			Log.i(TAG, "onRestart called");

			onRestartCounter++;
			restart.setText(onRestartCounter);
		}

		@Override
		public void onDestroy(){
			super.onDestroy();

			Log.i(TAG, "onDestroy called");

			onDestroyCounter++;
			destroy.setText(onDestroyCounter);
		}
	    // TODO: implement 5 missing lifecycle callback methods

		@Override
		public void onSaveInstanceState(Bundle savedInstanceState){
			//TODO:  save state information with a collection of key-value pairs & save all  count variables
		}


		public void launchActivityTwo(View view) {
			startActivity(new Intent(this, ActivityTwo.class));
		}
		

}
