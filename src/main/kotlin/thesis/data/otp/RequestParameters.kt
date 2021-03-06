package thesis.data.otp

data class RequestParameters (
    var date: String? = null,
    var mode: String? = null,
    var arriveBy: String? = null,
    var fromPlace: String? = null,
    var toPlace: String? = null,
    var time: String? = null,
    var maxWalkDistance: String? = null
)