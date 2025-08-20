package com.common.util;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Objects;

@Component
public class Utils {
    public  static Environment env;

    public Utils(Environment env) {
        Utils.env=env;
    }

    public static String getMessage(String property,Object... args){
        return MessageFormat.format(Objects.requireNonNull(env.getProperty(property)), args);
    }
}
