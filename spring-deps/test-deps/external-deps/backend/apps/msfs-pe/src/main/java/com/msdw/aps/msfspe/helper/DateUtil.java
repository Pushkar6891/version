package com.msdw.aps.msfspe.helper;

import com.msdw.aps.quad.controller.exception.QuadRuntimeException;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateUtil {
    static final Logger LOGGER = LoggerFactory.getLogger(DateUtil.class);

    private DateUtil() {
    }

    static DateTimeFormatter format = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .appendOptional(DateTimeFormatter.ofPattern("yyyy MM dd"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy/MM/dd"))
            .appendOptional(DateTimeFormatter.ofPattern("MM-dd-yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("MM/dd/yyyy"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyyMMdd"))
            .appendOptional(DateTimeFormatter.ofPattern("dd MMM yyyy"))
            .toFormatter();

    public static Date getDateFromString(String date) {
        try {
            LocalDate localDate = LocalDate.parse(date, format);
            return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        } catch (Exception e) {
            LOGGER.error("Error in parsing date" + ExceptionUtils.getStackTrace(e));
            throw new QuadRuntimeException("Error in parsing date", e);
        }
    }

    static ThreadLocal<SimpleDateFormat> formatDateThreadLocal = ThreadLocal.withInitial(
            () -> new SimpleDateFormat("MM/dd/yyyy"));

    public static String formatDate(Date date) {
        return formatDateThreadLocal.get().format(date);
    }
}
