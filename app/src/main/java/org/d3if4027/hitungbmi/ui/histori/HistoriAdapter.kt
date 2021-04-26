package org.d3if4027.hitungbmi.ui.histori

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import org.d3if4027.hitungbmi.databinding.ItemHistoriBinding
import org.d3if4027.hitungbmi.db.BmiEntity

class HistoriAdapter : RecyclerView.Adapter<HistoriAdapter.ViewHolder>() {

    private val data = mutableListOf<BmiEntity>()

    fun updateData(newData: List<BmiEntity>) {
        data.clear()
        data.addAll(newData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoriAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemHistoriBinding.inflate(inflater, parent, false)
        return RecyclerView.ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HistoriAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}