package com.example.shoppinglist.domain

import androidx.lifecycle.LiveData

interface ShopListRepository {

    fun editShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun addShopItem(shopItem: ShopItem)

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList(): LiveData<List<ShopItem>>

}