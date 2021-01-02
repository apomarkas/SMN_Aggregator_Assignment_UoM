package com.example.smn_aggregator_assignment;

import android.os.AsyncTask;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;

public class TwitterSearch extends AsyncTask<Void,Void, ArrayList<Post>> {

    private Twitter twitter;
    private TwitterConfig t = new TwitterConfig();
    private SearchFragment searchFragment ;

    public TwitterSearch(SearchFragment fragment){
        this.searchFragment = fragment;
        twitter = t.getTwitter();
    }

    private ArrayList<Post> tweetSearch() throws TwitterException

    {

        List<twitter4j.Status> tweets ;
        Long twId ;
        String twText;
        ArrayList<Post>  posts = new ArrayList<>();
        Query query = new Query("dogs");
        QueryResult result = twitter.search(query);
        tweets = result.getTweets();
        for (twitter4j.Status status : tweets) {
            twId = status.getId();
            twText = status.getText();
            Post p = new Post(twText,"test");
            posts.add(p);



        }
        return posts;

    }


    @Override
    protected ArrayList<Post> doInBackground(Void... integers) {
        ArrayList<Post> result;
        try {
            result = this.tweetSearch();
            return result;
        } catch (TwitterException e) {
            e.printStackTrace();
            return null;
        }

    }


    @Override
    protected void onPostExecute(ArrayList<Post> searchResult) {


        ArrayList<Post> posts  = searchResult;
        searchFragment.setSearchList(posts);



    }
}
