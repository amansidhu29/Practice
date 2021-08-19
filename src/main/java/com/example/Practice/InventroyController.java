package com.example.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@RequestMapping
@Controller
public class InventroyController {



        @RequestMapping(value = "/category", method = RequestMethod.GET)
        public String showCategoryPage() {

            return "category";
        }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showCategoryPage2() {

        return "category";
    }
    }
