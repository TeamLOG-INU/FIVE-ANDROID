package org.sopt.sopkathon5.andorid.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import org.sopt.sopkathon5.andorid.R
import org.sopt.sopkathon5.andorid.data.model.DailyData
import org.sopt.sopkathon5.andorid.databinding.ItemDailyListBinding

class DailyAdapter(
    private val isBookmarkNotVisible: Boolean? = null,
    private val itemClick: (() -> (Unit))? = null,
    private val logoutClickListener: (() -> Unit)? = null
) : RecyclerView.Adapter<DailyAdapter.DailyViewHolder>() {
    val itemList = mutableListOf<DailyData>()

    class DailyViewHolder(
        private val binding: ItemDailyListBinding,
        private val itemClick: (() -> Unit)?
    ) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(data: DailyData, logoutClickListener: (() -> Unit)?, isBookmarkNotVisible: Boolean?) {
            binding.data = data
            binding.tvLogout.setOnClickListener {
                logoutClickListener?.invoke()
            }
            val todoAdapter = TodoAdapter().apply {
                todoList.clear()
                todoList.addAll(data.mission)
                notifyDataSetChanged()
            }
            binding.rvTodo.adapter = todoAdapter

            isBookmarkNotVisible?.let {
                binding.isBookmarkNotVisible = it
            }

            binding.btnPoint.setOnClickListener {  //호출시 itemclick 람다함수실행함
                itemClick?.invoke()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DailyViewHolder {
        val binding = DataBindingUtil.inflate<ItemDailyListBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_daily_list,
            parent,
            false
        )
        return DailyViewHolder(binding, itemClick)
    }

    override fun onBindViewHolder(holder: DailyViewHolder, position: Int) {
        holder.onBind(itemList[position], logoutClickListener, isBookmarkNotVisible)
    }

    override fun getItemCount(): Int = itemList.size
}