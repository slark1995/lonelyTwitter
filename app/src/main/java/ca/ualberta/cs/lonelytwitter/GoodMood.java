package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by taijie on 9/14/17.
 */

public class GoodMood {
    public GoodMood(String message){
        super(mood);
    }

    public GoodMood(String mood, Date date) {
        super(mood, date);
    }

    @Override
    public Boolean isGood(){
        return Boolean.TRUE;
    }
}
