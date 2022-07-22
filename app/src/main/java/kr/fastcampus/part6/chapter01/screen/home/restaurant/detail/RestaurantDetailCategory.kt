package kr.forbe.part6.chapter01.screen.home.restaurant.detail

import androidx.annotation.StringRes
import kr.forbe.part6.chapter01.R

enum class RestaurantDetailCategory(
    @StringRes val categoryNameId: Int
) {

    MENU(R.string.menu), REVIEW(R.string.review)

}
