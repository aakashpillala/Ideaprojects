package com.starkindustries;
// private modifiers are used which are accesssed by public api
public class dreacompany {
    private String companyname;
    private String location;
    private int packageinlakhs;
    public String getcompanyname(){

        return companyname;
    }
    public void setcompanyname(String name)
    {
        companyname= name;

    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public int getPackageinlakhs()
    {
        return packageinlakhs;
    }

    public void setPackageinlakhs(int packageinlakhs)
    {
        this.packageinlakhs = packageinlakhs;
    }
    public void dowork(){
        System.out.println("iam working in my dream company " + companyname);
        System.out.println("company is located in :"+ location);
        System.out.println("package offered is :"+ packageinlakhs);
    }
}
