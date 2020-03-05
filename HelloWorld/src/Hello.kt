fun main(args: Array<String>){
    val i=0;
    println("Hello World!")

    for(i in 1..100){

        print(i)
        print(" ")
        if(i%3==0){
            print("Fizz")
        }
        if(i%5==0){
            print("Buzz")
        }
        println("")
            /*
        if (i%15 != 0) {
            if (i%3==0){
                print("Fizz")
            }else if (i%5==0){
                print("Buzz")
            }
        } else {
            print("FizzBuzz")
        }
        println("")

             */
    }

}