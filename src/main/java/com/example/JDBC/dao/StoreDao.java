//package com.example.JDBC.dao;
//
//
//import com.example.JDBC.models.store;
//import org.springframework.stereotype.Component;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//public class StoreDao {
//    private List<store> stores;
//    {
//        stores.add(new store(1L,"Москва", "Первая","1"));
//        stores.add(new store(2L,"Москва", "Вторая","2"));
//
//    }
////    private static final String URL = "jdbc:postgresql://localhost:5432/test1";
////    private static final String USER = "postgres";
////    private static final String PASSWORD = "password2000";
////    private static Connection connection;
////
////
////    static {
////        try{
////            Class.forName("org.postgresql.Driver");
////
////        } catch (Exception e) {
////            System.out.println("Ошибка подключения драйвера");
////            e.printStackTrace();
////        }
////        try {
////            connection = DriverManager.getConnection(URL, USER, PASSWORD);
////            //connection.close();
////
////        } catch (Exception e) {
////            System.out.println("Ошибка 2");
////            e.printStackTrace();
////        }
////
////    }
//
//
//
//    public List<store> selectStore()
//    {
//
//        //List<store> stores = new ArrayList<>();
////        String SQL = "SELECT * FROM store";
////        try {
////            Statement statement = connection.createStatement();
////            ResultSet resultset = statement.executeQuery(SQL);
////
////            while(resultset.next()){
////                store store = new store();
////
////                store.setId(resultset.getLong("id"));
////                store.setCity(resultset.getString("city"));
////                store.setStreet(resultset.getString("street"));
////                store.setHouse(resultset.getString("house"));
////
////                stores.add(store);
////            }
////        }catch (Exception e) {
////            System.out.println("Ошибка 3");
////            e.printStackTrace();
////        }
//        return stores;
//    }
//
//    public void addStore(store store)
//    {
//        //stores.add(store);
//    }
//    public void deleteStore(int id)
//    {
//        // stores.removeIf(store -> store.getId().equals(id));
//    }
//
//    public void updateStore(store store){
////        for(int i = 0; i< stores.size(); i++){
////            if (stores.get(i).getId().equals(store.getId())) {
////                stores.set(i,store);
////            }
////        }
//
//    }
//}
