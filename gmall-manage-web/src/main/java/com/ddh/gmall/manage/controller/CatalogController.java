package com.ddh.gmall.manage.controller;

import com.ddh.gmall.bean.PmsBaseCatalog1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: ddh
 * @data: 2019/12/21 15:57
 * @description
 **/
@RestController
public class CatalogController {

    @PostMapping("getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1() {
        return null;
    }
}
