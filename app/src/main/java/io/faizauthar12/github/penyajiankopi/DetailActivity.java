package io.faizauthar12.github.penyajiankopi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import io.faizauthar12.github.penyajiankopi.models.Serving;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgServing = findViewById(R.id.img_serving);

        Serving serving = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (serving != null) {
            Glide.with(this)
                    .load(serving.getImg())
                    .into(imgServing);
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(serving.getName());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
