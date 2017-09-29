/*
 *Class Name: ImportantTweet
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
 * Represents a ImportantTweet
 *
 * @author taijie
 * @version 1.0
 * @see Tweet
 * @see NormalTweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet implements Tweetable {

    /**
     * Constructs ImportantTweet
     *
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs ImportantTweet
     *
     * @param message
     * @param date
     */

    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Judges if tweet is important
     *
     * @return
     */
    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }
}