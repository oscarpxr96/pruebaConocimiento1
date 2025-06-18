package co.com.utest.project.models;

public class LocationInfoData {
    private String city;
    private String zip;
    private String country;

    public LocationInfoData(String city, String zip, String country) {
        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }

    public String getCountry() {
        return country;
    }
}
