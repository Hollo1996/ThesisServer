/**
* DRP
* This is the main server of QLM's DRP system
*
* OpenAPI spec version: 1.0.0
* Contact: akos.hollo-szabo@qlndc.hu
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package web.apis

import com.google.gson.Gson
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.*

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288


fun Route.LifecicleApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    route("/lifecycle/clean") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/lifecycle/cycle") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "bestCost_Euro" : 1.46581298050294517310021547018550336360931396484375,
              "maxCost_Euro" : 0.80082819046101150206595775671303272247314453125,
              "name" : "name",
              "minCost_Euro" : 6.02745618307040320615897144307382404804229736328125,
              "id" : "id",
              "bestRout" : [ {
                "lattitude" : 0.80082819046101150206595775671303272247314453125,
                "longitude" : 6.02745618307040320615897144307382404804229736328125
              }, {
                "lattitude" : 0.80082819046101150206595775671303272247314453125,
                "longitude" : 6.02745618307040320615897144307382404804229736328125
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/lifecycle/pause") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/lifecycle/prepare") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/lifecycle/resume") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/lifecycle/start") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    

    route("/lifecycle/step") {
        post {
            val exampleContentType = "application/json"
            val exampleContentString = """{
              "bestCost_Euro" : 1.46581298050294517310021547018550336360931396484375,
              "maxCost_Euro" : 0.80082819046101150206595775671303272247314453125,
              "name" : "name",
              "minCost_Euro" : 6.02745618307040320615897144307382404804229736328125,
              "id" : "id",
              "bestRout" : [ {
                "lattitude" : 0.80082819046101150206595775671303272247314453125,
                "longitude" : 6.02745618307040320615897144307382404804229736328125
              }, {
                "lattitude" : 0.80082819046101150206595775671303272247314453125,
                "longitude" : 6.02745618307040320615897144307382404804229736328125
              } ]
            }"""
            
            when(exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        }
    }
    

    route("/lifecycle/stop") {
        post {
            call.respond(HttpStatusCode.NotImplemented)
        }
    }
    
}
