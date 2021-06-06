/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        String principal=in.nextLine();

        System.out.print("What is the rate? ");
        String rate=in.nextLine();

        System.out.print("What is the number of years? ");
        String years=in.nextLine();

        double p=Double.parseDouble(principal);
        double r=Double.parseDouble(rate)/100.00;
        double t=Double.parseDouble(years);


        System.out.print("What is the amount of times the interest is compunded per year? ");

        String compounded=in.nextLine();

        double n=Double.parseDouble(compounded);

        double investment=(1+(r/n));

        double compoundedInvest=investment;

        for(int i=0; i<(n*t)-1; i++){
            compoundedInvest*=investment;
        }

        compoundedInvest*=p;

        double rounded=Math.round(compoundedInvest*100.0)/100.0;

        System.out.print("$"+principal+" invested at "+rate+"% for "+years+" years compounded "+compounded+" times per year is $"+String.format("%.2f",rounded)+".");


    }
}
