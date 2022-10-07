package parte2;

import java.io.IOException;
import java.io.RandomAccessFile;

public class HastaE {
    public static void main(String[] args){

        try{
            byte letra; //Declaramos una variable byte donde guardaremos la letra que leamos del ficheroLectura
            int pos=0; //Declaramos una variable donde declaramos la posicion en el archivo y la inicializamos a 0

            //Nos creamos dos archivos de lectura y escritura
            RandomAccessFile lectura = new RandomAccessFile("src/parte2/lectura.txt", "r");
            RandomAccessFile escritura = new RandomAccessFile("src/parte2/escritura.txt", "rw");


            for (int i = 0; i < lectura.length()-1; i++) {
                lectura.seek(pos++);
                letra=lectura.readByte();
                escritura.writeByte(letra);
                escritura.seek(pos);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }





    }
}
