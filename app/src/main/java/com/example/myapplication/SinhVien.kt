package com.example.myapplication

class SinhVien{
    //Default là public
    public var HoTen : String = ""
    var DiaChi : String = ""
    private var NamSinh : Int = 0

    fun getNamSinh() : Int{
        return  NamSinh
    }

    fun setNamSinh(namSinh : Int){
        if( namSinh > 1999)
            NamSinh = namSinh
        else
            NamSinh = 1999
    }

    constructor(hoTen: String,diaChi: String)
    {
        HoTen = hoTen
        this.DiaChi = diaChi
    }
}