package com.lits.hw6;

enum Cars {
    MERSEDES (1, "DE", "MRS"),
    AUDI(2, "DE", "AU"),
    CITROEN (3,"FR","CTR"),
    PEUGEOT (4,"FR","PGT"),
    LAND_ROVER(5,"EN","LR"),
    BUGATTI (6,"FR","BGT"),
    FORD (7,"USA","FRD"),
    ZAZ (8,"UA","ZAZ"),
    DODGE (9,"USA","DDG"),
    HONDA (10,"JAP","HND");
    int id;
    String country;
    String code;
    public String getCode() { return code; }
    public int getId() { return id;}
    public String getCountry() { return country;}

    Cars(int id, String country, String code) {
        this.id=id;
        this.country=country;
        this.code=code;
    }

    public static Cars findById(int id)  {
        for(Cars a : values()) {
            if(a.getId() == id) {
                return a;
            }
        }
        return null;
        //throw new IllegalArgumentException();
    }
    public static Cars findByCode(String code)  {
        for(Cars a : values()) {
            if(a.getCode() == code) {
                return a;
            }
        }
        return null;
    }
    public static String findByCountry(String country)  {
        String result = "";
        for(Cars a : values()) {
            if(a.getCountry() == country) {
                result = result + " " + a ;
            }
        }
        return result;}

}
