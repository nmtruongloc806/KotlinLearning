package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //CoBan()
        //VongLap()
        //Mang()
        //ShowName("Loc")
        //OOPCoBan()
        //OOPDataClass()
    }

    fun CoBan(){
        // khai báo biến var & val
        var a : String = ""
        //a = "Loc"
        a = "2"
        a.toInt()

        // val như hằng số
        val b : String = "MTL"

        // ? là khai báo kiểu dữ liệu được phép null
        var ten : String? = null

        // !! là not null
        var ten2 : String = "MTL" !!

        // if else
        var A : Int = 15
        var B: Int = 10
        if(A > B)
        {
            Log.d("MTL", "A lớn hơn B")
        }
        else
        {
            Log.d("MTL", "B lớn hơn A")
        }

        // when <=> switch (c#)
        when(A)
        {
            in 7..10 -> Log.d("MTL","A < 11")
            11,12,13 -> Log.d("MTL","A < 14")
            15,16,17 -> Log.d("MTL","A > 14")
            else -> Log.d("MTL","Cai nay la default trong c#")
        }
    }

    fun VongLap(){

        // vòng lặp while
        var w : Int= 0
        while(w < 10)
        {
            Log.d("MTL" ,"Lan thu " + w)
            w++
        }

        // vòng lặp for
        for(i in 0..10)
        {
            Log.d("MTL" ,"Lan thu " + i)
        }

        var count : Int = 5
        // là chỉ chạy đến 4
        for(i in 0 until count)
        {
            Log.d("MTL" ,"Lan thu " + i)
        }
        // là chạy từ count -> 0
        for(i in count downTo  0)
        {
            Log.d("MTL" ,"Lan thu " + i)
        }

        // nhảy thêm số step
        for(i in 0..10 step 2)
        {
            Log.d("MTL" ,"Lan thu " + i)
        }
    }

    fun Mang(){
        // Mảng cách 1:

        // IntArray, ByteArray ,BooleanArray,DoubleArray,... nhưng có StringArray
        var mangint : IntArray = intArrayOf(1,2,3,4,5,6)
        mangint.get(1)

        // Mảng cách 2:

        var mangten : List<String> = listOf("Loc","MTL","")
        mangten.get(0)

        // Mảng cách 3:
        var mangstring : ArrayList<String> = ArrayList()
        mangstring.add("Loc")
        mangstring.add(1,"MTL")

        //get count của mảng
        mangstring.size

        //remove trong mảng
        mangstring.remove("Loc")
        mangstring.removeAt(1)
    }

    fun ShowName(ten : String)
    {
        Log.d("MTL", "Tên của bạn là: " + ten)
    }

    fun OOPCoBan(){
        var sv1 : SinhVien = SinhVien("Loc","khong biet")

        //sv1.HoTen = "Loc"
        //sv1.DiaChi = "khong biet"
        sv1.setNamSinh(1994)
        var ns : Int = sv1.getNamSinh()

        var sv2 : SinhVien2 = SinhVien2("Loc","khong biet")
    }

    fun OOPDataClass(){
        var sv3 : SinhVien3 = SinhVien3("Loc","khong biet")
        sv3.hoTen = "MTL"
        // diaChi sẽ k reset dc vi khai bao kieu val
        //sv3.diaChi = "Biet roi"

        // dùng đối với class
        Log.d("MTL" , "Sinh viên: ${sv3.hoTen} - ${sv3.diaChi}")

        // dùng đối với biến
        val Ho = "Nguyen"
        val Ten = "Loc"
        Log.d("MTL" , "Sinh viên: $Ho - $Ten")
    }
}
