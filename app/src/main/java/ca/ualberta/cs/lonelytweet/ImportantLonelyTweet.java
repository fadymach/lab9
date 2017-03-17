package ca.ualberta.cs.lonelytweet;

import android.util.Log;

/**
 * Created by fmachaal on 3/16/17.
 */

public class ImportantLonelyTweet extends LonelyTweet {
    public ImportantLonelyTweet(String text) {
        super(text);
    }

    @Override
    public String getTweetBody()
    {
        String msg = tweetBody.toUpperCase();
        Log.i("LonelyTweet", msg);
        return msg;
    }

    //Fixed if statement error
    @Override
    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 20);

    }
}
