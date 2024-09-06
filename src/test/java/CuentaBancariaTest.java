/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.cuenta.bancaria.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yeferson
 */
public class CuentaBancariaTest {
    
    public CuentaBancariaTest() {
        
    }

    /**
     * Test of getTitular method, of class CuentaBancaria.
     */
    
    @Test
    public void testGetTitular() {
        String valor_esperado = "Jorge";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Jorge");
        String valor_actual = cuenta.getTitular();
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void testGetTitular2() {
        String valor_esperado = "Leonardo";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setTitular("Leonardo");
        String valor_actual = cuenta.getTitular();
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void testgetNumeroCuenta(){
        String valor_esperado = "1235ASD";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("1235ASD");
        String valor_actual = cuenta.getNumeroCuenta();
        assertEquals(valor_esperado,valor_actual); 
        
    }
    
    @Test
    public void testgetNumeroCuenta2(){
        String valor_esperado = "506232710L";
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setNumeroCuenta("506232710L");
        String valor_actual = cuenta.getNumeroCuenta();
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void  testgetSaldo(){
        double valor_esperado = 2;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(2);
        double valor_actual = cuenta.getSaldo();
        assertEquals(valor_esperado,valor_actual);
        
    }
    
    @Test
    public void testgetSaldo2(){
        double valor_esperado = 500;
        
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(500);
        double valor_actual = cuenta.getSaldo();
        assertEquals(valor_esperado,valor_actual);
        
    }
    
    @Test
    public void testingresar(){
        double valor_esperado = 232710-500;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(232710);
        
   
        double valor_actual = cuenta.retirar(500);
        assertEquals(valor_esperado,valor_actual);
        
        
    }
    
    @Test
    public void testingresar2(){
        
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(100);
        
   
        double valor_actual = cuenta.retirar(500);
        assertEquals(0,valor_actual);
        
        
    }
    
    @Test
    public void testcalcularInteres() {
        
        double valor_esperado = 506*0.015;
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(506);
   
        double valor_actual = cuenta.calcularInteres();
        assertEquals(valor_esperado,valor_actual);
        
        
        
    }
    
    @Test
    public void testcalcularInteres2() {
        
       
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.setSaldo(-506);
   
        double valor_actual = cuenta.calcularInteres();
        
        
        assertEquals(0,valor_actual);
        
        
        
        
    }
    @Test
    public void testsetTipoInteres() {
        
        CuentaBancaria cuenta = new CuentaBancaria();
        double valor_esperado = 0.10;
        cuenta.setTipoInteres(0.10);
        double valor_actual = cuenta.getTipoInteres();
        
        assertEquals(valor_esperado, valor_actual );
        
    }
    @Test
    public void testsetTipoInteres2() {
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        cuenta.setTipoInteres(-0.10);
        double valor_actual = cuenta.getTipoInteres();
        
        assertEquals(0.015, valor_actual );
        
    }
    

    
}
