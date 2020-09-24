package com.example.ordermanagementsystem.service
import com.example.ordermanagementsystem.dao.TransportDao
import com.example.ordermanagementsystem.product.Product
import com.example.ordermanagementsystem.product.Transport
import org.springframework.stereotype.Service

@Service
class TransportService(private val transdao:TransportDao)
{
    fun createNewOrder(order: Transport) {
        transdao.createNewOrder(order)
    }
}