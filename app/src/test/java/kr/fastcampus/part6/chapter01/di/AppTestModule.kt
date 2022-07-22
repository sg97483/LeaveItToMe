package kr.forbe.part6.chapter01.di

import kr.forbe.part6.chapter01.data.TestOrderRepository
import kr.forbe.part6.chapter01.data.TestRestaurantFoodRepository
import kr.forbe.part6.chapter01.data.TestRestaurantRepository
import kr.forbe.part6.chapter01.data.entity.locaion.LocationLatLngEntity
import kr.forbe.part6.chapter01.data.repository.order.OrderRepository
import kr.forbe.part6.chapter01.data.repository.restaurant.RestaurantRepository
import kr.forbe.part6.chapter01.data.repository.restaurant.food.RestaurantFoodRepository
import kr.forbe.part6.chapter01.screen.home.restaurant.RestaurantCategory
import kr.forbe.part6.chapter01.screen.home.restaurant.RestaurantListViewModel
import kr.forbe.part6.chapter01.screen.order.OrderMenuListViewModel
import com.google.firebase.auth.FirebaseAuth
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

internal val appTestModule = module {

    viewModel { (restaurantCategory: RestaurantCategory, locationLatLngEntity: LocationLatLngEntity) ->
        RestaurantListViewModel(restaurantCategory, locationLatLngEntity, get())
    }

    viewModel { (firebaseAuth: FirebaseAuth) -> OrderMenuListViewModel(get(), get(), firebaseAuth) }

    single<RestaurantRepository> { TestRestaurantRepository() }

    single<RestaurantFoodRepository> { TestRestaurantFoodRepository() }

    single<OrderRepository> { TestOrderRepository() }

}
