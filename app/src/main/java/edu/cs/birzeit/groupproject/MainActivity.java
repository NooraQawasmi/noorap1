package edu.cs.birzeit.groupproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import edu.cs.birzeit.groupproject.model.Movie;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    public static ArrayList<Movie> movies;
    private RecyclerViewClickListener recyclerViewClickListener;
    public int indexClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create data to display
        loadData();

        //create listener for the recyclerView
        recyclerViewClickListener = new RecyclerViewClickListener() {
            @Override
            public void recyclerViewListClicked(View v, int position) {
                indexClicked = position;
                showDetails(v);
            }
        };

        RecyclerView recyclerView = findViewById(R.id.movies_recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new Adapter(this,movies,recyclerViewClickListener);
        recyclerView.setAdapter(adapter);

    }

    public void showDetails(View view){
        Intent intent = new Intent(this, DetailsActivity.class);
        intent.putExtra("index",indexClicked);
        startActivity(intent);
    }

    public void loadData(){
        movies = new ArrayList<>();

        movies.add(new Movie("FIFA2021", R.drawable.jumanji, "Sport",
                "PS4 Football game by EASPORT","200Nis"));

        movies.add(new Movie("Valorant", R.drawable.lacasadepapel,"Action",
                "Fight game","150nis"));

        movies.add(new Movie("Butterfield 2", R.drawable.parker, "Action",
                "fight","100Nis"));

        movies.add(new Movie("GTAIV",R.drawable.exeter,"Drive",
                "Drive and fight ","300Nis"));

        movies.add(new Movie("Men in black", R.drawable.mib,"Action"
        ,"Shoot","70Nis"));

        movies.add(new Movie("Mario", R.drawable.mp,"Kids.",
                "Kids game","70Nis"));

        movies.add(new Movie("Need for speed", R.drawable.ridealong,"racing.",
                "racing game ","322Nis"));

//        movies.add(new Movie("Sijjin 2 ", R.drawable.sijjin2,"Horror.",
//                "A woman has had her little child squashed and killed after the jins have turned the cabinet over him as she found out that this was not a coincidence or a matter of death and life rather a malignant black magic has been hatched to hunt their family.","2015"));
//
//        movies.add(new Movie("Sijjin 6", R.drawable.sijjin6,"Horror",
//                "A girl is haunted by an evil spirit in her family home. Several bad things begin to happen around her house and to her family members. ","2019"));
//
//        movies.add(new Movie("Tahanji", R.drawable.tahanji,"Drama.",
//                "Tanhaji Malusare, a military chieftain in the army of the Maratha king Shivaji, leads the charge to capture the strategically important Kondhana fort guarded by the army of the fierce Rajput chieftain Udaybhan Rathod.","2020"));
//
//        movies.add(new Movie("The Conjuring", R.drawable.theconjuring,"Horror.",
//                "Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.","2013"));
    }

}