/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.example.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author RAF
 */
@Entity
@Table(name = "employees")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "employeeid")
    private Integer employeeid;
    @Column(name = "address")
    private String address;
    @Column(name = "birth_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;
    @Column(name = "extension")
    private String extension;
    @Basic(optional = false)
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "hire_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hireDate;
    @Column(name = "home_phone")
    private String homePhone;
    @Basic(optional = false)
    @Column(name = "last_name")
    private String lastName;
    @Basic(optional = false)
    @Lob
    @Column(name = "notes")
    private String notes;
    @Lob
    @Column(name = "photo")
    private byte[] photo;
    @Column(name = "photo_path")
    private String photoPath;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "region")
    private String region;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "salary")
    private Float salary;
    @Column(name = "title")
    private String title;
    @Column(name = "title_of_courtesy")
    private String titleOfCourtesy;
    @OneToMany(mappedBy = "reportsTo", fetch = FetchType.LAZY)
    private List<Employee> employeeList;
    @JoinColumn(name = "reports_to", referencedColumnName = "employeeid")
    @ManyToOne(fetch = FetchType.LAZY)
    private Employee reportsTo;

    public Employee() {
    }

    public Employee(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public Employee(Integer employeeid, String firstName, String lastName, String notes) {
        this.employeeid = employeeid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.notes = notes;
    }

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleOfCourtesy() {
        return titleOfCourtesy;
    }

    public void setTitleOfCourtesy(String titleOfCourtesy) {
        this.titleOfCourtesy = titleOfCourtesy;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeid != null ? employeeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.employeeid == null && other.employeeid != null) || (this.employeeid != null && !this.employeeid.equals(other.employeeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usa.example.model.Employee[ employeeid=" + employeeid + " ]";
    }
    
}
