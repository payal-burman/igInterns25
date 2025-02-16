package com.insightglobal.day2;

public class PhoneNumber {
    private String areaCode;
    private String exchange;
    private String extension;

    public PhoneNumber(String areaCode, String exchange, String extension) {
        this.areaCode = areaCode;
        this.exchange = exchange;
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "(" + areaCode + ") " + exchange + "-" + extension;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PhoneNumber other = (PhoneNumber) obj;
        return areaCode.equals(other.areaCode) && exchange.equals(other.exchange) && extension.equals(other.extension);
    }

    public static void main(String[] args) {
        PhoneNumber phone1 = new PhoneNumber("800", "867", "5309");
        PhoneNumber phone2 = new PhoneNumber("800", "867", "5309");
        PhoneNumber phone3 = new PhoneNumber("212", "555", "1234");

        System.out.println(phone1);  
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println("Is phone1 is equal to phone2 :" +phone1.equals(phone2));  
        System.out.println("Is phone1 is equal to phone3 :" +phone1.equals(phone3));
    }
}
