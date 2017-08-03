package com.yinanmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by yinan on 6/21/17.
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
