package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQueries({
@NamedNativeQuery(
        name="Company.findByPartyOfNameForFirstThreeChar",
        query =" SELECT *\n" +
                "from companies \n" +
                "WHERE SUBSTRING(company_name, 1 , 3) =:PARTY_OF_NAME",
        resultClass = Company.class
),
@NamedNativeQuery(
        name="Company.findByPartyOfName",
        query =" SELECT *\n" +
                "from companies \n" +
                "WHERE company_name LIKE CONCAT('%',:PARTY_OF_NAME,'%')",
        resultClass = Company.class
)
})


@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID",unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
