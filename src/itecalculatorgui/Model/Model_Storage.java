/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Model;

import static java.lang.Math.pow;

/**
 *
 * @author BTS071016
 */
public class Model_Storage {
    
       
    public double byte2kB(double numByte){
        return (numByte/1024);
    }
    /**
     * byte2MB is method for transfer byte to Magabyte
     * @param numByte parameter for numbers of byte 
     */
    public double byte2MB(double numByte){
        return  (numByte/(pow(1024,2)));
    }/**
     * byte2GB is method for transfer byte to Gigabyte
     * @param numByte parameter for numbers of byte
     */
    public double byte2GB(double numByte){
        return (numByte/(pow(1024,3)));
    }/**
     * byte2TB is method for transfer byte to terabyte
     * @param numByte parameter for numbers of byte 
     */
    public double byte2TB(double numByte){
        return (numByte/(pow(1024,4)));
    }/**
     * byte2PB is method for transfer byte to Parabyte
     * @param numByte parameter for numbers of byte 
     */
    public double byte2PB(double numByte){
        return (numByte/(pow(1024,5)));
    }
    /**
     * Kb2Byte is method for transfer Kilobyte to byte
     * @param kilobyte parameter for numbers of kilobyte
     */
    public double kb2Byte(double kilobyte){
       return (kilobyte*1024);
    }/**
     * Kb2MB is method for transfer Kilobyte to Magabyte
     * @param kilobyte parameter for numbers of kilobyte
     */
    public double kb2MB(double kilobyte){
        return (kilobyte/1024);
    }/**
     * Kb2GB is method for transfer Kilobyte to Gigabyte
     * @param kilobyte parameter for numbers of kilobyte
     */
    public double kb2GB(double kilobyte){
        return (double)kilobyte/pow(1024,2);
    }/**
     * Kb2TB is method for transfer Kilobyte to terabyte
     * @param kilobyte parameter for numbers of kilobyte
     */
    public double kb2TB(double kilobyte){
        return (kilobyte/pow(1024,3));
    }/**
     * Kb2PB is method for transfer Kilobyte to Parabyte
     * @param kilobyte parameter for numbers of kilobyte
     */
    public double kb2PB(double kilobyte){
        return (kilobyte/pow(1024,4));
    }/**
     * mb2Byte is method for transfer Migabyte to byte
     * @param magabyte parameter for numbers of magabyte
     */
    public double mb2Byte(double magabyte){
        return (magabyte*pow(1024,2));
    }/**
     * mb2KB is method for transfer Migabyte to Kilobyte
     * @param magabyte parameter for numbers of magabyte
     */
    public double mb2KB(double magabyte){
       return (magabyte*1024);
    } /**
     * mb2GB is method for transfer Migabyte to Gagabyte
     * @param magabyte parameter for numbers of magabyte
     */
    public double mb2GB(double magabyte){
        return (magabyte/1024);
    }/**
     * mb2TB is method for transfer Migabyte to te
     * @param magabyte parameter for numbers of magabyte
     */
    public double mb2TB(double magabyte){
        return (magabyte/pow(1024,2));
    }/**
     * mb2TB is method for transfer Migabyte to parabyte
     * @param magabyte parameter for numbers of magabyte
     */
    public double mb2PB(double magabyte){
        return (magabyte/pow(1024,3));
    }/**
     * gb2byte is method for transfer Gigabyte to byte
     * @param gigabyte parameter for numbers of Gigabyte
     */

    public double gb2byte(double gigabyte){
        return (gigabyte*pow(1024,3));
    }/**
     * gb2KB is method for transfer Gigabyte to Kilobyte
     * @param gigabyte parameter for numbers of Gigabyte
     */

    public double gb2KB(double gigabyte){
        return  (gigabyte*pow(1024,2));
    }/**
     * gb2MB is method for transfer Gigabyte to megabyte
     * @param gigabyte parameter for numbers of Gigabyte
     */

    public double gb2MB(double gigabyte){
        return (gigabyte*1024);
    }/**
     * gb2TB is method for transfer Gigabyte to Terabye
     * @param gigabyte parameter for numbers of Gigabyte
     */

    public double gb2TB(double gigabyte){
        return (gigabyte/1024);
    }/**
     * gb2Pb is method for transfer Gigabyte to Petabye
     * @param gigabyte parameter for numbers of Gigabyte
     */
    public double gb2PB(double gigabyte){
        return (gigabyte/pow(1024,2));
    /**
     * Tb2PB is method for transfer Terabtye to byte
     * @param terabyte parameter for numbers of terabyte
     */}
    public double Tb2byte(double terabyte){
        return (terabyte*pow(1024,4));
    }/**
     * Tb2PB is method for transfer terabtye to kilobyte
     * @param terabyte parameter for numbers of terabyte
     */
    public double Tb2KB(double terabyte){
        return (terabyte*pow(1024,3));
    }/**
     * Tb2MB is method for transfer terabtye to Magabyte
     * @param terabyte parameter for numbers of terabyte
     */
    public double Tb2MB(double terabyte){
        return (terabyte*pow(1024,2));
    }/**
     * Tb2GB is method for transfer terabtye to Gigabyte
     * @param terabyte parameter for numbers of terabyte
     */
    public double TB2GB(double terabyte){
        return (terabyte*1024);
    }/**
     * TB2PB is method for transfer terabtye to parabyte
     * @param terabyte parameter for numbers of terabyte
     */
    public double TB2PB(double terabyte){
        return (terabyte/1024);
    }/**
     * PB2byte is method for transfer parabyte to byte
     * @param parabyte parameter for number of parabyte
     */
    public double  PB2byte(double parabyte){
        return (parabyte*pow(1024,5));
    }/**
     * PB2KB is method for transfer parabyte to Kilobyte
     * @param parabyte parameter for number of parabyte
     */
    public double PB2kB(double parabyte){
        return (parabyte*pow(1024,4));
    }/**
     * PB2MB is method for transfer parabyte to Magabyte
     * @param parabyte parameter for number of parabyte
     */
    public double PB2MB(double parabyte){
        return (parabyte*pow(1024,3));
    }/**
     * PB2GB is method for transfer parabyte to Gigabyte
     * @param parabyte parameter for number of parabyte
     */
    public double PB2GB(double parabyte){
        return (parabyte*pow(1024,2));
    }/**
     * PB2TB is method for transfer parabyte to Terabyte
     * @param parabyte parameter for number of parabyte
     */
    public double PB2TB(double parabyte){
        return (parabyte*1024);
    }
}
