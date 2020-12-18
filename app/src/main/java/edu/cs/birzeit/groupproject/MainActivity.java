package edu.cs.birzeit.groupproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import edu.cs.birzeit.groupproject.model.Movie;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //test comment
        setContentView(R.layout.activity_main);

        RecyclerView recycler = findViewById(R.id.movies_recycle);

        String[] captions = new String[Movie.list.length];
        int[] ids = new int[Movie.list.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Movie.list[i].getTittle();
            ids[i] = Movie.list[i].getImageId();
        }
        recycler.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(captions, ids);
        recycler.setAdapter(adapter);
    }

}