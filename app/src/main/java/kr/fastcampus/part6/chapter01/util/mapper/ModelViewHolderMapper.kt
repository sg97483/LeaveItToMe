package kr.forbe.part6.chapter01.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import kr.forbe.part6.chapter01.databinding.*
import kr.forbe.part6.chapter01.model.CellType
import kr.forbe.part6.chapter01.model.Model
import kr.forbe.part6.chapter01.screen.base.BaseViewModel
import kr.forbe.part6.chapter01.util.provider.ResourcesProvider
import kr.forbe.part6.chapter01.widget.adapter.viewholder.ModelViewHolder
import kr.forbe.part6.chapter01.widget.adapter.viewholder.food.FoodMenuViewHolder
import kr.forbe.part6.chapter01.widget.adapter.viewholder.order.OrderMenuViewHolder
import kr.forbe.part6.chapter01.widget.adapter.viewholder.order.OrderViewHolder
import kr.fastcampus.part6.chapter01.widget.adapter.viewholder.restaurant.LikeRestaurantViewHolder
import kr.fastcampus.part6.chapter01.widget.adapter.viewholder.restaurant.RestaurantViewHolder
import kr.fastcampus.part6.chapter01.widget.adapter.viewholder.review.RestaurantReviewViewHolder

object ModelViewHolderMapper {

    @Suppress("UNCHECKED_CAST")
    fun <M: Model> map(
        parent: ViewGroup,
        type: CellType,
        viewModel: BaseViewModel,
        resourcesProvider: ResourcesProvider
    ): ModelViewHolder<M> {
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when (type) {
            CellType.RESTAURANT_CELL ->
                RestaurantViewHolder(
                    ViewholderRestaurantBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )
            CellType.LIKE_RESTAURANT_CELL ->
                LikeRestaurantViewHolder(
                    ViewholderLikeRestaurantBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )
            CellType.FOOD_CELL ->
                FoodMenuViewHolder(
                    ViewholderFoodMenuBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )
            CellType.ORDER_FOOD_CELL ->
                OrderMenuViewHolder(
                    ViewholderOrderMenuBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )
            CellType.REVIEW_CELL -> {
                RestaurantReviewViewHolder(
                    ViewholderRestaurantReviewBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )
            }
            CellType.ORDER_CELL -> {
                OrderViewHolder(
                    ViewholderOrderBinding.inflate(inflater, parent, false),
                    viewModel,
                    resourcesProvider
                )
            }
        }

        return viewHolder as ModelViewHolder<M>
    }

}
