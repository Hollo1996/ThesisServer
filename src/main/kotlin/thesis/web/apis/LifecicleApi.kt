/**
* DRP
* This is the thesis.main server of QLM's DRP system
*
* OpenAPI spec version: 1.0.0
* Contact: akos.hollo-szabo@qlndc.hu
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package thesis.web.apis

import thesis.data.web.Result
import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.*
import thesis.data.web.GpsMatrix
import java.math.BigDecimal
import java.util.*

// ktor 0.9.x is missing io.ktor.locations.DELETE, this adds it.
// see https://github.com/ktorio/ktor/issues/288

fun Route.LifecicleApi() {
    route("/lifecycle/clean") {
        post {
            call.respond(HttpStatusCode.OK)
        }
    }
    

    route("/lifecycle/pause") {
        post {
            call.respond(HttpStatusCode.OK)
        }
    }
    

    route("/lifecycle/prepare") {
        post {
            call.respond(HttpStatusCode.OK)
        }
    }
    

    route("/lifecycle/resume") {
        post {
            call.respond(HttpStatusCode.OK)
        }
    }
    

    route("/lifecycle/start") {
        post {
            call.respond(HttpStatusCode.OK)
        }
    }


    route("/lifecycle/stop") {
        post {
            call.respond(HttpStatusCode.OK)
        }
    }
    

    route("/lifecycle/step") {
        post {
            call.respond(
                HttpStatusCode.OK,
                Result(
                    UUID.randomUUID().toString(),
                    "placeholder",
                    GpsMatrix(),
                    BigDecimal(0),
                    BigDecimal(0),
                    BigDecimal(0)
                )
            )
        }
    }


    route("/lifecycle/cycle") {
        post {
            call.respond(
                HttpStatusCode.OK,
                Result(
                    UUID.randomUUID().toString(),
                    "placeholder",
                    GpsMatrix(),
                    BigDecimal(0),
                    BigDecimal(0),
                    BigDecimal(0)
                )
            )
        }
    }
    
}