package io.faizauthar12.github.penyajiankopi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import io.faizauthar12.github.penyajiankopi.models.Serving;

public class DetailActivity extends AppCompatActivity {

    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgServing = findViewById(R.id.img_serving);

        TextView servingName = findViewById(R.id.serving_name);
        TextView servingDetails = findViewById(R.id.serving_detail);

        ProgressBar CoffeePercentBar = findViewById(R.id.CoffeePercentBar);
        ProgressBar MilkPercentBar = findViewById(R.id.MilkPercentBar);
        ProgressBar WaterPercentBar = findViewById(R.id.WaterPercentBar);

        Serving serving = getIntent().getParcelableExtra(ITEM_EXTRA);

        if (serving != null) {
            Glide.with(this)
                    .load(serving.getImg())
                    .into(imgServing);
            imgServing.setContentDescription(serving.getName());
            servingName.setText(serving.getName());
            CoffeePercentBar.setProgress(serving.getCofee());
            MilkPercentBar.setProgress(serving.getMilk());
            WaterPercentBar.setProgress(serving.getWater());
            servingDetails.setText(serving.getDetail());
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
