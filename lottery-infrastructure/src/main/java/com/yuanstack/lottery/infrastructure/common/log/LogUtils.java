package com.yuanstack.lottery.infrastructure.common.log;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;

/**
 * @description: 日志工具类
 * @author: hansiyuan
 * @date: 2022/4/12 5:08 PM
 */
@Slf4j
public class LogUtils {
    public static void debug(Logger logger, String msg, Object... obj) {
        log(logger, LogTypeEnum.DEBUG, msg, obj);
    }

    public static void info(Logger logger, String msg, Object... obj) {
        log(logger, LogTypeEnum.INFO, msg, obj);
    }

    public static void warn(Logger logger, String msg, Object... obj) {
        log(logger, LogTypeEnum.WARN, msg, obj);
    }

    public static void error(Logger logger, String msg, Object... obj) {
        log(logger, LogTypeEnum.ERROR, msg, obj);
    }


    private static void log(Logger logger, LogTypeEnum logTypeEnum, String msg, Object... obj) {
        try {
            Throwable e = null;
            StringBuilder stringBuilder = new StringBuilder();
            if (obj != null) {
                for (Object o : obj) {
                    if (o instanceof Throwable) {
                        e = (Throwable) o;
                    } else {
//                        String s = JSON.toJSONString(o, new DesensitizeFilter());
//                        s = s.replaceAll("[\\t\\n\\r]", " ");
//                        stringBuilder.append("|" + s);
                    }
                }
            }

            if (e != null) {
                log(logger, logTypeEnum, msg + stringBuilder.toString(), e);
            } else {
                if (logTypeEnum == logTypeEnum.DEBUG) {
                    logger.debug(msg + stringBuilder.toString(), obj);
                } else if (logTypeEnum == logTypeEnum.INFO) {
                    logger.info(msg + stringBuilder.toString(), obj);
                } else if (logTypeEnum == logTypeEnum.WARN) {
                    logger.warn(msg + stringBuilder.toString(), obj);
                } else if (logTypeEnum == logTypeEnum.ERROR) {
                    logger.error(msg + stringBuilder.toString(), obj);
                } else if (logTypeEnum == logTypeEnum.EXCEPTION) {
                    logger.error(msg + stringBuilder.toString(), obj);
                }
            }
        } catch (Exception e) {
            log.error("LogUtils.log异常", ExceptionUtils.getStackTrace(e), e);
        }
    }


    public static void log(Logger logger, LogTypeEnum logTypeEnum, String msg, Throwable e) {
        if (logTypeEnum == logTypeEnum.DEBUG) {
            logger.debug(msg + " exception:" + ExceptionUtils.getStackTrace(e), e);
        } else if (logTypeEnum == logTypeEnum.INFO) {
            logger.info(msg + " exception:" + ExceptionUtils.getStackTrace(e), e);
        } else if (logTypeEnum == logTypeEnum.WARN) {
            logger.warn(msg + " exception:" + ExceptionUtils.getStackTrace(e), e);
        } else if (logTypeEnum == logTypeEnum.ERROR) {
            logger.error(msg + " exception:" + ExceptionUtils.getStackTrace(e), e);
        } else if (logTypeEnum == logTypeEnum.EXCEPTION) {
            logger.error(msg + " exception:" + ExceptionUtils.getStackTrace(e), e);
        }
    }


}
