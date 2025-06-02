package io.github.zhoujiale.commerce.common.util;

import com.alibaba.fastjson2.JSONObject;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponseWrapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import io.github.zhoujiale.commerce.common.constant.CommonConstant;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * 日志工具
 **/
@Slf4j
public class LogUtil {

    public static String getParams(Object[] args, HttpServletRequest request){
        String params = StringUtils.EMPTY;
        Enumeration<String> parameterNames = request.getParameterNames();
        if(parameterNames.hasMoreElements()){
            List<String> stringList = new ArrayList<>(10);
            while (parameterNames.hasMoreElements()) {
                String element = parameterNames.nextElement();
                stringList.add(element + CommonConstant.COLON + request.getParameter(element));
            }
            params = JSONObject.toJSONString(stringList);
            log.info("params:{}", params);
        }else if (null != args && args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                if (arg instanceof MultipartFile) {
                    params = ((MultipartFile) arg).getOriginalFilename();
                } else if (arg instanceof HttpServletResponseWrapper || arg instanceof HttpServletRequestWrapper) {
                } else {
                    params = JSONObject.toJSONString(args[i]);
                }
                log.info("params:{}", params);
            }
        }
        return params;
    }
}
