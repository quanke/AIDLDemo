package name.quanke.aidldemo;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/**
 * Created by quanke on 16/7/23.
 */
public class PushManager {

    private static final String TAG = "PushManager.class";
    private IHandler iHandler;

    private static PushManager ourInstance = new PushManager();

    public static PushManager getInstance() {
        return ourInstance;
    }

    private PushManager() {

    }

    public void init(Application app){

        Intent binderIntent = new Intent(app,PushService.class);
        app.bindService(binderIntent, serviceConnection, Context.BIND_AUTO_CREATE);
    }

    public void connect(){
        try {
            //通过AIDL远程调用
            Log.d(TAG,"++start Remote++");
            iHandler.connect();
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }


    private ServiceConnection serviceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            iHandler = IHandler.Stub.asInterface(service);
            //连接成功调动
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            //断开连接调用
        }
    };
}
