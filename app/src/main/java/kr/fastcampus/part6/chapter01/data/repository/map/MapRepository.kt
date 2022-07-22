package kr.forbe.part6.chapter01.data.repository.map

import kr.forbe.part6.chapter01.data.entity.locaion.LocationLatLngEntity
import kr.forbe.part6.chapter01.data.response.address.AddressInfo

interface MapRepository {

    suspend fun getReverseGeoInformation(
        locationLatLngEntity: LocationLatLngEntity
    ): AddressInfo?

}
