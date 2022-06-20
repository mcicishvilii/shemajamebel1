package com.example.shemajamebel1

class MathOperations {


    // უსგ
    fun GCD (n1:Int, n2:Int):Int{

        var gcd = 1
        var i = 1

        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0)
                gcd = i
            ++i
        }
        println("უსგ არის $gcd")
        return gcd
    }

    // უსჯ
    fun LCM(n1:Int,n2:Int){
        println("უსჯ არის ${n1 + n2 / GCD(n1,n2)}")
    }

    // შეიცავს თუარა დოლარის ნიშანს.
    fun ifContainsDollarSign(word:String){

        if (word.contains("$")){
            println("contains")
        }else{
            println("dollar free!")
        }

    }

    // ლუწი რიცხვების ჯამი
    fun sumOfEvenNumbs(){
        var x = 1
        for(i in 0..100){
            if (i % 2 == 0){
                x += i
            }
        }
        println(x)

    }

    //შებურნებული რიცხვი
    fun numberReverted(x:Int){

        var reverse: Int = 0
        var num: Int = x

        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }

        println("შებრუნებული რიცხვია: $reverse")

    }

    // პალინდრომი
    fun palindromeChecker(word:String){

        var wordLowercased = word.toLowerCase()

        if (wordLowercased == wordLowercased.reversed()){
            println("Word is palindrome")
        }else {
            println("word is not palindrome")
        }
    }

}