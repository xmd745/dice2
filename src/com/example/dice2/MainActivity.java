package com.example.dice2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

	ImageView img_c, img_u;
	Button btn;
	TextView txt;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        img_c = (ImageView)findViewById(R.id.imageView1);
        img_u = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button1);
        txt = (TextView)findViewById(R.id.textView4);
        
        btn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int rand_c = (int)Math.round(Math.random() * 5);
		int rand_u = (int)Math.round(Math.random() * 5);
		
		img_c.setImageResource(R.drawable.dice21 + rand_c);
		img_u.setImageResource(R.drawable.dice21 + rand_u);
		
		if(rand_c > rand_u)
			txt.setText("컴퓨터가 이겼습니다.");
		else if(rand_u > rand_c)
			txt.setText("당신이 이겼습니다.");
		else
			txt.setText("비겼습니다.");
	}
}
