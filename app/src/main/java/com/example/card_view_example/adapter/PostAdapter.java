package com.example.card_view_example.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.card_view_example.R;
import com.example.card_view_example.model.Post;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    List<Post> postList;
    public PostAdapter (List<Post> postList) {
        this.postList = postList;
    }

    /**
     * To set up view
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View cardView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new MyViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Post post  = postList.get(position);
        holder.name.setText(post.getName());
        holder.location.setText(post.getLocation());
        holder.legend.setText(post.getLegend());
        holder.postImage.setImageResource(post.getImage());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name, location, legend;
        ImageView postImage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.name);
            location = itemView.findViewById(R.id.location);
            legend = itemView.findViewById(R.id.legend);

            postImage = itemView.findViewById(R.id.postImage);
        }
    }

}
