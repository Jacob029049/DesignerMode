package com.november.test.demo.combination;

public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract void killVirus();
    public abstract AbstractFile getChild(int i);
}
