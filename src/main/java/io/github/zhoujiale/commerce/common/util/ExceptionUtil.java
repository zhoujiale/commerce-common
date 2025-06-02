package io.github.zhoujiale.commerce.common.util;

/**
 * 异常处理工具
 */
public class ExceptionUtil {

    public static String getStackTrace(Exception ex){
        StackTraceElement stackTraceElement = ex.getStackTrace()[0];
        return ex + ",errorMessage: " + stackTraceElement + ",lineNumber: " + stackTraceElement.getLineNumber();
    }
}
