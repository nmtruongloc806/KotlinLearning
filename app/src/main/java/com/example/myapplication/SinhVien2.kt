package com.example.myapplication

class SinhVien2(hoTen : String, diaChi: String) {
    public var HoTen : String = ""
    var DiaChi : String = ""
    private var NamSinh : Int = 0

    init {
        HoTen = hoTen
        this.DiaChi = diaChi
    }
    fun getNamSinh() : Int{
        return  NamSinh
    }

    fun setNamSinh(namSinh : Int){
        if( namSinh > 1999)
            NamSinh = namSinh
        else
            NamSinh = 1999
    }
}