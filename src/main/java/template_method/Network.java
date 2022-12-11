package template_method;

import java.nio.charset.StandardCharsets;

public abstract class Network {
    String userName;
    String passowrd;

    public Network() {
    }

    public final boolean post(String message){
        if(logIn(this.userName, this.passowrd)){
            boolean result = sendData(message.getBytes(StandardCharsets.UTF_8));
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
