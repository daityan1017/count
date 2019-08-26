package com.example.count;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ビューグループのインスタンスを生成
        LinearLayout linearLayout = new LinearLayout(getApplication());
        //表示サイズをアクティビティ全体に設定
        linearLayout.setLayoutParams(
                new ViewGroup.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                ));
        //縦並びのレイアウトを設定
        linearLayout.setOrientation(linearLayout.VERTICAL);

    }

    @Override
    public void onClick(View view) {
        textView.setText(String.format("%d 回目",++i));
        //403ページまで
    }
}
