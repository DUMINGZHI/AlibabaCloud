package com.mingzhi.controller;

import com.mingzhi.domain.Video;
import com.mingzhi.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @RequestMapping("getVideoById")
    public Object getVideoById(int id, HttpServletRequest httpServletRequest){
        Video video = videoService.getVideoById(id);
        video.setPort(String.valueOf(httpServletRequest.getServerPort()));
        return video;
    }
}
