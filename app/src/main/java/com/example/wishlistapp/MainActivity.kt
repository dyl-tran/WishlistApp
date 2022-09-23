package com.example.wishlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

open class MainActivity : AppCompatActivity() {

    private lateinit var wishAdapter: WishAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wishAdapter = WishAdapter(mutableListOf())

        val wishesRv = findViewById<RecyclerView>(R.id.wishesRv)
        val itemName = findViewById<EditText>(R.id.editNameText)
        val itemPrice = findViewById<EditText>(R.id.editPriceText)
        val itemURL = findViewById<EditText>(R.id.editURLText)

        // Attach the adapter to the RecyclerView to populate items
        wishesRv.adapter = wishAdapter
        // Set layout manager to position the items
        wishesRv.layoutManager = LinearLayoutManager(this)

        val submitButton = findViewById<Button>(R.id.submitBtn)

        submitButton.setOnClickListener {

            val wishTitle = itemName.text.toString()
            val wishPriceTitle = itemPrice.text.toString()
            val wishURLTitle = itemURL.text.toString()

            if(wishTitle.isNotEmpty()) {
                val userWish = Wish(wishTitle, wishPriceTitle, wishURLTitle)
                wishAdapter.addWish(userWish)
                itemName.text.clear()
                itemPrice.text.clear()
                itemURL.text.clear()
            }


        }
    }
}