package com.daxiang.core;

import com.daxiang.utils.NetUtil;


/**
 * Created by jiangyitao.
 */
public class PortProvider {

    // [startPort, endPort, port]
    private static final int[] APPIUM_SERVER_PORTS = {20000, 20999, 20000};
    private static final int[] MINITOUCH_PORTS = {21000, 21999, 21000};
    private static final int[] MINICAP_PORTS = {22000, 22999, 22000};
    private static final int[] ADBKIT_PORTS = {23000, 23999, 23000};
    private static final int[] UIAUTOMATOR2_SERVER_PORTS = {24000, 24999, 24000};
    private static final int[] WDA_LOCAL_PORTS = {25000, 25999, 25000};
    private static final int[] WDA_MJPEG_SERVER_PORTS = {26000, 26999, 26000};
    private static final int[] CHROME_DRIVER_PORTS = {27000, 27999, 27000};
    private static final int[] WEBKIT_DEBUG_PROXY_PORTS = {28000, 28999, 28000};
    private static final int[] SCRCPY_PORTS = {29000, 29999, 29000};
    private static final int[] SCRCPY_RECORD_VIDEO_PORTS = {30000, 30999, 30000};

    public static synchronized int getChromeDriverAvailablePort() {
        return getAvaliablePort(CHROME_DRIVER_PORTS);
    }

    public static synchronized int getWebkitDebugProxyAvalilablePort() {
        return getAvaliablePort(WEBKIT_DEBUG_PROXY_PORTS);
    }

    public static synchronized int getAppiumServerAvailablePort() {
        return getAvaliablePort(APPIUM_SERVER_PORTS);
    }

    public static synchronized int getMinitouchAvailablePort() {
        return getAvaliablePort(MINITOUCH_PORTS);
    }

    public static synchronized int getMinicapAvailablePort() {
        return getAvaliablePort(MINICAP_PORTS);
    }

    public static synchronized int getAdbKitAvailablePort() {
        return getAvaliablePort(ADBKIT_PORTS);
    }

    public static synchronized int getUiautomator2ServerAvailablePort() {
        return getAvaliablePort(UIAUTOMATOR2_SERVER_PORTS);
    }

    public static synchronized int getWdaLocalAvailablePort() {
        return getAvaliablePort(WDA_LOCAL_PORTS);
    }

    public static synchronized int getWdaMjpegServerAvailablePort() {
        return getAvaliablePort(WDA_MJPEG_SERVER_PORTS);
    }

    public static synchronized int getScrcpyAvailablePort() {
        return getAvaliablePort(SCRCPY_PORTS);
    }

    public static synchronized int getScrcpyRecordVideoPort() {
        return getAvaliablePort(SCRCPY_RECORD_VIDEO_PORTS);
    }

    private static int getAvaliablePort(int[] ports) {
        int availablePort = NetUtil.getAvailablePort(ports[0], ports[1], ports[2]);
        ports[2] = availablePort + 1;
        return availablePort;
    }
}