package com.company.caching.lrucache;

public class CacheEntry {
    int key;
    String value;

    public CacheEntry(int key, String value) {
        this.key = key;
        this.value = value;
    }
}