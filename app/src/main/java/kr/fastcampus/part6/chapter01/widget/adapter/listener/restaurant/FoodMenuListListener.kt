package kr.forbe.part6.chapter01.widget.adapter.listener.restaurant

import kr.forbe.part6.chapter01.model.restaurant.FoodModel
import kr.forbe.part6.chapter01.widget.adapter.listener.AdapterListener

interface FoodMenuListListener: AdapterListener {

    fun onClickItem(model: FoodModel)

}
