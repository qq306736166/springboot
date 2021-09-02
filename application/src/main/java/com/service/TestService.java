package com.service;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Properties;

@Service
public class TestService {

    public static Properties properties = null;

    public String test() throws IOException {

        return "123456";
    }
}
