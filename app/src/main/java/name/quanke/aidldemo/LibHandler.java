package name.quanke.aidldemo;

import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;

/**
 *
 * Created by quanke on 16/7/23.
 */
public class LibHandler extends IHandler.Stub{


    @Override
    public void connect() throws RemoteException {
        Log.d("","connect()");
    }

    @Override
    public void sendMessage(Message message) throws RemoteException {

    }

    @Override
    public IBinder asBinder() {
        return null;
    }
}
