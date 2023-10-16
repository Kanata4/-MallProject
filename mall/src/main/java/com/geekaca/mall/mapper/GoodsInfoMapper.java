package com.geekaca.mall.mapper;

import com.geekaca.mall.domain.GoodsInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author magol
 * @description 针对表【tb_newbee_mall_goods_info】的数据库操作Mapper
 * @createDate 2023-10-13 10:26:25
 * @Entity com.geekaca.mall.domain.GoodsInfo
 */
@Mapper
public interface GoodsInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(GoodsInfo record);

    int addGoods(GoodsInfo record);

    GoodsInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(GoodsInfo record);

    int updateByPrimaryKey(GoodsInfo record);

    List<GoodsInfo> findGoodsList(@Param("limit") Integer limit, @Param("pageSize") Integer pageSize, @Param("goodsName") String goodsName);

    int findGoodsCount(@Param("goodsName") String goodsName);

    List<GoodsInfo> selectgoodsall();

    //商品模糊搜索
    List<GoodsInfo> selectPageByName(@Param("limit") Integer limit, @Param("pageSize") Integer pageSize,@Param("goodsName") String goodsName);
}
