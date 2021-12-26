package com.safaa.notesapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.safaa.notesapp.databinding.RowRecyclerviewBinding


class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>() {
    class RecyclerViewHolder(val binding: RowRecyclerviewBinding) : RecyclerView.ViewHolder(binding.root)

    var noteList: ArrayList<Note> = ArrayList()

    fun setNotesList(notesList: ArrayList<Note>) {
        this.noteList = notesList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(RowRecyclerviewBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        var currentNote = noteList[position]
        holder.binding.apply {
           titleTV.text = currentNote.text

        }
    }
    override fun getItemCount() = noteList.size
}
