package com.example.baithi.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.baithi.databinding.ItemSdtBinding

class SdtViewHolder private constructor(
    private val binding: ItemSdtBinding
) : RecyclerView.ViewHolder(binding.root){
    companion object {
        fun from(parent: ViewGroup): SdtViewHolder {
            val binding = ItemSdtBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return SdtViewHolder(binding)
        }
    }

    fun bind(sdt: Sdt) {
        binding.name.text = sdt.name
        binding.phone.text = sdt.sdt
    }
}