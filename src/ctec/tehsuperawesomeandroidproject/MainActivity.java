package ctec.tehsuperawesomeandroidproject;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;

public class MainActivity extends Activity
{

	private Switch tehButton;
	private ImageView DogeFace;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		DogeFace = (ImageView) findViewById(R.id.imageView1);
		tehButton = (Switch) findViewById(R.id.button1);

		setupListeners();
	}

	private void setupListeners()
	{
		// TODO Auto-generated method
		tehButton.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View currentView)
			{
				if (DogeFace.getVisibility() == View.VISIBLE)
				{
					DogeFace.setVisibility(View.INVISIBLE);
				} else
				{
					DogeFace.setVisibility(View.VISIBLE);
				}

			}
		});
	}
}