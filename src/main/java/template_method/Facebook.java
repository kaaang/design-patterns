package template_method;

public class Facebook extends Network{
    public Facebook(String userName, String password) {
        this.userName = userName;
        this.passowrd = password;
    }

    @Override
    boolean logIn(String userName, String password) {
        return false;
    }

    @Override
    boolean sendData(byte[] data) {
        return false;
    }

    @Override
    void logOut() {

    }
}
