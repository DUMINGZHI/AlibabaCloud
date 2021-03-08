package com.mingzhi.service.fallback;

import com.mingzhi.domain.Video;
import com.mingzhi.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceFallBack implements OrderService {
    @Override
    public Video getPort(int id) {
        Video video = new Video();
        video.setTitle("OrderServiceFallBack");
        return video;
    }
}
