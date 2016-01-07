package com.clouds.liyao.quotereader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by liyao on 1/7/16.
 */
public class QuoteDetail extends Activity {

    private ImageView mImageView;
    private TextView mQuote;
    private int mPosition;
    private DataSource mDataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quote_detail);

        Intent i = getIntent();
        mPosition = i.getIntExtra("position", 0);

        mDataSource = new DataSource();
        mImageView = (ImageView) findViewById(R.id.detail_image);
        mQuote = (TextView) findViewById(R.id.detail_quote);

        mImageView.setImageResource(mDataSource.getmPhotoHdPool().get(mPosition));
        mQuote.setText(getResources().getString(mDataSource.getmQuotePool().get(mPosition)));
    }
}
