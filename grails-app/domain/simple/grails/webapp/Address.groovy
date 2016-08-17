package simple.grails.webapp

class Address {

    String address
    String city
    String state
    String zipPostal
    String country
    Date created

    static belongsTo = Person  //one to many relation. i.e one adrress belongs to many persons

    static constraints = {
        address(nullable:false)
        city(nullable:false)
        state(nullable:false)
        zipPostal(nullable:false)
        country(nullable:false)
        created(nullable:false)
    }

}