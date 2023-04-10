/*
package ru.itmo.lessons.lesson06.homework2;
import java.util.Arrays;
public class MyBasket {
    private int pr;
    private  int fats;
    private  int carbs;
    private int cal;
    private  NutVal[] nutVal;
    private int size;


    public  MyBasket(int pr, int fats, int carbs, int cal, int size) {
        setPr(pr);
        setFats(fats);
        setCarbs(carbs);
        setCal(cal);
        setSize(size);
        setNutVal(size);
    }

    public void setPr(int pr) {
        if(pr < 0) {
            throw new IllegalArgumentException("белков меньше 0");
        }
        this.pr = pr;
    }

    public void setFats(int fats) {
        if(fats < 0) {
            throw new IllegalArgumentException("жиров меньше 0");
        }
        this.fats = fats;
    }

    public void setCarbs(int carbs) {
        if(carbs < 0) {
            throw new IllegalArgumentException("углеводов меньше 0");
        }
        this.carbs = carbs;
    }

    public void setCal(int cal) {
        if(cal < 0) {
            throw new IllegalArgumentException("калорий меньше 0");
        }
        this.cal = cal;
    }

    public void setSize(int size) {
        if(size < 0) {
            throw new IllegalArgumentException("size меньше 0");
        }
        this.size = size;
    }

    public void setNutVal(int size) {
        this.nutVal = new NutVal[size];
    }

    public int getPr() {
        return pr;
    }

    public int getFats() {
        return fats;
    }

    public int getCarbs() {
        return carbs;
    }

    public int getCal() {
        return cal;
    }

    public NutVal[] getNutVal() {
        return nutVal;
    }

    public int getSize() {
        return size;
    }
    public void addProduct(NutVal nutVal) {
        if(nutVal.getPr() > this.getPr()) {
            System.out.println("Product " + nutVal.getName() +
                    "Слишком много белков. Продукт не добавлен в корзину");
            return;
        }
        if(nutVal.getFats() > this.getFats()) {
            System.out.println("Product " + nutVal.getName() +
                    "Слишком много жиров. Продукт не добавлен в корзину");
            return;
        }
        if(nutVal.getCarbs() > this.getCarbs()) {
            System.out.println("Product " + nutVal.getName() +
                    "Слишком много углеводов. Продукт не добавлен в корзину");
            return;
        }
        if(nutVal.getCal() > this.getCal()) {
            System.out.println("Product " + nutVal.getName() +
                    "Слишком много калорий. Продукт не добавлен в корзину");
            return;
        }
        for (int i = 0; i < getNutVal().length; i++) {
            if(nutVal[i] == null) {
                nutVal[i] = nutVal;
                return;
            }
            if (i == getNutVal().length - 1 ){
                System.out.println("Корзина заполнена");
            }
        }

    }


    public String toString() {
        return
                Arrays.toString(nutVal);
                   }

}
*/
