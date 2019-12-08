package io.faizauthar12.github.penyajiankopi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.serving_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.about) {
            Intent intent = new Intent(ServingActivity.this, AboutActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
