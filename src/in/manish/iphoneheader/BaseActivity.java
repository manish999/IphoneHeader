package in.manish.iphoneheader;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.view.Window;
import android.widget.TextView;

import java.util.Map;

/**
 * Base activity class is used for future purposes. we can add functionality to all classes that extends it.
 * 
 * @author Manish Pathak
 *
 */
public abstract class BaseActivity extends Activity {
	public abstract void init();

	@Override
	protected void onStart() {
		super.onStart();
		//		FlurryAgent.onStartSession(this, ANALYTICS_KEY);
	}

	@Override
	protected void onStop() {
		super.onStop();
		//		FlurryAgent.onEndSession(this);
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	protected void registerEvent(String event) {
		//        FlurryAgent.logEvent(event);
	}

	protected void registerEvent(String event, Map<String, String> parameters) {
		//        FlurryAgent.logEvent(event, parameters);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}

	protected void setHeader(String title, boolean btnHomeVisible, boolean btnFeedbackVisible, boolean headerDetailVisible)
	{
		ViewStub stub = (ViewStub) findViewById(R.id.vsHeader);
		View inflated = stub.inflate();
		TextView txtTitle = (TextView) inflated.findViewById(R.id.txvheader);
		txtTitle.setText(title);

//		final ImageButton btnHome = (ImageButton) inflated.findViewById(R.id.btn_home);
//		btnHome.setBackgroundResource(R.drawable.icon_account);
//		ImageView btnHomeSeperator = (ImageView) inflated.findViewById(R.id.id_seperator_home);
//		if(!btnHomeVisible) {
//			btnHome.setVisibility(View.INVISIBLE);
//			btnHomeSeperator.setVisibility(View.INVISIBLE);
//		}

//		ImageButton btnSetting= (ImageButton) inflated.findViewById(R.id.btn_setting);
//		ImageView btnSettingSeperator = (ImageView) inflated.findViewById(R.id.id_seperator_setting);
//		if(!btnFeedbackVisible) {
//			btnSetting.setVisibility(View.INVISIBLE);
//			btnSettingSeperator.setVisibility(View.INVISIBLE);
//		}
		
//		TextView headerDetail= (TextView) inflated.findViewById(R.id.txvheader_detail);
//		if(!headerDetailVisible) {
//			headerDetail.setVisibility(View.INVISIBLE);
//		}
	}

	/**
	 * Home button click handler
	 * @param v
	 */
	 public void btnHomeClick(View v) {
//		Intent callIntent = new Intent(this, OldIntro.class);
//		callIntent.setFlags (Intent.FLAG_ACTIVITY_CLEAR_TOP);
//		startActivity(callIntent);
//		registerEvent("btn home click");
	 }

	 /**
	  * Feedback button click handler
	  * @param v
	  */
	 public void btnSettingClick(View v) {
//		 Intent callIntent = new Intent(this, PreferencesActivity.class);
//		 startActivity(callIntent);
//		 registerEvent("btn setting click");
	 }
}
