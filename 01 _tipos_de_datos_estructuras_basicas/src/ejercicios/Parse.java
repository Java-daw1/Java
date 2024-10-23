package ejercicios;

public class Parse {

    public Parse (){


        int x=123;
        int num;
        String num2;
        num=Integer.parseInt("12345");
        System.out.println(num);
        //Comentar metodo valueOF para hacer lo contrario
        num2=String.valueOf(14);
        String numString=Integer.toString(x);
        System.out.println("Numero "+x+ " como cadena :"+numString);
        System.out.println("1111 en base 2 = " +Integer.parseInt("1111",2));
        System.out.println("123456 en hexadecimal = " + Integer.toHexString(123456));
        System.out.println("135 en binario = " +Integer.toBinaryString(135));

        }
    }


