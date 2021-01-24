package com.xiaoshitou.damian;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "cst_customer")
public class Customer {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name ="cust_id")
        private long custid;
        @Column(name ="cust_name")
        private  String custname;
        @Column(name ="cust_source")
        private  String custsource;
        @Column(name ="cust_industry")
        private  String custindustry;
        @Column(name ="cust_level")
        private  String custlevel;
        @Column(name ="cust_address")
        private  String custaddress;
        @Column(name ="cust_phone")
        private  String custphone;

    @Override
    public String toString() {
        return "Customer{" +
                "custid=" + custid +
                ", custname='" + custname + '\'' +
                ", custsource='" + custsource + '\'' +
                ", custindustry='" + custindustry + '\'' +
                ", custlevel='" + custlevel + '\'' +
                ", custaddress='" + custaddress + '\'' +
                ", custphone='" + custphone + '\'' +
                '}';
    }

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
        private Set<LinkMan> linkmen=new HashSet<LinkMan>();



    public Set<LinkMan> getLinkmen() {
        return linkmen;
    }

    public void setLinkmen(Set<LinkMan> linkmen) {
        this.linkmen = linkmen;
    }

    public long getCustid() {
            return custid;
        }

        public void setCustid(long custid) {
            this.custid = custid;
        }

        public String getCustname() {
            return custname;
        }

        public void setCustname(String custname) {
            this.custname = custname;
        }

        public String getCustsource() {
            return custsource;
        }

        public void setCustsource(String custsource) {
            this.custsource = custsource;
        }

        public String getCustindustry() {
            return custindustry;
        }

        public void setCustindustry(String custindustry) {
            this.custindustry = custindustry;
        }

        public String getCustlevel() {
            return custlevel;
        }

        public void setCustlevel(String custlevel) {
            this.custlevel = custlevel;
        }

        public String getCustaddress() {
            return custaddress;
        }

        public void setCustaddress(String custaddress) {
            this.custaddress = custaddress;
        }

        public String getCustphone() {
            return custphone;
        }

        public void setCustphone(String custphone) {
            this.custphone = custphone;
        }
}
