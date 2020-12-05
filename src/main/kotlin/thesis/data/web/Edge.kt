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
 * @param length_Meter
 * @param root
 */
@Entity
@Table(name = "edge")
@NamedQueries(
    NamedQuery(
        name = "listEdge",
        query = "FROM Edge"
    ),
    NamedQuery(
        name = "findByNameEdge",
        query = "FROM Edge where name = :name"
    )
)
data class Edge(
    @Id
    @Column(name = "id", length = 255)
    var id: String = UUID.randomUUID().toString(),
    val name: String = "",

    var orderInOwner: Int = 0,

    val length_Meter: BigDecimal = BigDecimal(0),
    @OneToMany(cascade = [CascadeType.ALL])
    @OrderColumn(name = "orderInOwner")
    val rout: Array<Gps> = arrayOf()
) {
    init {
        rout.forEachIndexed { index, gps -> gps.orderInOwner = index }
    }
}

