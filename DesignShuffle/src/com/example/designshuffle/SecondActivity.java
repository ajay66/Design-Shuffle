package com.example.designshuffle;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class SecondActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		final TextView txt1 = (TextView) findViewById(R.id.txt1);
		final TextView txt2 = (TextView) findViewById(R.id.txt2);

			txt1.setBackgroundResource(R.drawable.left_rect);
			txt1.setTextColor(Color.WHITE);
			txt2.setBackgroundResource(R.drawable.right_rect_white);
			txt2.setTextColor(Color.BLACK);

			// 2nd button to be color initially
//			txt2.setBackgroundResource(R.drawable.right_rect);
//			txt2.setTextColor(Color.BLACK);
//			txt1.setBackgroundResource(R.drawable.left_rect_white);
//			txt1.setTextColor(Color.BLACK);
		txt1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				txt1.setBackgroundResource(R.drawable.left_rect);
				// txt1.setBackgroundColor(Color.RED);
				txt1.setTextColor(Color.WHITE);
				// txt2.setBackgroundColor(Color.WHITE);
				// txt2.setTextColor(Color.BLACK);

				txt2.setBackgroundResource(R.drawable.right_rect_white);
				// txt2.setBackgroundColor(Color.WHITE);
				txt2.setTextColor(Color.BLACK);
			}
		});

		txt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				txt2.setBackgroundResource(R.drawable.right_rect);
				// txt2.setBackgroundColor(Color.RED);
				txt2.setTextColor(Color.WHITE);
				// txt1.setBackgroundColor(Color.WHITE);
				// txt1.setTextColor(Color.BLACK);

				txt1.setBackgroundResource(R.drawable.left_rect_white);
				// txt1.setBackgroundColor(Color.RED);
				txt1.setTextColor(Color.BLACK);
			}
		});

	}
}

	}
}
