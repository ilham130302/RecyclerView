package com.example.ilham2011500117_recyclerview

class Prodi(
    val warna:String,
    val jenjang: String,
    val nmProdi: String,
    val fakultas: String,
    val konsentrasi: Array<String> = arrayOf(nmProdi)
)