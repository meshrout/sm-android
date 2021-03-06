package org.usjapan.sm;

import org.usjapan.schedule.ScheduleListActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SmActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.sm_activity_menu, menu);
		return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
		Toast.makeText(this, "hi", Toast.LENGTH_LONG);
    	switch(item.getItemId()){
    	case R.id.showvenders:
    		//Do stuff here
    	    return true;
    	case R.id.showschedule:
    	    Intent startschedule = new Intent(this,ScheduleListActivity.class);
    		this.startActivity(startschedule);
    	    return true;
    	default:
    		 return super.onOptionsItemSelected(item);
    	}

    }
    
}