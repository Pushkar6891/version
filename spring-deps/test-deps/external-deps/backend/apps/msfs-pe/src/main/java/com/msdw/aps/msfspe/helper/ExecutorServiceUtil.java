package com.msdw.aps.msfspe.helper;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
public class ExecutorServiceUtil {
    public static int timeout = 30;

    public static void shutdownThreads(ExecutorService executorService) {
        log.info("Shutting down the executor service.");
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(timeout, TimeUnit.MILLISECONDS)) {
                log.info("Executor service time out, shutting it down now.");
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            log.info("Thread is interrupted, and hence shutting it down now. ", e);
            executorService.shutdownNow();
            Thread.currentThread().interrupt();
            ;
        }
    }
}
