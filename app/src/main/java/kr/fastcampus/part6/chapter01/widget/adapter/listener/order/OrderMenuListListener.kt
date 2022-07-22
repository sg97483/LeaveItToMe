package kr.forbe.part6.chapter01.widget.adapter.listener.order

import kr.forbe.part6.chapter01.model.restaurant.FoodModel
import kr.forbe.part6.chapter01.widget.adapter.listener.AdapterListener

interface OrderMenuListListener: AdapterListener {

    fun onRemoveItem(model: FoodModel)

}
