package com.google.firebase.example.fireeats.model

import com.google.firebase.firestore.IgnoreExtraProperties

/**
 * Restaurant POJO.
 */
@IgnoreExtraProperties
data class Restaurant(
    var name: String? = null,
    var city: String? = null,
    var category: String? = null,
    var photo: String? = null,
    var price: Int = 0,
    var numRatings: Int = 0,
    var avgRating: Double = 0.toDouble(),
    var couponCode: String? = null,
    var eventDate: String? = null,
    var couponValue: String? = null
) {

    companion object {

        const val FIELD_CITY = "city"
        const val FIELD_CATEGORY = "category"
        const val FIELD_PRICE = "price"
        const val FIELD_POPULARITY = "numRatings"
        const val FIELD_AVG_RATING = "avgRating"
        const val FIELD_COUPON_CODE = "couponCode"
        const val FIELD_EVENT_DATE = "eventDate"
        const val FIELD_COUPON_VALUE = "couponValue"
    }
}
