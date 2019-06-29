/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author luaalvarezve
 */
@Entity
@Table (name="Plantilla")
public class Template implements Serializable  {
    
    private String gender;
    private String clothName;
    private float washPrice;
    private boolean washA;
    private float waiPrice;
    private boolean waiA;
    private float ironPrice;
    private boolean ironA;
    private boolean fold;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
     
      public int getId(){
        return id;        
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public Template(){
    }

    public String getGender() {
        return gender;
    }

     public String getClothName() {
        return clothName;
    }

    public boolean isWashA() {
        return washA;
    }

    public boolean isWaiA() {
        return waiA;
    }

    public boolean isIronA() {
        return ironA;
    }

    public boolean isFold() {
        return fold;
    }
    
    public float getWashPrice(){
        return washPrice;
    }
    public float getWaiPrice(){
        return waiPrice;
    }
    public float getIronPrice(){
        return ironPrice;
    }
    public Boolean getFold() {
        return fold;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }
     public void setWashPrice(float washPrice){
        this.washPrice = washPrice;
    }

    public void setWashA(boolean washA) {
        this.washA = washA;
    }

    public void setWaiA(boolean waiA) {
        this.waiA = waiA;
    }

    public void setIronA(boolean ironA) {
        this.ironA = ironA;
    }
    public void setWaiPrice(float waiPrice){
        this.waiPrice=waiPrice;
    }
    public void setIronPrice(float ironPrice){
       this.ironPrice=ironPrice;
    }
    public void setFold(boolean fold) {
        this.fold=fold;
    }

}
