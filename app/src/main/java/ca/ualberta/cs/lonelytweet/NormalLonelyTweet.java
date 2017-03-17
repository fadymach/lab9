package ca.ualberta.cs.lonelytweet;

/**
 * Created by fmachaal on 3/16/17.
 */

public class NormalLonelyTweet extends LonelyTweet {
    public NormalLonelyTweet(String text) {
        super(text);
    }

    @Override
    public String getTweetBody() {
        return tweetBody;
    }

    //Fixed if statement issue
    @Override
    public boolean isValid() {
        return !(tweetBody.trim().length() == 0
                || tweetBody.trim().length() > 10);

    }
}
