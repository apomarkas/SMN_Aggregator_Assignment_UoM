package com.example.smn_aggregator_assignment;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TwitterSearch extends AsyncTask<Integer,Void, ArrayList<String>> {

    private Twitter twitter;

    private void tweetSearch() throws TwitterException

    {
        TwitterConfig t = new TwitterConfig();
        twitter = t.getTwitter();

        List<twitter4j.Status> posts ;
        ArrayList<String> tweets = new ArrayList<>();
        Query query = new Query("dogs");
        QueryResult result = twitter.search(query);
        for (twitter4j.Status status : posts = result.getTweets()) {
            tweets.add(status.getText());

        }
        ;
    }


    @Override
    protected ArrayList<String> doInBackground(Integer... integers) {
        try {
            this.tweetSearch();
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(ArrayList<String> strings) {
        super.onPostExecute(strings);
    }
}
