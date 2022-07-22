package kr.forbe.part6.chapter01.widget.adapter.listener.restaurant

import kr.forbe.part6.chapter01.model.restaurant.RestaurantModel
import kr.forbe.part6.chapter01.widget.adapter.listener.AdapterListener

interface RestaurantListListener: AdapterListener {

    fun onClickItem(model: RestaurantModel)

}
