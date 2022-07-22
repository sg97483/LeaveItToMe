package kr.forbe.part6.chapter01.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import kr.forbe.part6.chapter01.data.db.dao.FoodMenuBasketDao
import kr.forbe.part6.chapter01.data.db.dao.LocationDao
import kr.forbe.part6.chapter01.data.db.dao.RestaurantDao
import kr.forbe.part6.chapter01.data.entity.locaion.LocationLatLngEntity
import kr.forbe.part6.chapter01.data.entity.restaurant.RestaurantEntity
import kr.forbe.part6.chapter01.data.entity.restaurant.RestaurantFoodEntity

@Database(
    entities = [LocationLatLngEntity::class, RestaurantFoodEntity::class, RestaurantEntity::class],
    version = 1,
    exportSchema = false
)

abstract class ApplicationDatabase: RoomDatabase() {

    companion object {
        const val DB_NAME = "ApplicationDataBase.db"
    }

    abstract fun LocationDao(): LocationDao

    abstract fun FoodMenuBasketDao(): FoodMenuBasketDao

    abstract fun RestaurantDao(): RestaurantDao

}
