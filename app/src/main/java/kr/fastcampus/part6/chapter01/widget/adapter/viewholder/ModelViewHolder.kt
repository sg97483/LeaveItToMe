package kr.forbe.part6.chapter01.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import kr.forbe.part6.chapter01.model.Model
import kr.forbe.part6.chapter01.screen.base.BaseViewModel
import kr.forbe.part6.chapter01.util.provider.ResourcesProvider
import kr.forbe.part6.chapter01.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M: Model>(
    binding: ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourcesProvider: ResourcesProvider
) : RecyclerView.ViewHolder(binding.root) {

    abstract fun reset()

    open fun bindData(model: M) {
        reset()
    }

    abstract fun bindViews(model: M, adapterListener: AdapterListener)

}
