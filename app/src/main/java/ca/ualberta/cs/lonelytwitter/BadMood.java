package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by taijie on 9/14/17.
 */

public class BadMood {
    private BadMood(String mood){
        super(mood);
    }

    public BadMood(String message, Date date) {
        super(mood, date);
    }

    @Override
    public Boolean isGoodmood(){
        return Boolean.FALSE;
    }

}
