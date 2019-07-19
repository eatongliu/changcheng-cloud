package com.apabi.producer.controller;


import com.apabi.producer.vo.RespData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * Created by liuyutong on 2018/9/10.
 */
@RestController
@RequestMapping("/producer")
public class ProducerController {

    @GetMapping("/{index}")
    public RespData producer(@PathVariable Integer index) {
        return RespData.success(Arrays.asList(1, 2, 3, 4).get(index));
    }

}
