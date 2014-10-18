package com.spritzinc.android.sdk.sample.helloworld;

import com.spritzinc.android.sdk.SpritzSDK;

/**
 * Created by avanha on 1/2/14.
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        SpritzSDK.init(this,
        	"YOUR CLIENT ID",
       		"YOUR CLIENT SECRET",
       		"https://sdk.spritzinc.com/android/examples/login_success.html"
        );
    }

}
