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
 * @param objectives
 * @param edgesBetween
 * @param edgesFromCenter
 * @param edgesToCenter
 */
@Entity
@Table(name = "graph")
data class Graph (
    @Id
    @Column(name = "id", length = 255)
    var id: String = UUID.randomUUID().toString(),
    val name: String="",
    @OneToOne(cascade = [CascadeType.ALL])
    val center: Gps= Gps(),
    @OneToMany(mappedBy = "owner", cascade = [CascadeType.ALL])
    @OrderColumn(name = "orderInOwner")
    val objectives: Array<Objective> = arrayOf(),
    @OneToOne(cascade = [CascadeType.ALL])
    val edgesBetween: EdgeMatrix = EdgeMatrix(),
    @OneToOne(cascade = [CascadeType.ALL])
    val edgesFromCenter: EdgeArray = EdgeArray(),
    @OneToOne(cascade = [CascadeType.ALL])
    val edgesToCenter: EdgeArray = EdgeArray()
) {
    init {
        objectives.forEachIndexed { index, value ->
            value.owner = this
            value.orderInOwner = index
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Graph

        if (id != other.id) return false
        if (name != other.name) return false
        if (center != other.center) return false
        if (!objectives.contentEquals(other.objectives)) return false
        if (edgesBetween != other.edgesBetween) return false
        if (edgesFromCenter != other.edgesFromCenter) return false
        if (edgesToCenter != other.edgesToCenter) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + name.hashCode()
        result = 31 * result + center.hashCode()
        result = 31 * result + objectives.contentHashCode()
        result = 31 * result + edgesBetween.hashCode()
        result = 31 * result + edgesFromCenter.hashCode()
        result = 31 * result + edgesToCenter.hashCode()
        return result
    }
}