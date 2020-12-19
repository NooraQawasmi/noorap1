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

        movies.add(new Movie("Jumanji", R.drawable.jumanji, "Adventure, Comedy.",
                "Four teenagers are sucked into a magical video game, and the only way they can escape is to work together to finish the game.","2017"));

        movies.add(new Movie("Lacasa De Papel", R.drawable.lacasadepapel,"Action, Adventure.",
                "The goal is to infiltrate the Royal Mint of Spain in order to print €2.4 billion in less than 11 days, without spelling a single drop of blood.","2019"));

        movies.add(new Movie("Parker", R.drawable.parker, "Action, Criminal.",
                "Parker is a thief who has an unusual code. He doesn't steal from the poor and hurt innocent people. He is asked to join four other guys on a job. They pull it off flawlessly. They tell Parker that what they got can help them set up another job which will net them much more.","2013"));

        movies.add(new Movie("Exeter",R.drawable.exeter,"Horror.",
                "A group of teens decide to throw a wild party at an abandoned hospital for deranged children and unleash an evil presence that aims to kill them all. ","2015"));

        movies.add(new Movie("Men in black", R.drawable.mib,"Action, Comedy."
        ,"Is a secret agency that polices these aliens, protects Earth from extraterrestrial threats and uses memory-erasing neuralyzers to keep alien activity a secret.","1997"));

        movies.add(new Movie("Mission Impossible", R.drawable.mp,"Adventure.",
                "The plot follows Ethan Hunt (Cruise) and his mission to uncover the mole who has framed him for the murders of most of his Impossible Missions Force (IMF) team.","1996"));

        movies.add(new Movie("Ride Along", R.drawable.ridealong,"Comedy.",
                "He film follows Ben Barber, a high school security guard who must prove to his girlfriend's brother, James, that he is worthy of marrying her. ","2014"));

        movies.add(new Movie("Sijjin 2 ", R.drawable.sijjin2,"Horror.",
                "A woman has had her little child squashed and killed after the jins have turned the cabinet over him as she found out that this was not a coincidence or a matter of death and life rather a malignant black magic has been hatched to hunt their family.","2015"));

        movies.add(new Movie("Sijjin 6", R.drawable.sijjin6,"Horror",
                "A girl is haunted by an evil spirit in her family home. Several bad things begin to happen around her house and to her family members. ","2019"));

        movies.add(new Movie("Tahanji", R.drawable.tahanji,"Drama.",
                "Tanhaji Malusare, a military chieftain in the army of the Maratha king Shivaji, leads the charge to capture the strategically important Kondhana fort guarded by the army of the fierce Rajput chieftain Udaybhan Rathod.","2020"));

        movies.add(new Movie("The Conjuring", R.drawable.theconjuring,"Horror.",
                "Paranormal investigators Ed and Lorraine Warren work to help a family terrorized by a dark presence in their farmhouse.","2013"));
    }

}