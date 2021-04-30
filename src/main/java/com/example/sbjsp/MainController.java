package com.example.sbjsp;

import com.example.sbjsp.dao.TabStkPalletDao;
import com.example.sbjsp.dto.TabStkPallet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
public class MainController {

    @Autowired
    TabStkPalletDao tabStkPalletDao;

    @RequestMapping("/")
    public String index(){

        List<TabStkPallet> tabStkPallets = tabStkPalletDao.listPallet();

        log.debug("{}", tabStkPallets);

        return "index";
    }


}
