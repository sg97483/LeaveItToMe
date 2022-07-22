package kr.forbe.part6.chapter01.data.repository.order

import kr.forbe.part6.chapter01.data.entity.restaurant.RestaurantFoodEntity

interface OrderRepository {

    suspend fun orderMenu(
        userId: String,
        restaurantId: Long,
        foodMenuList: List<RestaurantFoodEntity>,
        restaurantTitle: String
    ): DefaultOrderRepository.Result

    suspend fun getAllOrderMenus(
        userId: String
    ): DefaultOrderRepository.Result

}
