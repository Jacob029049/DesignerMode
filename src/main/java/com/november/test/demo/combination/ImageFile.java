package com.november.test.demo.combination;

public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
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
        System.out.println("----对图像文件'" + name + "'进行杀毒");
    }

    @Override
    public AbstractFile getChild(int i) {
        throw new UnsupportedOperationException();
    }
}
