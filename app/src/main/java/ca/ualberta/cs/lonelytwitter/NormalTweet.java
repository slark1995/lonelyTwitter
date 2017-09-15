package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by taijie on 9/14/17.
 */

public class NormalTweet implements Tweetable {
    private NormalTweet(String message){
        super(message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
