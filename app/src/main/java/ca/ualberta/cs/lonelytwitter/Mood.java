package ca.ualberta.cs.lonelytwitter;

import java.util.Date;



public  abstract class Mood{
    private String mood;
    private Date date;

    public Mood(String message){
        this.mood = mood;
        this.date = new Date();


    }

    public Mood(String message, Date date){
        this.mood = mood;
        this.date = date;
    }


    public void setDate(Date date){
        this.date = date;
    }



    private Date getDate(){
        return date;
    }

    public String getMood(){
        return message;
    }

    public abstract Boolean isGood();


}

