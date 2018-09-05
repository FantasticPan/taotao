//package com.taotao.controller;
//
//import com.taotao.common.util.FtpUtil;
//import org.apache.commons.net.ftp.FTP;
//import org.apache.commons.net.ftp.FTPClient;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//
///**
// * Created by FantasticPan on 2018/7/11.
// */
//public class FTPTest {
//
//    @Test
//    public void testFtpClient() throws IOException {
//        //创建一个FTPClient
//        FTPClient ftpClient = new FTPClient();
//        //创建Ftp连接，默认是21
//        ftpClient.connect("192.168.231.110");
//        ftpClient.enterLocalPassiveMode(); //使用被动模式
//        //登录Ftp服务器
//        ftpClient.login("ftpuser", "root");
//        //上传文件
//        //设置上传路径
//        ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
//        //读取本地文件
//        FileInputStream inputStream
//                = new FileInputStream(new File("D:\\1.jpg"));
//        //修改上传文件的格式
//        ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
//        //第一个参数：服务端文档名
//        //第二个参数：上传文件的inputStream
//        ftpClient.storeFile("hello1.jpg", inputStream);
//        //关闭连接
//        ftpClient.logout();
//    }
//
//    @Test
//    public void testFtpUtil() throws IOException {
//        FileInputStream inputStream
//                = new FileInputStream(new File("D:\\1.jpg"));
//        boolean result = FtpUtil.uploadFile("192.168.231.110", 21,
//                "ftpuser", "root",
//                "/home/ftpuser/www/images", "2018/07/14",
//                "hello.jpg", inputStream);
//        System.out.println(result);
//    }
//}
