package com.example.smn_aggregator_assignment;

import android.os.AsyncTask;

import androidx.core.app.ComponentActivity;

import java.util.ArrayList;

import twitter4j.Trend;
import twitter4j.Trends;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.api.TrendsResources;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterTopTrends extends AsyncTask<Integer,Void,ArrayList<String>> {

    private Twitter twitter ;
    TwitterConfig t =  new TwitterConfig();

    BlankFragment trendFragment;

    public TwitterTopTrends(BlankFragment fragment){
        this.trendFragment = fragment;
        twitter = t.getTwitter();
    }






    @Override
    protected ArrayList<String> doInBackground(Integer... codes) {

        int country = codes[0] ;
        ArrayList<String> names = new ArrayList<>();
        
        Trends trends = null;
        try {
            trends = twitter.getPlaceTrends(country);
        } catch (TwitterException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < trends.getTrends().length; i++) {
            names.add(trends.getTrends()[i].getName());
        }

        return names;
    }

    @Override
    protected void onPostExecute(ArrayList<String> strings) {

        ArrayList<String> items = strings;
       trendFragment.setTrendList(items);






    }


}
