package com.hxy.OnlineDiningRoom.service;

import com.hxy.OnlineDiningRoom.pojo.Review;

import java.util.List;

public interface ReviewService extends CrudService<Review>{

    /**
     * 获得一个商品的所有评论
     * @param id 商品id
     * @return
     */
    List<Review> getReviewListByPid(int id);

}
