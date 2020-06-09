package com.example.card_view_example.activity;

import android.os.Bundle;

import com.example.card_view_example.R;
import com.example.card_view_example.adapter.PostAdapter;
import com.example.card_view_example.model.Post;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {
    RecyclerView mainView;
    PostAdapter adapter;
    private ArrayList<Post> postList = new ArrayList<Post>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mainView = findViewById(R.id.recyclerView);
        createPostList();
        // layout config
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // Change to this if you want a HORIZONTAL orientation like a carousel
        // layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        // Change to this layout manager if you want a grid layout display
        // RecyclerView.LayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        mainView.setLayoutManager( layoutManager );

        // adapter config
        adapter = new PostAdapter(postList);
        mainView.setAdapter(adapter);
    }

    public void createPostList() {
        Post p = new Post("Leonardo", "Nicarágua", "#tbt", R.drawable.imagem1);
        postList.add(p);
        p = new Post("Nataly", "Tailândia", "be yourself", R.drawable.imagem2);
        postList.add(p);
        p = new Post("Matheus", "Andradas", "Camila", R.drawable.imagem3);
        postList.add(p);
        p = new Post("Fefo", "Penha", "Ph tem som de F", R.drawable.imagem4);
        postList.add(p);
    }
}