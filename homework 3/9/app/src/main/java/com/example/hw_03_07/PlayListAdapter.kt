package com.example.hw_03_07

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_03_07.databinding.ItemPlaylistBinding
import kotlin.reflect.KFunction1

class PlayListAdapter(
    val playlist: ArrayList<PlayLIstModel>,
    private var onClick: KFunction1<Int, Unit>
) : RecyclerView.Adapter<PlayListAdapter.ViewHolder>() {

    inner class ViewHolder(private var binding: ItemPlaylistBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(playLIstModel: PlayLIstModel) {
            binding.tvName.text = playLIstModel.name
            binding.tvSong.text = playLIstModel.song
            binding.tvPosition.text = playLIstModel.position
            binding.tvTime.text = playLIstModel.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemPlaylistBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int = playlist.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(playlist[position])
        holder.itemView.setOnClickListener {
            val name = playlist[position].name
            val intent = Intent(holder.itemView.context, SecondActivity::class.java)
            intent.putExtra("key", name)
            holder.itemView.context.startActivity(intent)
        }
    }
}