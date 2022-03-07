package com.example.parsehub;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("j6psTdYO4JbufQw07gzfNwyklGRXs4N4EFcgW1iS")
                .clientKey("dMT4XZma1glD7GP9ELPyfMV72D7jzsCSw7In3NwN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
