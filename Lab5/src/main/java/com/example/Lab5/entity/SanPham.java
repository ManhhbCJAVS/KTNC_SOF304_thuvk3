package com.example.Lab5.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SanPham {

    private String id;
    private String maSanPham;
    private String tenSanPham;
    private float gia;
    private String kichThuoc;
    private int soLuong;

}
