package com.badtesters.guntupalli.versioncontrol_testing;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b=(Button)findViewById(R.id.clickme);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RelativeLayout r = (RelativeLayout)findViewById(R.id.relative);
                TextView t = (TextView)findViewById(R.id.initia);
                if(flag==0) {
                    r.setBackgroundColor(Color.parseColor("#ffffff"));
                    t.setTextColor(Color.parseColor("#000000"));
                    flag=1;
                }else
                {
                    r.setBackgroundColor(Color.parseColor("#000000"));
                    t.setTextColor(Color.parseColor("#ffffff"));
                    flag=0;
                }
                Toast.makeText(MainActivity.this, "You Are Awesome", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
