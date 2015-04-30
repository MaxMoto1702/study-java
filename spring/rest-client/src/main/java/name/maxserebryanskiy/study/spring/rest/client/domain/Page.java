package name.maxserebryanskiy.study.spring.rest.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.net.URL;

/**
 * Created by maksim.serebryanskiy on 30.04.2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {

    private String name;
    private String about;
    private String phone;
    private boolean isCommunityPage;
    private Location location;
    private URL website;

    /**
     * Getter for property 'name'.
     *
     * @return Value for property 'name'.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for property 'name'.
     *
     * @param name Value to set for property 'name'.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for property 'about'.
     *
     * @return Value for property 'about'.
     */
    public String getAbout() {
        return about;
    }

    /**
     * Setter for property 'about'.
     *
     * @param about Value to set for property 'about'.
     */
    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * Getter for property 'phone'.
     *
     * @return Value for property 'phone'.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Setter for property 'phone'.
     *
     * @param phone Value to set for property 'phone'.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Getter for property 'communityPage'.
     *
     * @return Value for property 'communityPage'.
     */
    public boolean isCommunityPage() {
        return isCommunityPage;
    }

    /**
     * Setter for property 'isCommunityPage'.
     *
     * @param isCommunityPage Value to set for property 'isCommunityPage'.
     */
    public void setIsCommunityPage(boolean isCommunityPage) {
        this.isCommunityPage = isCommunityPage;
    }

    /**
     * Getter for property 'location'.
     *
     * @return Value for property 'location'.
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Setter for property 'location'.
     *
     * @param location Value to set for property 'location'.
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * Getter for property 'website'.
     *
     * @return Value for property 'website'.
     */
    public URL getWebsite() {
        return website;
    }

    /**
     * Setter for property 'website'.
     *
     * @param website Value to set for property 'website'.
     */
    public void setWebsite(URL website) {
        this.website = website;
    }

    /**
     * Getter for property 'location.city'.
     *
     * @return Value for property 'location.city'.
     */
    public String getCity() {
        return location.getCity();
    }

    public class Location {

        private String city;
        private String country;
        private String state;
        private String street;
        private String zip;
        private double latitude;
        private double longitude;

        /**
         * Getter for property 'city'.
         *
         * @return Value for property 'city'.
         */
        public String getCity() {
            return city;
        }

        /**
         * Setter for property 'city'.
         *
         * @param city Value to set for property 'city'.
         */
        public void setCity(String city) {
            this.city = city;
        }

        /**
         * Getter for property 'country'.
         *
         * @return Value for property 'country'.
         */
        public String getCountry() {
            return country;
        }

        /**
         * Setter for property 'country'.
         *
         * @param country Value to set for property 'country'.
         */
        public void setCountry(String country) {
            this.country = country;
        }

        /**
         * Getter for property 'state'.
         *
         * @return Value for property 'state'.
         */
        public String getState() {
            return state;
        }

        /**
         * Setter for property 'state'.
         *
         * @param state Value to set for property 'state'.
         */
        public void setState(String state) {
            this.state = state;
        }

        /**
         * Getter for property 'street'.
         *
         * @return Value for property 'street'.
         */
        public String getStreet() {
            return street;
        }

        /**
         * Setter for property 'street'.
         *
         * @param street Value to set for property 'street'.
         */
        public void setStreet(String street) {
            this.street = street;
        }

        /**
         * Getter for property 'zip'.
         *
         * @return Value for property 'zip'.
         */
        public String getZip() {
            return zip;
        }

        /**
         * Setter for property 'zip'.
         *
         * @param zip Value to set for property 'zip'.
         */
        public void setZip(String zip) {
            this.zip = zip;
        }

        /**
         * Getter for property 'latitude'.
         *
         * @return Value for property 'latitude'.
         */
        public double getLatitude() {
            return latitude;
        }

        /**
         * Setter for property 'latitude'.
         *
         * @param latitude Value to set for property 'latitude'.
         */
        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        /**
         * Getter for property 'longitude'.
         *
         * @return Value for property 'longitude'.
         */
        public double getLongitude() {
            return longitude;
        }

        /**
         * Setter for property 'longitude'.
         *
         * @param longitude Value to set for property 'longitude'.
         */
        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }
    }
}
