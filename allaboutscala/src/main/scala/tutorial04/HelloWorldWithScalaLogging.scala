package tutorial04

import com.typesafe.scalalogging.LazyLogging;

object HelloWorldWithScalaLogging extends App with LazyLogging {
  logger.info("hello, world from Scala logging")
}
