package com.patson.data


import scala.concurrent.Future
import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.collection.mutable.ListBuffer
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.util.Random

object Test extends App {
     
//       println(WikiUtil.queryProfilePicture("Charles de Gaulle Airport", List.empty))
//       println(WikiUtil.queryOtherPicture("Charles de Gaulle Airport", AirportProfilePicturePatcher.airportPreferredWords))
       
//       println(WikiUtil.queryProfilePicture("Barrow City, United States Of America", List.empty))
//       println(WikiUtil.queryProfilePicture("Duncan city, Canada", List.empty))
//       println(WikiUtil.queryProfilePicture("City of Las Vegas, nm, United States Of America", AirportProfilePicturePatcher.cityPreferredWords))
//       println(WikiUtil.queryProfilePicture("City of Las Vegas, nm, United States Of America", List.empty))
       
//       println(WikiUtil.queryOtherPicture("Mexico City", AirportProfilePicturePatcher.cityPreferredWords))
//       println(WikiUtil.queryOtherPicture("Chek Lap Kok International Airport", AirportProfilePicturePatcher.airportPreferredWords))
//     println(WikiUtil.queryOtherPicture("Vancouver"))
     
//        println(AirportProfilePicturePatcher.getCityProfilePictureUrl(Airport.fromId(0).copy(city="Barrow", countryCode="US")))

// AirportProfilePicturePatcher.patchProfilePictures()
//    AirlineSource.loadAllAirlines(false).foreach(println)
//    Patchers.patchAirlineCode()
//    Patchers.patchFlightNumber()
    Patchers.airplaneModelPatcher()
//  Patchers.patchAirlineLogos()
//  IsolatedAirportPatcher.patchIsolatedAirports()
  
  
}






