package com.mingzhi.service.imp;

import com.mingzhi.domain.Video;
import com.mingzhi.mapper.VideoMapper;
import com.mingzhi.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImp implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    public Video getVideoById(int id) {
        return videoMapper.getVideoById(id);
    }
}
