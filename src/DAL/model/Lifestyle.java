/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL.model;

/**
 *
 * @author Drazen Dragovic
 */
public class Lifestyle {

    private int iDLifeStyle;
    private boolean vegeterian;
    private boolean smoker;
    private int avNoCigarNo;
    private boolean conAlcBever;
    private int avNoDrinksNo;
    private String stimulants;
    private int conCoffeTea;
    private int conSoftDrinks;
    private String regularMeals;
    private String homeFood;
    private int personID;

    public int getiDLifeStyle() {
        return iDLifeStyle;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public int getAvNoCigarNo() {
        return avNoCigarNo;
    }

    public void setAvNoCigarNo(int avNoCigarNo) {
        this.avNoCigarNo = avNoCigarNo;
    }

    public boolean isConAlcBever() {
        return conAlcBever;
    }

    public void setConAlcBever(boolean conAlcBever) {
        this.conAlcBever = conAlcBever;
    }

    public int getAvNoDrinksNo() {
        return avNoDrinksNo;
    }

    public void setAvNoDrinksNo(int avNoDrinksNo) {
        this.avNoDrinksNo = avNoDrinksNo;
    }

    public String getStimulants() {
        return stimulants;
    }

    public void setStimulants(String stimulants) {
        this.stimulants = stimulants;
    }

    public int getConCoffeTea() {
        return conCoffeTea;
    }

    public void setConCoffeTea(int conCoffeTea) {
        this.conCoffeTea = conCoffeTea;
    }

    public int getConSoftDrinks() {
        return conSoftDrinks;
    }

    public void setConSoftDrinks(int conSoftDrinks) {
        this.conSoftDrinks = conSoftDrinks;
    }

    public String getRegularMeals() {
        return regularMeals;
    }

    public void setRegularMeals(String regularMeals) {
        this.regularMeals = regularMeals;
    }

    public String getHomeFood() {
        return homeFood;
    }

    public void setHomeFood(String homeFood) {
        this.homeFood = homeFood;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }
    
    public Lifestyle(int iDLifeStyle, boolean vegeterian, boolean smoker, int avNoCigarNo, boolean conAlcBever, int avNoDrinksNo, String stimulants, int conCoffeTea, int conSoftDrinks, String regularMeals, String homeFood, int personID) {
        this.iDLifeStyle = iDLifeStyle;
        this.vegeterian = vegeterian;
        this.smoker = smoker;
        this.avNoCigarNo = avNoCigarNo;
        this.conAlcBever = conAlcBever;
        this.avNoDrinksNo = avNoDrinksNo;
        this.stimulants = stimulants;
        this.conCoffeTea = conCoffeTea;
        this.conSoftDrinks = conSoftDrinks;
        this.regularMeals = regularMeals;
        this.homeFood = homeFood;
        this.personID = personID;
    }

}
