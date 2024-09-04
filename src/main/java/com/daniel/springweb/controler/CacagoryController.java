package com.daniel.springweb.controler;

import com.daniel.springweb.model.Catagory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class CacagoryController {
    private List<Catagory> catagories= new ArrayList<>();
    @GetMapping("/api/public/categoris")
    public  List<Catagory> getCatagories (){
        return  catagories;
    }
}
