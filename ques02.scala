object exercise2{
    def temp(x:Int):Double={
        x*1.8000+32.00
    }
    def main(args:Array[String]):Unit={
        println("Tempraturenin Fahreheit: "+temp(35))
    }
}