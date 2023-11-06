/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Singleton.java to edit this template
 */
package util;

/**
 *
 * @author maya1
 */
public class GetConnection {
    
    private GetConnection() {
    }
    
    public static GetConnection getInstance() {
        return GetConnectionHolder.INSTANCE;
    }
    
    private static class GetConnectionHolder {

        private static final GetConnection INSTANCE = new GetConnection();
    }
}
