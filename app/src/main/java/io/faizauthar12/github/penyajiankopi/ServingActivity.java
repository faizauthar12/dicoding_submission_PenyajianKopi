package io.faizauthar12.github.penyajiankopi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

import io.faizauthar12.github.penyajiankopi.adapters.ListServingAdapter;
import io.faizauthar12.github.penyajiankopi.data.ServingData;
import io.faizauthar12.github.penyajiankopi.models.Serving;

public class ServingActivity extends AppCompatActivity {
    private RecyclerView rvServing;
    private ArrayList<Serving> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serving);

        rvServing = findViewById(R.id.rv_serving);
        rvServing.setHasFixedSize(true);

        list.addAll(ServingData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvServing.setLayoutManager(new LinearLayoutManager(this));
        ListServingAdapter listServingAdapter = new ListServingAdapter(list);
        rvServing.setAdapter((listServingAdapter));

        listServingAdapter.setOnServingListener(new ListServingAdapter.OnServingListener() {
            @Override
            public void onServingClick(Serving serving) {
                Intent intent = new Intent(ServingActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.ITEM_EXTRA, serving);
                startActivity(intent);
            }
        });
    }
}
