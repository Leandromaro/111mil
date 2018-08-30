/*
Se desea realizar un programa que al ingresar un número muestro su equivalente
en número romano
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int millon=0, Cmiles=0, Dmiles=0, miles=0, centenas=0, decenas=0, unidades=0; 
        String romano="", barra="";
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero del 1 al 1.000.000");
        int numero=pant.nextInt();
        millon=numero/1000000;
        Cmiles=numero/100000%10;
        Dmiles=numero/10000%10;
        miles=numero/1000%10;
        centenas=numero/100%10;
        decenas=numero/10%10;
        unidades=numero%10;
        //millon
        if (millon==1){
            barra+="_";
            romano+="M";
        }
        //Cmiles
        switch (Cmiles) {
            case 9:
                barra=barra+"__";
                romano=romano+"CM";
                break;
            case 8:
                barra=barra+"____";
                romano=romano+"DCCC";
                break;
            case 7:
                barra=barra+"___";
                romano=romano+"DCC";
                break;
            case 6:
                barra=barra+"__";
                romano=romano+"DC";
                break;
            case 5:
                barra=barra+"_";
                romano=romano+"D";
                break;
            case 4:
                barra=barra+"__";
                romano=romano+"CD";
                break;
            case 3:
                barra=barra+"__";
                romano=romano+"CCC";
                break;
            case 2:
                barra=barra+"__";
                romano=romano+"CC";
                break;
            case 1:
                barra=barra+"_";
                romano=romano+"C";
                break;
            default:
                break;
        }
        //Dmiles
        switch (Dmiles) {
            case 9:
                barra=barra+"__";
                romano=romano+"XC";
                break;
            case 8:
                barra=barra+"____";
                romano=romano+"LXXX";
                break;
            case 7:
                barra=barra+"___";
                romano=romano+"LXX";
                break;
            case 6:
                barra=barra+"__";
                romano=romano+"LX";
                break;
            case 5:
                barra=barra+"_";
                romano=romano+"L";
                break;
            case 4:
                barra=barra+"__";
                romano=romano+"XL";
                break;
            case 3:
                barra=barra+"__";
                romano=romano+"XXX";
                break;
            case 2:
                barra=barra+"__";
                romano=romano+"XX";
                break;
            case 1:
                barra=barra+"_";
                romano=romano+"X";
                break;
            default:
                break;
        }
        //miles
        switch (miles) {
            case 9:
                barra=barra+"__";
                romano=romano+"IX";
                break;
            case 8:
                barra=barra+"____";
                romano=romano+"VIII";
                break;
            case 7:
                barra=barra+"___";
                romano=romano+"VII";
                break;
            case 6:
                barra=barra+"__";
                romano=romano+"VI";
                break;
            case 5:
                barra=barra+"_";
                romano=romano+"V";
                break;
            case 4:
                barra=barra+"__";
                romano=romano+"IV";
                break;
            case 3:
                romano=romano+"MMM";
                break;
            case 2:
                romano=romano+"MM";
                break;
            case 1:
                romano=romano+"M";
                break;
            default:
                break;
        }
        //centenas
        if (centenas==9){
            romano=romano+"CM";}
        else if (centenas>5&&centenas<=8){
            switch (centenas) {
                case 8:
                    romano=romano+"DCCC";
                    break;
                case 7:
                    romano=romano+"DCC";
                    break;
                default:
                    romano=romano+"DC";
                    break;
            }
        }
        else if (centenas==5){
            romano=romano+"D";}
        else if (centenas==4){
            romano=romano+"CD";}
        else if (centenas>=1 && centenas<=3){
            switch (centenas) {
                case 3:
                    romano=romano+"CCC";
                    break;
                case 2:
                    romano=romano+"CC";
                    break;
                case 1:
                    romano=romano+"C";
                    break;
                default:
                    break;
            }
        }
        //decenas
        if (decenas==9){
            romano=romano+"XC";}
        else if (decenas>5&&decenas<=8){
            switch (decenas) {
                case 8:
                    romano=romano+"LXXX";
                    break;
                case 7:
                    romano=romano+"LXX";
                    break;
                default:
                    romano=romano+"LX";
                    break;
            }
        }
        else if (decenas==5){
            romano=romano+"L";}
        else if (decenas==4){
            romano=romano+"XL";}
        else if (decenas>=1 && decenas<=3){
            switch (decenas) {
                case 3:
                    romano=romano+"XXX";
                    break;
                case 2:
                    romano=romano+"XX";
                    break;
                default:
                    romano=romano+"X";
                    break;
            }
        }
        //unidades
        if (unidades==9){
            romano=romano+"IX";}
        else if (unidades>5&&unidades<=8){
            switch (unidades) {
                case 8:
                    romano=romano+"VIII";
                    break;
                case 7:
                    romano=romano+"VII";
                    break;
                default:
                    romano=romano+"VI";
                    break;
            }
        }
        else if (unidades==5){
            romano=romano+"V";}
        else if (unidades==4){
            romano=romano+"IV";}
        else if (unidades>=1 && unidades<=3){
            switch (unidades) {
                case 3:
                    romano=romano+"III";
                    break;
                case 2:
                    romano=romano+"II";
                    break;
                default:
                    romano=romano+"I";
                    break;
            }
        }
        if (numero>=4000){
            System.out.println(barra);
            System.out.println(romano);}
        else{
            System.out.println(romano);}
    }
}