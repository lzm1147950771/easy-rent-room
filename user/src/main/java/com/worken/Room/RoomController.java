package com.worken.Room;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/12/6 0006.
 */
@RestController
@RequestMapping("/Room")
public class RoomController {
    @RequestMapping("/list")
    public void list(){
        System.out.print("这是版本（2）");
    }
}
