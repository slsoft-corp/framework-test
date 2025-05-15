package com.slsoft.framework.api.model;

import lombok.Data;

@Data
public class Server {
    private String name; // 서버명
    private String ip; // IP

    public Server(String name, String ip) {
        this.name = name;
        this.ip = ip;
    }
}
