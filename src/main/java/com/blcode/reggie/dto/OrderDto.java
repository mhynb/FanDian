package com.blcode.reggie.dto;

import com.blcode.reggie.entity.OrderDetail;
import com.blcode.reggie.entity.Orders;
import lombok.Data;

import java.util.List;

/**
 * @author frx
 * @version 1.0
 * @date 2022/7/15  20:06
 */
@Data
public class OrderDto extends Orders {

    private List<OrderDetail> orderDetails;
}