package com.eathindhar.animations;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    public void fadeImage(View view){
        ImageView imgViewB = (ImageView)findViewById(R.id.bartImageView);
        ImageView imgViewH = (ImageView)findViewById(R.id.homerImageView);
        Log.i("Info","Image Clicked!");
        if(count == 0){
            imgViewB.animate().alpha(0).setDuration(1000);
            imgViewH.animate().alpha(1).setDuration(1000);
            count=1;
        }else {
            imgViewB.animate().alpha(1).setDuration(1000);
            imgViewH.animate().alpha(0).setDuration(1000);
            count = 0;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
