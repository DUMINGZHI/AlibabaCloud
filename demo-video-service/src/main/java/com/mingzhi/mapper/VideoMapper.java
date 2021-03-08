package com.mingzhi.mapper;

import com.mingzhi.domain.Video;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoMapper {
    Video getVideoById(int id);
}
