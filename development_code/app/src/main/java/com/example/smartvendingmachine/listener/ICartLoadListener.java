package com.example.smartvendingmachine.listener;

import com.example.smartvendingmachine.model.CartModel;
import com.example.smartvendingmachine.model.DrinkModel;

import java.util.List;

public interface ICartLoadListener {
    void onCartLoadSuccess(List<CartModel> cartModelList);
    void onCartLoadFailed(String message);
}
