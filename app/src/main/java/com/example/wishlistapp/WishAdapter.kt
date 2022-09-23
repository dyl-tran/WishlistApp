package com.example.wishlistapp

import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class WishAdapter(private val wishes: MutableList<Wish>) : RecyclerView.Adapter<WishAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView: TextView
        val priceTextView: TextView
        val urlTextView: TextView

        init {
            nameTextView = itemView.findViewById(R.id.nameTv)
            priceTextView = itemView.findViewById(R.id.priceTv)
            urlTextView = itemView.findViewById(R.id.urlTv)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)

        val contactView = inflater.inflate(R.layout.wish_item, parent, false)

        return ViewHolder(contactView)
    }

    fun addWish(wish: Wish) {
        wishes.add(wish)
        notifyItemInserted(wishes.size - 1)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val wish = wishes.get(position)

        holder.nameTextView.text = wish.name
        holder.priceTextView.text = wish.price
        holder.urlTextView.text = wish.url


    }

    override fun getItemCount(): Int {
        return wishes.size
    }




}

