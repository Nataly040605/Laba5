package data;

public class Address {
	private final String street; //Поле может быть null
    private final String zipCode; //Длина строки должна быть не меньше 5, Поле не может быть null
    private final Location town; //Поле не может быть null
    
    public Address(String street, String zipCode, Location town){
        this.street = street;
        this.zipCode = zipCode;
        this.town = town;
    }
    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public Location getTown() {
        return town;
    }
    
    @Override
    public int compareTo(Address o) {
        int res = this.street.compareTo(o.street);
        if(res==0){
            res = this.zipCode.compareTo(o.zipCode);
            if (res == 0) {
                res = this.town.compareTo(o.town);
            }
        }
        return res;
    }
}
