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

import java.util.*
import javax.persistence.*

/**
 *
 * @param id
 * @param name
 * @param center
 * @param salesmen
 * @param costGraph
 */
@Entity
@Table(name = "task")
@NamedQueries(
    NamedQuery(
        name = "listTask",
        query = "FROM Task"
    ),
    NamedQuery(
        name = "findByNameTask",
        query = "FROM Task where name = :name"
    )
)
data class Task(
    @Id
    @Column(name = "id", length = 255)
    var id: String = UUID.randomUUID().toString(),
    val name: String = "",
    @OneToMany(cascade = [CascadeType.ALL])
    @OrderColumn(name = "orderInOwner")
    val salesmen: Array<Salesman> = arrayOf(),
    @OneToOne(cascade = [CascadeType.ALL])
    val costGraph: Graph = Graph()
) {
    init {
        salesmen.forEachIndexed { index, value ->
            value.orderInOwner = index
        }
    }
}

