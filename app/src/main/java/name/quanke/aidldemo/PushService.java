package name.quanke.aidldemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;


/**
 *
 *
 * Created by http://quanke.name on 16/7/23.
 */
public class PushService extends Service {
    public PushService() {

    }

//    @Nullable
//    @Override
//    public IBinder onBind(Intent intent) {
//        return null;
//    }

    @Override
    public IBinder onBind(Intent intent) {
        return new LibHandler();
    }


    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

}
