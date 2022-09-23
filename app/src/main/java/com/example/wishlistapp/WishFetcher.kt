package com.example.wishlistapp

import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class WishFetcher : MainActivity() {
    companion object {

        val name = ""
        val price = ""
        val url = ""
        fun getWishes(): MutableList<Wish> {
            var wishes : MutableList<Wish> = ArrayList()
            for (i in 0..9) {
                val wish = Wish(name, price, url)
                wishes.add(wish)
            }
            return wishes
        }

        fun getNext5Wishes(): MutableList<Wish> {
            var newWishes : MutableList<Wish> = ArrayList()
            for (i in 10..14) {
                val wish = Wish(name, price, url)
                newWishes.add(wish)
            }
            return newWishes
        }
    }

}