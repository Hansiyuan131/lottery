package com.yuanstack.lottery.infrastructure.component.monitor;

/**
 * @description: 监控常量类
 * @author: hansiyuan
 * @date: 2022/4/12 4:54 PM
 */
public class MonitorConstants {
    public static final String LOG_NAME = "monitorLogger";
    public static final String YYYY_MM_DD = ".%d{yyyy-MM-dd}.%i";
    public static final String M_N = "%m%n";
    public static final String M = "%m";
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    /**
     * /home/admin/edas-container/logs/
     */
    public static final String LOG_FILE_PATH = "/home/admin/edas-container/logs/";
    public static final String APP_FILE_NAME = "monitor";
    public static final String FILE_SUFFIX = ".log";
    public static final String WRITE_THREAD_NAME = "MONITOR-LOG-STAT-WRITE";
    public static final String SPLITTER = "^_^";
    public static final String SPLITTER_1 = "\n";
}