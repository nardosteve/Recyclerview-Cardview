package com.example.pavilionx360.recycardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Movie> MovieLists;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        setContentView(R.layout.activity_main);

        MovieLists = new ArrayList<>();

        //Lists of Movies
        MovieLists.add(new Movie("The Grinch(2018)", "Category","Movie Description", R.drawable.grinch));
        MovieLists.add(new Movie("Bumblebee movie(2018)", "Category","Movie Description", R.drawable.bumblebee));
        MovieLists.add(new Movie("Wreck it Ralph(2018)", "Category","Movie Description", R.drawable.ralph));
        MovieLists.add(new Movie("Avengers: infinity war(2018)", "Category","Movie Description", R.drawable.avengers));
        MovieLists.add(new Movie("After(2018)", "Category","Movie Description", R.drawable.after));
        MovieLists.add(new Movie("Alladin(2019)", "Category","Movie Description", R.drawable.aladdin));
        MovieLists.add(new Movie("Captain Marvel(2019)", "Category","Movie Description", R.drawable.captain_marvel));
        MovieLists.add(new Movie("How to train you dragon(2019)", "Category","Movie Description", R.drawable.dragon));
        MovieLists.add(new Movie("Lego movie(2019)", "Category","Movie Description", R.drawable.legomovie));
        MovieLists.add(new Movie("Instant Family(2018)", "Category","Movie Description", R.drawable.instant));
        MovieLists.add(new Movie("Spider(2018)", "Category","Movie Description", R.drawable.spiderman));
        MovieLists.add(new Movie("Toystory(2019)", "Category","Movie Description", R.drawable.toystory));


        RecyclerView MyRv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, MovieLists);
        MyRv.setLayoutManager(new GridLayoutManager(this, 3));
        MyRv.setAdapter(myAdapter);




    }
}
