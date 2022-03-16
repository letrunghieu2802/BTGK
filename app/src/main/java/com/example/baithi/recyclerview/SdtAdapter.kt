package com.example.baithi.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SdtAdapter(
        private val listSdt: List<Sdt>
): RecyclerView.Adapter<SdtViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SdtViewHolder.from(parent)

        override fun onBindViewHolder(holder: SdtViewHolder, position: Int) {
                holder.bind(listSdt[position])
}
        override fun getItemCount() = listSdt.size
}