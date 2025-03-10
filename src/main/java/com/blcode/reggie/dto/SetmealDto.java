package com.blcode.reggie.dto;

import com.blcode.reggie.entity.Setmeal;
import com.blcode.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
