package com.giftofhappiness.android.recyclerviewwithcallback

import android.icu.text.MessagePattern
import android.provider.Telephony
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.giftofhappiness.android.recyclerviewwithcallback.databinding.ActivityMainBinding
import com.giftofhappiness.android.recyclerviewwithcallback.databinding.PartListItemBinding
import java.text.FieldPosition


abstract class PartAdapter(val partItemList:List<PartData>, val clickListener: (PartData)->Unit):RecyclerView.Adapter<PartAdapter.PartViewHolder>() {


    class PartViewHolder(val binding: PartListItemBinding ):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartViewHolder {


        return PartViewHolder(PartListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }



    override fun onBindViewHolder(holder: PartViewHolder, position: Int) {

        val currentItem = partItemList[position]
        holder.binding.itemNameTxtView.text = currentItem.itemName.toString()
        holder.binding.idTxtView.text = currentItem.id.toString()

    }

    override fun getItemCount(): Int {

        return partItemList.size
    }


}