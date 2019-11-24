package io.faizauthar12.github.penyajiankopi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListServingAdapter extends RecyclerView.Adapter<ListServingAdapter.ListViewHolder> {
    private ArrayList<Serving> listServing;

    public ListServingAdapter(ArrayList<Serving> list) {
        this.listServing = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_serving, viewGroup, false
        );
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Serving serving = listServing.get(position);
        Glide.with(holder.itemView.getContext())
                .load(serving.getImg())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgServing);
        holder.servingName.setText(serving.getName());
        holder.servingDetail.setText(serving.getDetail());

    }

    @Override
    public int getItemCount() {
        return listServing.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgServing;
        TextView servingName, servingDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgServing = itemView.findViewById(R.id.img_serving);
            servingName = itemView.findViewById(R.id.serving_name);
            servingDetail = itemView.findViewById(R.id.serving_detail);
        }
    }
}
