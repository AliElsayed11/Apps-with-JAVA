/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calc.time;
public class CalcTime {
    public static void main(String[] args) {
        Time r1 =new Time(11,120,100);
        Time r2 =new Time(9,65,70);
        Time r3 =new Time();
        r3 =Time.addition(r1,r2);
        r3.Good_Display();
        r3.Display_Time();
    }
    }
