package com.november.test.demo.combination;

import java.util.ArrayList;
import java.util.List;

public class FloderFile extends AbstractFile{
    private List<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public FloderFile(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        file.remove(file);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");  //模拟杀毒

        //递归调用成员构件的killVirus()方法
        for(Object obj : fileList) {
            ((AbstractFile)obj).killVirus();
        }
    }

    @Override
    public AbstractFile getChild(int i) {
        return (AbstractFile)fileList.get(i);
    }
}
