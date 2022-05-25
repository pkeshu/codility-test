package com.test.codility;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@RestController
class HealthcheckController {

    //    @GetMapping(value = "/healthcheck")
//    public ResponseEntity<CommonResponse> healthcheck(@RequestParam String format) {
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.set("Content-Type", "application/json");
//        if (format.equals("short")) {
//            ShortResponse shortResponse = new ShortResponse.ShortResponseBuilder()
//                    .status("OK").build();
//            return ResponseEntity.ok().headers(responseHeaders).body(shortResponse);
//        } else if (format.equals("full")) {
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
//            FullResponse fullResponse = new FullResponse.FullResponseBuilder()
//                    .currentTime(ZonedDateTime.now().format(formatter))
//                    .status("OK")
//                    .build();
//            return ResponseEntity.ok().headers(responseHeaders).body(fullResponse);
//        } else {
//            return ResponseEntity.badRequest().headers(responseHeaders).build();
//        }
//
//    }\
    @GetMapping(value = "/healthcheck")
    public ResponseEntity<CommonResponse> healthcheck(@RequestParam String format) {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "application/json");
        if (format.equals("short")) {
            ShortResponse shortResponse = new ShortResponse.ShortResponseBuilder()
                    .status("OK").build();
            return ResponseEntity.ok().headers(responseHeaders).body(shortResponse);
        } else if (format.equals("full")) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
            FullResponse fullResponse = new FullResponse.FullResponseBuilder()
                    .currentTime(ZonedDateTime.now().format(formatter))
                    .status("OK")
                    .build();
            return ResponseEntity.ok().headers(responseHeaders).body(fullResponse);
        } else {
            return ResponseEntity.badRequest().headers(responseHeaders).build();
        }

    }

    @PutMapping(value = "/healthcheck")
    public ResponseEntity healthcheckPut() {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
    }

    @PostMapping(value = "/healthcheck")
    public ResponseEntity healthcheckPost() {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
    }


    @DeleteMapping(value = "/healthcheck")
    public ResponseEntity healthcheckDelete() {
        return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).build();
    }

    public static class ShortResponse implements CommonResponse {
        private final String status;

        public ShortResponse(ShortResponseBuilder builder) {
            this.status = builder.status;
        }

        public String getStatus() {
            return status;
        }


        public static class ShortResponseBuilder {
            private String status;

            public ShortResponseBuilder status(String status) {
                this.status = status;
                return this;
            }

            public ShortResponse build() {
                return new ShortResponse(this);
            }

        }
    }

    public static class FullResponse implements CommonResponse {
        private String currentTime;
        private String status;


        public FullResponse(FullResponseBuilder builder) {
            this.currentTime = builder.currentTime;
            this.status = builder.status;
        }


        public String getStatus() {
            return status;
        }


        public String getCurrentTime() {
            return currentTime;
        }

        public static class FullResponseBuilder {
            private String currentTime;
            private String status;

            public FullResponseBuilder currentTime(String currentTime) {
                this.currentTime = currentTime;
                return this;
            }

            public FullResponseBuilder status(String status) {
                this.status = status;
                return this;
            }

            public FullResponse build() {
                return new FullResponse(this);
            }
        }

    }

    interface CommonResponse {

    }

}


