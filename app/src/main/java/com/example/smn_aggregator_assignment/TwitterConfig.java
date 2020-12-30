package com.example.smn_aggregator_assignment;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterConfig {

    public Twitter getTwitter() {
        return twitter;
    }

    private Twitter twitter;

    public TwitterConfig() {
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("du44RFHMUokyGyDBqD8WLuHEF")
                .setOAuthConsumerSecret("eMeYz7zDzUmVXFbuChuj49wFvutttdMluuZjJUrKjXorUdkT8j")
                .setOAuthAccessToken("1341061068534276097-VoUuu4wxcw28ZbHkh7EaQvEIoNr5Sa")
                .setOAuthAccessTokenSecret("7xDxA2o90mIVf1KmgsJoJCew697phkSUv5Z8YA41goQmP");
        TwitterFactory tf = new TwitterFactory(cb.build());
        twitter = tf.getInstance();
    }
}
