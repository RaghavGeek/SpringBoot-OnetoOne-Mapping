package com.example.ordermanagementsystem.controller
import com.example.ordermanagementsystem.product.Product
import com.example.ordermanagementsystem.product.Transport
import com.example.ordermanagementsystem.service.TransportService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class TransportController(private val transservice:TransportService) {
    @PostMapping("/placeorder")
    fun createNewOrder(@Valid @RequestBody order: Transport): ResponseEntity<String> {
        transservice.createNewOrder(order)
        return ResponseEntity.ok().body("Order Placed")
    }
}