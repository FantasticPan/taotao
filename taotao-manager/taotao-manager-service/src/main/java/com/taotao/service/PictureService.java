package com.taotao.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by FantasticPan on 2018/7/15.
 */
public interface PictureService {

    Map uploadPicture(MultipartFile uploadFile);
}
