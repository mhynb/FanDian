package com.blcode.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.blcode.reggie.entity.ShoppingCart;

public interface ShoppingCartService extends IService<ShoppingCart> {
    void clean();
}
