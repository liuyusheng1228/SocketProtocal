package com.heihei.socket.protocal.socketprotocal;
/**
 * 
 * @author heihei
 *
 */
public interface ResponseCallback {

    void targetIsOffline(DataProtocol reciveMsg);

    void targetIsOnline(String clientIp);
}
