package com.me.tutorial;

import com.me.tutorial.retry.SimpleRetry;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by wanatchapong on 2/21/2017 AD.
 */
public class RetryTest {

    private static final int MAX_RETRIES = 3;
    private static final int WAIT_SECONDS = 1;
    private static final String SUCCESS = "success";
    private SimpleRetry<String> retry;

    @Test
    public void shouldNotRetryWhenSuccessful() throws Exception {
        retry = new SimpleRetry<>(MAX_RETRIES);
        String result = retry.run(() -> SUCCESS);
        Assert.assertEquals(SUCCESS, result);
        Assert.assertEquals(0, retry.getRetryCounter());
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrowExceptionWhenMaxRetryIsExceeded() throws Exception {
        retry = new SimpleRetry<>(MAX_RETRIES);
        retry.run(() -> {
            throw new RuntimeException("Failed");
        });
    }

    @Test
    public void retry1TimesThenSuccess() throws Exception {
        retry = new SimpleRetry<>(MAX_RETRIES);
        retry.run(() -> {
            if (retry.getRetryCounter() == 0) {
                throw new RuntimeException("Retry failed");
            } else {
                return SUCCESS;
            }
        });
    }
}
