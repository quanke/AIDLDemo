// IHandler.aidl
package name.quanke.aidldemo;

// Declare any non-default types here with import statements

import name.quanke.aidldemo.model.Message;

interface IHandler {
    void connect();

    void sendMessage(in Message message);
}
