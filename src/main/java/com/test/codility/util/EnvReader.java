package com.test.codility.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "test")
public class EnvReader {

    /**
     *
     * @project codility
     * @author kesharpaudel on 19/05/2022
     * @created_at 19(Thu) May,2022 at 11:10 AM
     *
     */

    private String test;

    public String getTest() {
        return test;
    }
}
