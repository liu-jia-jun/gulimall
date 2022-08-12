package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * ??Ʒ???????
 * 
 * @author liu
 * @email 3142467441@qq.com
 * @date 2022-06-28 21:26:03
 */
@Data
@TableName("pms_category")
public class CategoryEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * ????id
	 */
	@TableId
	private Long catId;
	/**
	 * ???????
	 */
	private String name;
	/**
	 * ??????id
	 */
	private Long parentCid;
	/**
	 * ?㼶
	 */
	private Integer catLevel;
	/**
	 * 逻辑删除字段
	 * 详细配置看 mybatis-plus官网
	 * 除了可以在全局配置逻辑删除规则
	 * 我们也可以通过给注解上的值 自定义逻辑删除的规则
	 * 这里说的逻辑删除的规则指的是 0 和 1 代表的是什么意思 删除还是显示
	 */

	@TableLogic(value = "1",delval = "0")
	private Integer showStatus;
	/**
	 * ???
	 */
	private Integer sort;
	/**
	 * ͼ????ַ
	 */
	private String icon;
	/**
	 * ??????λ
	 */
	private String productUnit;
	/**
	 * ??Ʒ????
	 */
	private Integer productCount;

	@TableField(exist = false)
	private List<CategoryEntity> children ;

}
