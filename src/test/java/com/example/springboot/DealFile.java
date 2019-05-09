package com.example.springboot;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.HashMap;
import java.util.List;

public class DealFile {
    public static void main(String[] args) {
        dealFileTo();
    }
    public static void dealFileTo(){
        try {
            List<String> stringList = FileUtils.readLines(new File("D:/source/汇智明德/20190508/医学英语语料库文件名分组规则.txt"), "utf-8");
            HashMap<String,String> hashMap = new HashMap<>();
            for (String string : stringList) {
                if ("".equals(string)) {
                    continue;
                }
                String[] split = string.split("\t");
                String key = split[0];
                String value = split[1];
                hashMap.put(key,value);
            }
            List<String> fileNames = FileUtils.readLines(new File("D:/source/汇智明德/20190508/fileNames.txt"), "utf-8");
            StringBuilder stringBuilder = new StringBuilder();
            for (String fileName :fileNames) {
                String substring = fileName.substring(0, 3);
                String val = hashMap.get(substring);
                stringBuilder.append(fileName+"\t"+val+"\r\n");
            }
            System.out.println(stringBuilder.toString());
        }catch (Exception e) {

        }
    }
}
