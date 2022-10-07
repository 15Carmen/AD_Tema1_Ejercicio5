package parte1;

import java.io.*;


public class MuchasAs {

    public static void main(String[] args) throws IOException {
        try{
            //Declaramos una variable byte donde guardaremos la letra que leamos del ficheroLectura
            byte letra;
            //Nos creamos dos arcvos de lectura y escritura
            RandomAccessFile lectura = new RandomAccessFile("src/parte1/ficheroLectura.txt", "r");
            RandomAccessFile escritura = new RandomAccessFile("src/parte1/ficheroEscritura.txt", "rw");

            //Nos situamos al comienzo del fichero de lectura
            lectura.seek(0);
            //Leemos el byte que se encuentra en esa posición y lo guardamos en la variable letra
            letra=lectura.readByte();

            //Con un bucle for hacemos que se escriban los bytes en el ficheroEscritura 5 veces
            for (int i = 0; i < 5; i++) {
                escritura.write(letra);
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
