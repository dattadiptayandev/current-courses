package tutorial04

object HelloWorldWithArgs extends App {

  println("hello, world with arguments!")
  print("command line args are: ")
  println(args.mkString(", "))

}
