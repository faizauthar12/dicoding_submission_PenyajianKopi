package io.faizauthar12.github.penyajiankopi.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import io.faizauthar12.github.penyajiankopi.R;
import io.faizauthar12.github.penyajiankopi.models.Serving;

public class ListServingAdapter extends RecyclerView.Adapter<ListServingAdapter.ListViewHolder> {
    private final ArrayList<Serving> listServing;
    private OnServingListener onServingListener;

    public ListServingAdapter(ArrayList<Serving> list) {
        this.listServing = list;
    }

    public void setOnServingListener(OnServingListener onServingListener) {
        this.onServingListener = onServingListener;
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
        final Serving serving = listServing.get(position);
        Glide.with(holder.itemView.getContext())
                .load(serving.getImg())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.servingImg);
        holder.servingName.setText(serving.getName());
        holder.servingDetail.setText(serving.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onServingListener.onServingClick(serving);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listServing.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView servingImg;
        TextView servingName, servingDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            servingImg = itemView.findViewById(R.id.serving_img);
            servingName = itemView.findViewById(R.id.serving_name);
            servingDetail = itemView.findViewById(R.id.serving_detail);
        }
    }

    public interface OnServingListener {
        void onServingClick(Serving serving);
    }
}
