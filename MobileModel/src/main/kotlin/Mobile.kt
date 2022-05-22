data class Mobile ( var brand : String, var model: String, var mrp : String, var discount : Float ) {

    fun getActualPrice() : Float { return discount }
    fun printDetails() : String{
        return "Brand: $brand / Model: $model / MRP: $mrp / Discount: $discount"
    }

}