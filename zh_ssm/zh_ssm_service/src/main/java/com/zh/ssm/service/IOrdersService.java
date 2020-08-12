package com.zh.ssm.service;

import com.zh.ssm.domain.Orders;

import java.util.List;

public interface IOrdersService {

    List<Orders> findAll(int page,int size) throws Exception;

    Orders findById(String ordersId) throws Exception;
}