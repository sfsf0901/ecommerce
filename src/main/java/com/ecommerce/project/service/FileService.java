package com.ecommerce.project.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    // 접근 제어자를 생략하면 자동으로 public abstract
    String uploadImage(String path, MultipartFile file) throws IOException;
}
