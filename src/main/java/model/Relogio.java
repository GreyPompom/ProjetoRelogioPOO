/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Relogio {

    private int hora;
    private int minuto;
    private int segundo;

    public Relogio() {
    }

    public Relogio(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int x) {
        this.hora = x;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int x) {
        this.minuto = x;
    }

    public int getSegundos() {
        return this.segundo;
    }

    public void setSegundos(int x) {
        this.segundo = x;
    }

    public int hourToSecound() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    public void incrementSecound() {
        
        if (getSegundos() >= 60) {
            setSegundos(0);
            incrementMinuto();
        }else{
            setSegundos(getSegundos()+1);
        }
    }
    public void incrementMinuto(){
        if(getMinuto()>=60){
            setMinuto(0);
            incrementHour();
        }else{
             setMinuto(getMinuto()+1);
        }
    }
    public void incrementHour(){
        
        if(getHora()>=60){
            setHora(0);
        }else{
            setHora(getHora()+1);
        }
    }
    
    public void decrementSecound(){
        
        if(getSegundos()<=0){
            setSegundos(59);
            decrementMinuto();
        }else{
            setSegundos(getSegundos()-1);
        }
    }
    public void decrementMinuto(){
        if(getMinuto()<=0){
            setMinuto(59);
            decrementHour();
        }else{
            setMinuto(getMinuto()-1);
        }
    }
    public void decrementHour(){
        if(getHora()<0){
            setHora(23);
        }else{
            setHora(getHora()-1);
        }
    }
    
    public String ToString(){
        String horaStr = String.format("%02d", hora);
        String minutoStr = String.format("%02d", minuto);
        String segundoStr = String.format("%02d", segundo);
        return horaStr + ":" + minutoStr + ":" + segundoStr;
    }
}
