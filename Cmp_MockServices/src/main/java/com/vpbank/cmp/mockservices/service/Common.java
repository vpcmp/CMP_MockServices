package com.vpbank.cmp.mockservices.service;

import java.util.UUID;

public class Common {
    public static void Delay() throws InterruptedException {
        Thread.sleep((long)(Math.random() * 2000));
        return ;
    }
    public static UUID randomUUID() {
        return randomUUID();
    }
}
