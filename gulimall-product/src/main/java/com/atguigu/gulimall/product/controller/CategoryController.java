package com.atguigu.gulimall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.R;



/**
 * ??Ʒ???????
 *
 * @author liu
 * @email 3142467441@qq.com
 * @date 2022-06-28 21:26:03
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/list/tree")
    public R list(){
        List<CategoryEntity> entities = categoryService.listWithTree();
        return R.ok().put("data",entities);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@Requirespermissions("product:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("data", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@Requirespermissions("product:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }


    @RequestMapping("/update/sort")
    public R updateSort(@RequestBody CategoryEntity[] categoryEntities){
        categoryService.updateBatchById(Arrays.asList(categoryEntities));
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@Requirespermissions("product:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     *
     * @RequestBody: 表示获取请求体上的参数 , 请求体只有在post请求时才会有
     *               所以通过@RequestBody来获取参数 则 必须发送POST 请求
     *
     * SpringMVC自动将请求体的JSON数据 转换成对应的对象
     *
     */
    @RequestMapping("/delete")

    public R delete(@RequestBody Long[] catIds){
//		categoryService.removeByIds(Arrays.asList(catIds));
        // 1. 检查当前删除的菜单 是否被其他菜单引用
        // TODO
        categoryService.removeMenuByIds(Arrays.asList(catIds));

        return R.ok();
    }

}
