package com.example.ordermanagementsystem.dao
import com.example.ordermanagementsystem.product.Product
import com.example.ordermanagementsystem.product.Transport
import org.springframework.stereotype.Repository
import com.example.ordermanagementsystem.productrepository.TransportRepository

@Repository
class TransportDao(private val transportrep:TransportRepository){
    fun createNewOrder(order: Transport) =
            transportrep.save(order)
}
