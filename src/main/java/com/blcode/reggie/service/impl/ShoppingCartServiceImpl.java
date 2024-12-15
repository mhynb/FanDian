package com.blcode.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.blcode.reggie.common.BaseContext;
import com.blcode.reggie.entity.ShoppingCart;
import com.blcode.reggie.mapper.ShoppingCartMapper;
import com.blcode.reggie.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
    @Override
    public void clean() {
        //sql:delete from shopping_cart where userId =？
        LambdaQueryWrapper<ShoppingCart> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(ShoppingCart::getUserId, BaseContext.getCurrentId());
        //如果直接注入ShoppingCartService是有可能报循环依赖的
        this.remove(queryWrapper);
    }
}
