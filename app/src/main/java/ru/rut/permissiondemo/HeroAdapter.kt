package ru.rut.permissiondemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ru.rut.permissiondemo.model.Hero

class HeroAdapter(private val baseContext: Context, private val heroList: MutableList<Hero>): RecyclerView.Adapter<HeroAdapter.HeroHolder>() {
    class HeroHolder(itemView: View): RecyclerView.ViewHolder(itemView)  {
        val name: TextView = itemView.findViewById(R.id.name)
        val culture: TextView = itemView.findViewById(R.id.culture)
        val born: TextView = itemView.findViewById(R.id.born)
        val titles: TextView = itemView.findViewById(R.id.titles)
        val aliases: TextView = itemView.findViewById(R.id.aliases)
        val playedBy: TextView = itemView.findViewById(R.id.playedBy)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return HeroHolder(itemView)
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.name.text = heroList.get(position).name
        holder.culture.text = heroList.get(position).culture
        holder.born.text = heroList.get(position).born
        holder.titles.text = heroList.get(position).titles.joinToString()
        holder.aliases.text = heroList.get(position).aliases.joinToString()
        holder.playedBy.text = heroList.get(position).playedBy.joinToString()
    }

    override fun getItemCount() = heroList.size
}