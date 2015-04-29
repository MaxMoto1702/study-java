package name.maxserebryanskiy.study.spring.social.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Created by maksim.serebryanskiy on 28.04.2015.
 */
public class HHUser implements Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(HHUser.class);

    private String id;
    private String lastName;
    private String firstName;
    private String middleName;
    private boolean isAdmin;
    private boolean isApplicant;
    private boolean isEmployer;
    private String email;
    private HHEmployer employer;
    private HHCounters counters;
    private boolean isInSearch;
    private String resumesUrl;
    private String negotiationsUrl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public boolean isApplicant() {
        return isApplicant;
    }

    public void setApplicant(boolean isApplicant) {
        this.isApplicant = isApplicant;
    }

    public boolean isEmployer() {
        return isEmployer;
    }

    public void setEmployer(boolean isEmployer) {
        this.isEmployer = isEmployer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HHEmployer getEmployer() {
        return employer;
    }

    public void setEmployer(HHEmployer employer) {
        this.employer = employer;
    }

    public HHCounters getCounters() {
        return counters;
    }

    public void setCounters(HHCounters counters) {
        this.counters = counters;
    }

    public boolean isInSearch() {
        return isInSearch;
    }

    public void setInSearch(boolean isInSearch) {
        this.isInSearch = isInSearch;
    }

    public String getResumesUrl() {
        return resumesUrl;
    }

    public void setResumesUrl(String resumesUrl) {
        this.resumesUrl = resumesUrl;
    }

    public String getNegotiationsUrl() {
        return negotiationsUrl;
    }

    public void setNegotiationsUrl(String negotiationsUrl) {
        this.negotiationsUrl = negotiationsUrl;
    }
}
