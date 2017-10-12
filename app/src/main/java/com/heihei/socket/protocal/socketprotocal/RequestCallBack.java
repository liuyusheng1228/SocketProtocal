package com.heihei.socket.protocal.socketprotocal;
/**
 * 
 * @author heihei
 *
 */
public interface RequestCallBack {
	 void onSuccess(BasicProtocol msg);

	  void onFailed(int errorCode, String msg);

}
