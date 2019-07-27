package com.example.demo.service;

import com.example.demo.model.FileInfo;

import java.util.List;

public interface UserService {
   void addFile(FileInfo fileinfo);
    List<FileInfo> queryFileInfo(String id);
}
