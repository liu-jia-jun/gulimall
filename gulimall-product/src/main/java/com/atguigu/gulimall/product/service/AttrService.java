package com.atguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.produce.entity.AttrEntity;

import java.util.Map;

/**
 * ??Ʒ?
 *
 * @author liu
 * @email 3142467441@qq.com
 * @date 2022-06-28 20:59:34
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

