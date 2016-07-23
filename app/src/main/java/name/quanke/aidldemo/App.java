package name.quanke.aidldemo;

import android.app.Application;

/**
 * Created by quanke on 16/7/23.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();


        PushManager.getInstance().init(this);
    }
}
