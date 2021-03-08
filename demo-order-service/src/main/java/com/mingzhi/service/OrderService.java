package com.mingzhi.service;

import com.mingzhi.domain.Video;
import com.mingzhi.service.fallback.OrderServiceFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo-video-service")
@Service
public interface OrderService {

    @GetMapping("/api/v1/video/getVideoById")
    Video getPort(@RequestParam("id") int id);

}
