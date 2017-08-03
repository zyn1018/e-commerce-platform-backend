package com.yinanmall.service;

import com.yinanmall.common.ServerResponse;
import com.yinanmall.pojo.Category;

import java.util.List;

/**
 * Created by yinan on 6/19/17.
 */
public interface ICategoryService {
    ServerResponse addCategory(String categoryName, Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId, String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}
