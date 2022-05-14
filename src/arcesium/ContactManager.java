package arcesium;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ContactManager {
    public static String URL =
            "https://raw.githubusercontent.com/arcjsonapi/ApiSampleData/master/api/users";

    public static String fetchResponseFromServiceURL(String urlStr) throws Exception {

        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-Type", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String result = null;
        StringBuilder sb = new StringBuilder();
        while ((result = br.readLine()) != null) {
            sb.append(result);
        }
        return sb.toString();
    }

    public static void fetchContactList() throws Exception {
        String response = fetchResponseFromServiceURL(URL);
        List<Contact> contacts;
        //Type listType = new TypeToken<List<Contact>>() {}.getType();
        //contacts = new Gson().fromJson(response, listType);
        String i = "address.city";
        String[] t = i.split("\\.");
        int tl = t.length;

        Gson gson = new Gson();
        JsonArray arr = gson.fromJson(response,JsonArray.class);
        for(JsonElement obj : arr){
            int ttl = 0;
            JsonObject jobj;
            jobj = obj.getAsJsonObject();
            while(ttl < tl-1){
                if(jobj.get(t[ttl]).isJsonObject()){

                }
                //jobj = jobj.get(t[ttl]).isJsonObject() ? jobj.get(t[ttl]).getAsJsonObject() : jobj.get(t[ttl]).getAsString();
                //System.out.println(city);
                jobj = jobj.get(t[ttl]).getAsJsonObject();
                ttl++;
            }
            String res = jobj.get(t[ttl]).getAsString();
            System.out.println(obj.getAsJsonObject().get("id").getAsInt());
            System.out.println(res);
        }




        Contact[] contactsArray = new Gson().fromJson(response, Contact[].class);
        contacts = new ArrayList<>(Arrays.asList(contactsArray));
        String[] input = {"address.geo.lat", "EQUALS", "-68.6102"};
        Predicate<Contact> p = null;

        /*if (input[1].equals("EQUALS")) {
            p = obj -> result(obj, input[0]).equals(input[2]);
        } else {
            p = obj -> input[2].contains((String) result(obj, input[0]));
        }*/
        if (input[1].equals("EQUALS")) {
            p = (c) -> {
                return c.address.geo.lat.equals(input[2]);
            };
        }
        List<Contact> c = contacts.stream().filter(p).collect(Collectors.toList());
        c.stream().forEach(e -> System.out.println(e.address.street + e.address.geo.lat));
        //System.out.println(rescponse);
    }


    public static void main(String[] args) throws Exception {
        fetchContactList();
        //usingJackson();
    }

    private static Map<String, Class> map = new HashMap<>();

    static {
        map.put("Address", Address.class);
        map.put("Contact", Contact.class);
        map.put("Geo", Geo.class);
        map.put("Company", Company.class);
        map.put("String", String.class);
    }

    static class Contact {
        private String id;
        private String name;
        private String username;
        private String email;
        private String website;
        private Address address;
        private Company company;

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getUsername() {
            return username;
        }

        public String getEmail() {
            return email;
        }

        public String getWebsite() {
            return website;
        }

        public Address getAddress() {
            return address;
        }

        public Company getCompany() {
            return company;
        }
    }

    static class Address {
        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private Geo geo;

        public String getStreet() {
            return street;
        }

        public String getSuite() {
            return suite;
        }

        public String getCity() {
            return city;
        }

        public String getZipcode() {
            return zipcode;
        }

        public Geo getGeo() {
            return geo;
        }
    }

    static class Geo {
        private String lat;
        private String lng;

        public String getLat() {
            return lat;
        }

        public String getLng() {
            return lng;
        }
    }

    static class Company {
        private String name;
        private String basename;

        public String getName() {
            return name;
        }

        public String getBasename() {
            return basename;
        }
    }


    private static void usingJackson() throws Exception {
        String response = fetchResponseFromServiceURL(URL);
        String[] input = {"address.geo.lat", "EQUALS", "-68.6102"};
        if (input[1].equals("EQUALS")) {

        }
        List<Contact> res = new ArrayList<>();
        res.stream().forEach(e -> System.out.println(e.address.geo.lat));
    }


}
