package com.example.JDBC.controllers;


import com.example.JDBC.models.store;

import com.example.JDBC.servises.storeServis;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    //private final StoreDao storeDao;
    private final storeServis storeServis;


    @GetMapping("/")
    public String main(){

        return "main";
    }

    @GetMapping("/store")
    public String store(Model model)
    {
        model.addAttribute("stores",  storeServis.selectStore());
        return "store";
    }



    @PostMapping("/add")
    public String add(store store){
        storeServis.addStore(store);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String delete(Integer id){
        storeServis.deleteStore(id);
        return "redirect:/";
    }

    @PostMapping("/update")
    public String update(store store){
        storeServis.updateStore(store);
        return "redirect:/";
    }

}