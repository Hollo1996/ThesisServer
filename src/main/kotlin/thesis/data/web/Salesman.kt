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
package thesis.data.web

import java.math.BigDecimal
import java.util.*
import javax.persistence.*


/**
 * 
 * @param id 
 * @param name 
 * @param workTime_SecondPerDay 
 * @param volumeCapacity_Stere 
 * @param weightCapacity_Gramm 
 * @param vechicleSpeed_MeterPerSecond 
 * @param payment_EuroPerSecond 
 * @param fuelConsuption_LiterPerMeter 
 * @param fuelPrice_EuroPerLiter 
 * @param basePrice_Euro 
 */
@Entity
@Table(name = "salesman")
@NamedQueries(
    NamedQuery(
        name = "listSalesman",
        query = "FROM Salesman"
    ),
    NamedQuery(
        name = "findByNameSalesman",
        query = "FROM Salesman where name = :name"
    )
)
data class Salesman (
    @Id
    @Column(name = "id", length = 255)
    var id: String = UUID.randomUUID().toString(),
    val name: String="",
    var orderInOwner: Int=0,
    val workTime_SecondPerDay: BigDecimal= BigDecimal(0),
    val volumeCapacity_Stere: BigDecimal= BigDecimal(0),
    val weightCapacity_Gramm: BigDecimal= BigDecimal(0),
    val vechicleSpeed_MeterPerSecond: BigDecimal= BigDecimal(0),
    val payment_EuroPerSecond: BigDecimal= BigDecimal(0),
    val fuelConsuption_LiterPerMeter: BigDecimal= BigDecimal(0),
    val fuelPrice_EuroPerLiter: BigDecimal= BigDecimal(0),
    val basePrice_Euro: BigDecimal=BigDecimal(0)
)

