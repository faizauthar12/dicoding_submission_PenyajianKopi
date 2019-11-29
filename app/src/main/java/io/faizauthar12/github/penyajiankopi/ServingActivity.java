package io.faizauthar12.github.penyajiankopi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

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
    }
}
