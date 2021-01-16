package edu.cs.birzeit.groupproject;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import edu.cs.birzeit.groupproject.model.Movie;
public class DetailsActivity extends AppCompatActivity {
    int index;
    private Movie movie = null;
    private ImageView img;
    private TextView title;
    private TextView description;
    private TextView genre;
    private TextView year;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent intent = getIntent();
        // get the Movie index to show it's details
        index = intent.getExtras().getInt("index");
        System.out.println(index);
        movie = MainActivity.movies.get(index);
        img = findViewById(R.id.imgD);
        title = findViewById(R.id.nameD);
        description = findViewById(R.id.descriptionD);
        genre = findViewById(R.id.genreD);
        year = findViewById(R.id.yearD);
        displayData(movie);
    }

    private void displayData(Movie movie) {
        Drawable dr = ContextCompat.getDrawable(this, movie.getImageId());
        img.setImageDrawable(dr);
        title.setText(movie.getTitle());
        description.setText(movie.getDescription());
        genre.setText(movie.getGenre());
        year.setText(movie.getYear());
    }

    public void finish(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }



    public void  AddToCart(View view) {
        Intent intent = new Intent(this, fourthActivity.class);
        startActivity(intent);
    }
}
