package com.luoxj.springbootscaffold;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author shifang
 * @Description
 * @date 2021/9/199:51 上午
 */
@Slf4j
public class LogTest {

    @Test
    public void testLog() {
        log.error("Hi, I am an error.");
    }
}
