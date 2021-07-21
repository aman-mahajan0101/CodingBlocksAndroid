package com.example.networking

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*

class GithubUserAdapter(private val githubUsers: ArrayList<GithubUser>) : RecyclerView.Adapter<GithubUserAdapter.GithubViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
       GithubViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.item_row,parent,false))

    override fun getItemCount() = githubUsers.size

    override fun onBindViewHolder(holder: GithubViewHolder, position: Int) {
        holder?.bind(githubUsers[position])
    }

    class GithubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(githubUser: GithubUser){
            itemView?.tViewLogin?.text=githubUser.login
            itemView?.tViewUrl?.text=githubUser.html_url
            itemView?.tViewScore?.text=githubUser.score.toString()

        }
    }

}