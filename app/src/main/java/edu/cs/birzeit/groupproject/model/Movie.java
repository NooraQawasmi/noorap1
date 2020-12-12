package edu.cs.birzeit.groupproject.model;

import edu.cs.birzeit.groupproject.R;

public class Movie {
    public String tittle;
    public int imageId;
    public static  Movie[] list= new Movie[]{
            new Movie("Jumanji", R.drawable.jumanji),
            new Movie("Lacasa De Papel", R.drawable.lacasadepapel),
            new Movie("Parker", R.drawable.parker),
            new Movie("Exeter",R.drawable.exeter),
            new Movie("Men in black", R.drawable.mib),
            new Movie("Mission Impossible", R.drawable.mp),
            new Movie("Ride Along", R.drawable.ridealong),
            new Movie("Sijjin 2 ", R.drawable.sijjin2),
            new Movie("Sijjin 6", R.drawable.sijjin6),
            new Movie("Tahanji", R.drawable.tahanji),
            new Movie("The Conjuring", R.drawable.theconjuring)
    };


public Movie(String tittle, int imageId){
        this.tittle=tittle;
        this.imageId=imageId;
}

public int getImageId(){
    return imageId;
}
    public String getTittle(){
        return tittle;
    }
}
