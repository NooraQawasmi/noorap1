package edu.cs.birzeit.groupproject.model;

public class CD {
    private  int id;
    private  String tittle;
    private String cat;
    private int numOfPages;

    public CD(int id,String title, String cat, int numOfPages) {
       this.id=id;
       this.tittle=tittle;
       this.cat=cat;
       this.numOfPages=numOfPages;
    }
    public int getId() {
        return id;
    }

    public String getTittle() {
        return tittle;
    }

    public String getCat() {
        return cat;
    }

    public int getNumOfPages(){
        return numOfPages;
    }




}
