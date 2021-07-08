package org.vulcan.light.designpattern.behavioural.templatemethod.example;

/**
 * @author Sam Lu
 * @date 2021/7/8
 */
public abstract class Network {

    String userName;
    String password;

    Network() {}

    /**
     * Publish the data to whatever network.
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    /**
     * 登录
     *
     * @param userName
     * @param password
     * @return
     */
    abstract boolean logIn(String userName, String password);

    /**
     * 发送数据
     *
     * @param data
     * @return
     */
    abstract boolean sendData(byte[] data);

    /**
     * 退出登录
     */
    abstract void logOut();

}
