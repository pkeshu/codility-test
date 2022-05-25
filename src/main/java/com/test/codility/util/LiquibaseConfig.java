package com.test.codility.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LiquibaseConfig {
    /**
     *
     * @project codility
     * @author kesharpaudel on 19/05/2022
     * @created_at 19(Thu) May,2022 at 10:29 AM
     *
     */


//        @Autowired
//        private DataSource dataSource;
//
//        @Autowired
//        private ResourceLoader resourceLoader;
//
//        @Bean
//        public SpringLiquibase liquibase() {
//
//            // Locate change log file
//            String changelogFile = "classpath:/liquibase/changelog.xml";
//            Resource resource = resourceLoader.getResource(changelogFile);
//            Assert.state(resource.exists(), "Unable to find file: " + changelogFile);
//
//            // Configure Liquibase
//            SpringLiquibase liquibase = new SpringLiquibase();
//            liquibase.setChangeLog(changelogFile);
//            liquibase.setContexts("test,dev,prod");
//            liquibase.setDataSource(dataSource);
//            liquibase.setDefaultSchema("mySchema");
//            liquibase.setDropFirst(false);
//            liquibase.setShouldRun(true);
//
//            // Verbose logging
//            Map<String, String> params = new HashMap<>();
//            params.put("verbose", true);
//            liquibase.setChangeLogParameters(params);
//
//            return liquibase;

//    }

}
