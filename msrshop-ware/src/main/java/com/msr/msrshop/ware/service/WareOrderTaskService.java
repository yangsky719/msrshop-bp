package com.msr.msrshop.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.common.utils.PageUtils;
import com.msr.msrshop.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author yang
 * @email yang@gmail.com
 * @date 2020-09-10 14:48:56
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

