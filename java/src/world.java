import javax.swing.*;

import static java.lang.Math.pow;

public class world {

    public static void main(String[] args) {
        double a=Integer.parseInt(JOptionPane.showInputDialog("podaj a: "));
        double b=Integer.parseInt(JOptionPane.showInputDialog("podaj b: "));
        double c=Integer.parseInt(JOptionPane.showInputDialog("podaj c: "));
        double h=Integer.parseInt(JOptionPane.showInputDialog("podaj h: "));
        trojkat trojkat = new trojkat(a,b,c , h);

        System.out.print("pole trójk¹ta: "+poletr(trojkat));
        System.out.println("czy trojk¹t jest prostok¹tny.");
        SprawdzenieCzyProstokatne(trojkat._a , trojkat._b , trojkat._c);

        double[]  array = new double[3];
        array[0] = trojkat._a;
        array[1] = trojkat._b;
        array[2] = trojkat._c;

        sortowanie(array);

        	sprawdzanieczyrozw(trojkat._a,trojkat._b,trojkat._c);

        	System.out.println("TO by BYLo na tyle");
    }
   

    
    static double poletr(trojkat a)
    {
    		double trojkatA = a._a;
        double trojkatB = a._b;
        	double trojkatC = a._c;
        double wysokosc = a._h;
        if((trojkatA+trojkatB>trojkatC)&&(trojkatA+trojkatC>trojkatB)&&(trojkatB+trojkatC>trojkatA))
        {
            	double p=((trojkatA+trojkatB+trojkatC)/2);
            return (double)Math.sqrt(p*(p-trojkatA)*(p-trojkatB)*(p-trojkatC));
        }else return 0;
    }
    static void SprawdzenieCzyProstokatne(double a,double b , double c)
    {
        double ap = pow(a,2);
        double bp = pow(b,2);
        double cp = pow(c,2);

        double x = ap+bp;
        if(x!=cp) {
            System.out.println(" nie jest prostokatny");
        }
        else {
            System.out.println(" jest prostokatny");
        }
    }
    static void sprawdzanieczyrozw(double a,double b , double c)
    {
        double checkC = pow(c,2);
        double checkB = pow(b,2);
        double checkA = pow(a,2);

       double sum = checkB + checkA;
        if(checkC < sum) {
            System.out.println("jest rozwartokatny.");
        }
        else {
            System.out.println(" nie jest rozwartokatny");
        }
    }
    
    
    
    
    
    
     static void sortowanie(double tab[]){
        double temp;
        double zmiana = 1;
        while(zmiana > 0){
            zmiana = 0;
            	for(int i=0; i<tab.length-1; i++){
                	if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana++;
                }
            }
        }
        	System.out.println("Posortowane boki wygladaja tak:");
        	for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }
        System.out.println();
    }
}
