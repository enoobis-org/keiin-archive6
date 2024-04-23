package com.example.hw_03_07

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_03_07.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = PlayListAdapter(arrayListOf(
            PlayLIstModel("Shape of you", "Ed Sheeran", "1", "3:56"),
            PlayLIstModel("Bohemian Rhapsody", "Queen", "2", "5:55"),
            PlayLIstModel("Billie Jean", "Michael Jackson", "3", "4:54"),
            PlayLIstModel("Hotel California", "Eagles", "4", "6:30"),
            PlayLIstModel("Smells Like Teen Spirit", "Nirvana", "5", "5:01"),
            PlayLIstModel("Stairway to Heaven", "Led Zeppelin", "6", "8:02"),
            PlayLIstModel("Imagine", "John Lennon", "7", "3:04"),
            PlayLIstModel("Hey Jude", "The Beatles", "8", "7:11"),
            PlayLIstModel("Like a Rolling Stone", "Bob Dylan", "9", "6:13"),
            PlayLIstModel("Thriller", "Michael Jackson", "10", "5:57"),
            PlayLIstModel("Yesterday", "The Beatles", "11", "2:05"),
            PlayLIstModel("Black Dog", "Led Zeppelin", "12", "4:54"),
            PlayLIstModel("Hotel California", "Eagles", "13", "6:30"),
            PlayLIstModel("Thinking Out Loud", "Ed Sheeran", "14", "4:41"),
            PlayLIstModel("Piano Man", "Billy Joel", "15", "5:38")
        ),this::onClick)
        binding.rvPlayList.adapter = adapter


    }

    private fun onClick(position: Int){
        val intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key",position)
        startActivity(intent)
    }

}