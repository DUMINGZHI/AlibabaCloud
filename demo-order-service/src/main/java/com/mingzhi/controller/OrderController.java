package com.mingzhi.controller;

import com.mingzhi.domain.Video;
import com.mingzhi.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    @Autowired
    private OrderService orderService;

    @RequestMapping("getVideoById")
    public Object getVideoById(int id){
        Video video = restTemplate.getForObject("http://demo-video-service/api/v1/video/getVideoById?id="+id, Video.class);
        return video;
    }

    @RequestMapping("test")
    public Object test(HttpServletRequest httpServletRequest){
        return httpServletRequest.getServerPort();
    }

    @RequestMapping("getPortById")
    public String getPortById(int id){
        Video video = orderService.getPort(id);
        return video.getPort();
    }
}
