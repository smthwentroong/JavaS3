package Meth2.Pr13.point3;

import java.util.StringTokenizer;

public class AddressFormatter {

    static class Address {
        String country = "";
        String region = "";
        String city = "";
        String street = "";
        String house = "";
        String corpus = "";
        String flat = "";

        Address(String str, int sep) {
            switch (sep) {
                case 0: {
                    String[] address = str.split(", ");
                    country = address[0];
                    region = address[1];
                    city = address[2];
                    street = address[3];
                    house = address[4];
                    corpus = address[5];
                    flat = address[6];
                }
                break;
                case 1: {
                    StringTokenizer tokenizer = new StringTokenizer(str, ",.;");
                    country = tokenizer.nextToken();
                    region = tokenizer.nextToken();
                    city = tokenizer.nextToken();
                    street = tokenizer.nextToken();
                    house = tokenizer.nextToken();
                    corpus = tokenizer.nextToken();
                    flat = tokenizer.nextToken();
                }

                country = country.replace(" ", "");
                region = region.replace(" ", "");
                city = city.replace(" ", "");
                street = street.replace(" ", "");
                house = house.replace(" ", "");
                corpus = corpus.replace(" ", "");
                flat = flat.replace(" ", "");

            }
        }
        @Override
        public String toString () {
            return "Country: " + country + " " +
                    "Region: " + region + " " +
                    "City: " + city + " " +
                    "Street: " + street + " " +
                    "House: " + house + " " +
                    "Corpus: " + corpus + " " +
                    "Apartment: " + flat;
        }
    }


    public static void main(String[] args) {
        Address first = new Address("Russia, MOSCOW, Moscow, Mira, 26, 122, 313", 0);
        Address second = new Address("Russia, MOSCOW, Moscow, Mira, 26, 122, 313", 1);
        Address third = new Address("Russia; MOSCOW; Moscow; Mira; 26; 122; 313", 1);
        Address fourth = new Address("Russia. MOSCOW. Moscow. Mira. 26. 122. 313", 1);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}