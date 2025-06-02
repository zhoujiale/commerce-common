package io.github.zhoujiale.commerce.common.util;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Slf4j
public class HttpUtil {

    /**
     * @description 读取请求
     * @author zhou
     * @created  2019/3/11 19:37
     * @param
     * @return
     */
    public static String getRequest(HttpServletRequest request) {
        InputStream in = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String result = "";
        try {
            request.setCharacterEncoding(StandardCharsets.UTF_8.toString());
            in = request.getInputStream();
            isr = new InputStreamReader(in, StandardCharsets.UTF_8);
            br = new BufferedReader(isr);
            StringBuffer sb = new StringBuffer();
            String line = "";
            while ((line = br.readLine()) != null){
                sb.append(line);
            }
            result = sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            log.error("读取请求失败");
        }finally {
            try {
                if (null != br) {
                    br.close();
                }
                if (null != isr) {
                    isr.close();
                }
                if (null != in) {
                    in.close();
                }
            } catch (IOException e) {
                log.error("关闭流失败");
                e.printStackTrace();
            }
        }
        return result;
    }
}
