package io.github.zhoujiale.commerce.common.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import io.github.zhoujiale.commerce.common.enums.ResponseCodeEnum;
import io.github.zhoujiale.commerce.common.error.ServiceException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

@Slf4j
public class DateUtil {

    private static final String DATE_TIME = "yyyy-MM-dd HH:mm:ss";

    private static final String DAY = "yyyy-MM-dd";

    private static final int ZONE = 8;


    public static LocalDateTime localDateTimeOf(String strDateTime){
        if (StringUtils.isBlank(strDateTime)){
            return null;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_TIME);
        LocalDateTime localDateTime;
        try {
            localDateTime = LocalDateTime.parse(strDateTime, dateTimeFormatter);
        }catch (DateTimeParseException e){
            log.error(e.getMessage(),e);
            throw new ServiceException(ResponseCodeEnum.PARAM_ERROR,"参数错误");
        }
        return localDateTime;
    }

    public static LocalDate localDateOf(String strDate){
        if (StringUtils.isBlank(strDate)){
            return null;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DAY);
        LocalDate localDate;
        try {
            localDate = LocalDate.parse(strDate,dateTimeFormatter);
        }catch (DateTimeParseException e){
            log.error(e.getMessage(),e);
            throw new ServiceException(ResponseCodeEnum.PARAM_ERROR,"参数错误");
        }
        return localDate;
    }

    public static LocalDateTime localDateTimeOf(Long timestamp){
        if(null == timestamp){
            return null;
        }
        LocalDateTime localDateTime;
        try {
            localDateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.ofHours(ZONE));
        }catch (DateTimeParseException e){
            log.error(e.getMessage(),e);
            throw new ServiceException(ResponseCodeEnum.PARAM_ERROR,"参数错误");
        }
        return localDateTime;
    }

    public static LocalDate localDateOf(Long timestamp){
        if(null == timestamp){
            return null;
        }
        LocalDate localDate;
        try{
            localDate = LocalDate.ofEpochDay(timestamp);
        }catch (DateTimeParseException e){
            log.error(e.getMessage(),e);
            throw new ServiceException(ResponseCodeEnum.PARAM_ERROR,"参数错误");
        }
        return localDate;
    }

    public static String formatDatetime(LocalDateTime localDateTime,String formatter){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(formatter);
        try {
            return localDateTime.format(dateTimeFormatter);
        }catch (DateTimeParseException e){
            log.error(e.getMessage(),e);
            throw new ServiceException(ResponseCodeEnum.PARAM_ERROR,"参数错误");
        }
    }
}
