package com.november.test.demo.combination;

public class Client {
    public static void main(String args[]){
        AbstractFile image1 = new ImageFile("图片文件1");
        AbstractFile image2 = new ImageFile("图片文件2");
        AbstractFile image3 = new ImageFile("图片文件3");
        AbstractFile text1 = new TextFile("文本文件1");
        AbstractFile text2 = new TextFile("文本文件2");
        AbstractFile text3 = new TextFile("文本文件3");
        AbstractFile video1 = new VideoFile("视频文件1");
        AbstractFile video2 = new VideoFile("视频文件2");
        AbstractFile video3 = new VideoFile("视频文件3");
        AbstractFile floder1 = new FloderFile("文件夹文件1");
        AbstractFile floder2 = new FloderFile("文件夹文件2");
        AbstractFile floder3 = new FloderFile("文件夹文件3");

        floder1.add(floder2);
        floder2.add(floder3);
        floder1.add(image1);
        floder1.add(text2);
        floder2.add(image2);
        floder2.add(text3);
        floder2.add(video1);
        floder3.add(image3);
        floder3.add(text1);
        floder3.add(video2);
        floder3.add(video3);

        floder1.killVirus();

    }
}
