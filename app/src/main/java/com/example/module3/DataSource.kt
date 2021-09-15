package com.example.module3

class DataSource {
    fun loadBrands(): List<DataModel> {
        return listOf<DataModel>(
            DataModel(R.string.brand1, R.drawable.img1),
            DataModel(R.string.brand2, R.drawable.img2),
            DataModel(R.string.brand3, R.drawable.img3),
            DataModel(R.string.brand4, R.drawable.img4),
            DataModel(R.string.brand5, R.drawable.img5),
            DataModel(R.string.brand6, R.drawable.img6),
            DataModel(R.string.brand7, R.drawable.img7),
            DataModel(R.string.brand8, R.drawable.img8),
            DataModel(R.string.brand9, R.drawable.img9),
            DataModel(R.string.brand10,R.drawable.img10) ,
            DataModel(R.string.brand11, R.drawable.img11)
        )
    }
}