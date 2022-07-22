package kr.forbe.part6.chapter01.widget.adapter.viewholder.food

import kr.forbe.part6.chapter01.databinding.ViewholderFoodMenuBinding
import kr.forbe.part6.chapter01.model.restaurant.FoodModel
import kr.forbe.part6.chapter01.screen.base.BaseViewModel
import kr.forbe.part6.chapter01.util.provider.ResourcesProvider
import kr.forbe.part6.chapter01.widget.adapter.listener.AdapterListener
import kr.forbe.part6.chapter01.widget.adapter.listener.restaurant.FoodMenuListListener
import kr.forbe.part6.chapter01.widget.adapter.viewholder.ModelViewHolder

class FoodMenuViewHolder(
    private val binding: ViewholderFoodMenuBinding,
    viewModel: BaseViewModel,
    resourcesProvider: ResourcesProvider
): ModelViewHolder<FoodModel>(binding, viewModel, resourcesProvider) {

    override fun reset() = with(binding) {
        foodImage.clear()
    }

    override fun bindData(model: FoodModel) {
        super.bindData(model)
        with(binding) {
            foodImage.load(model.imageUrl, 24f, CenterCrop())
            foodTitleText.text = model.title
            foodDescriptionText.text = model.description
            priceText.text = resourcesProvider.getString(R.string.price, model.price)
        }
    }

    override fun bindViews(model: FoodModel, adapterListener: AdapterListener) {
        if (adapterListener is FoodMenuListListener) {
            binding.root.setOnClickListener {
                adapterListener.onClickItem(model)
            }
        }
    }

}
