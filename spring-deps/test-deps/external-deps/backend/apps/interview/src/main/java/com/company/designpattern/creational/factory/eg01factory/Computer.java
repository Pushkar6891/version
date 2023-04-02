package com.company.designpattern.creational.factory.eg01factory;

public interface Computer {

    public abstract String ram();
    public abstract String hdd();

    public boolean isGraphicsEnabled();
    public boolean isBluetoothEnabled();
}