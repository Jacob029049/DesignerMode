package com.november.test.demo.combination;

public class VideoFile extends AbstractFile {

    private String name;

    public VideoFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void remove(AbstractFile file) {
        throw  new UnsupportedOperationException();
    }

    @Override
    public void killVirus() {
        System.out.println("----对视频文件'" + name + "'进行杀毒");
    }

    @Override
    public AbstractFile getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
