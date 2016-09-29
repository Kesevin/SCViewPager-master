package com.dev.sacot41.myresume;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * author：Administrator on 2016/9/28 17:23
 * company: xxxx
 * email：1032324589@qq.com
 */

public class TestActivity extends Activity {

    @Bind(R.id.img)
    ImageView img;
    @Bind(R.id.btn_play)
    Button btnPlay;
    private Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        ButterKnife.bind(this);
        // 初始化需要加载的动画资源
        animation = AnimationUtils
                .loadAnimation(this, R.anim.fade_in);
        img.startAnimation(animation);
    }

    @OnClick(R.id.btn_play)
    public void onClick() {
        img.startAnimation(animation);
//        Toast.makeText(this,"onclick",Toast.LENGTH_SHORT).show();
//        img.setTranslationX(200);
//        img.setTranslationY(300);
//        img.requestLayout();
    }
}
