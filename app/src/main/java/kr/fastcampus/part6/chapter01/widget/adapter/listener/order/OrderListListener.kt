package kr.forbe.part6.chapter01.widget.adapter.listener.order

import kr.forbe.part6.chapter01.widget.adapter.listener.AdapterListener

interface OrderListListener: AdapterListener {

    fun writeRestaurantReview(orderId: String, restaurantTitle: String)

}
