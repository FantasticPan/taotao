package com.taotao.controller;

import com.taotao.common.util.JsonUtil;
import com.taotao.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 上传图片处理
 * Created by FantasticPan on 2018/7/15.
 */
@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/upload")
    @ResponseBody
    public String pictureUpload(MultipartFile uploadFile) { //uploadFile为控件指定名称，若不用uploadFile则要使用@RequestParm
        Map result = pictureService.uploadPicture(uploadFile);
        //为了保证功能的兼容性，需要把result转换成json格式的字符串
        return JsonUtil.objectToJson(result);
    }
}
