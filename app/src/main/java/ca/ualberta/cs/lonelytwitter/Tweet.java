/*
 *Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date :September 28, 2017
 *
 * Copyright(c) Team X, CMPUT University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behavior at University Of Alberta
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author taijie
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet {

    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects
     * @param message tweet message
     * @param date tweet date
     */


    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();

    /**
     * Sets tweet messages
     *
     * @param message
     * @throws TweetTooLongException
     */



    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Gets message
     *
     * @return string
     */

    public String getMessage(){
        return this.message;
    }

    /**
     * Gets date
     *
     * @return Date
     */

    public Date getDate() {
        return date;
    }

    /**
     * Sets date
     *
     * @param date
     */

    public void setDate(Date date) {
        this.date = date;
    }


    /**
     *
     * @return String
     */
    @Override

    public String toString() {
        return date.toString() + " | " + message;
    }
}