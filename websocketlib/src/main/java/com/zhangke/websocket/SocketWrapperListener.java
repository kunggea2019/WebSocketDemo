package com.zhangke.websocket;

import com.zhangke.websocket.request.Request;
import com.zhangke.websocket.response.Response;

/**
 * {@link WebSocketWrapper} 监听器
 * <p>
 * Created by ZhangKe on 2019/3/22.
 */
public interface SocketWrapperListener {

    /**
     * 连接成功
     */
    void onConnected();

    /**
     * 连接失败
     */
    void onConnectFailed(Throwable e);

    /**
     * 连接断开
     */
    void onDisconnect();

    /**
     * 数据发送失败
     *
     * @param request 发送的请求
     * @param type    失败类型：{@link com.zhangke.websocket.response.ErrorResponse#ERROR_NO_CONNECT}、
     *                {@link com.zhangke.websocket.response.ErrorResponse#ERROR_UNKNOWN}、
     *                {@link com.zhangke.websocket.response.ErrorResponse#ERROR_UN_INIT}
     */
    void onSendDataError(Request request, int type, Throwable tr);

    /**
     * 接收到消息
     */
    void onMessage(Response message);
}
