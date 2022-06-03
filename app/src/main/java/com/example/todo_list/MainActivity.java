package com.example.todo_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH = 3300;

    Animation imageAnim, textAnim;
    ImageView imageView;
    ImageView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnimationUtils.loadAnimation(this, R.anim.start_animation);

        textAnim = AnimationUtils.loadAnimation(this, R.anim.text_animation);
        imageView = findViewById(R.id.startImage);
        textView = findViewById(R.id.endImage);

        imageView.setAnimation(imageAnim);
        textView.setAnimation(textAnim);


        final Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH);




    }
}