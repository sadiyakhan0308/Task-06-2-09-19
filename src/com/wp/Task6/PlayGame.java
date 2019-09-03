package com.wp.Task6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class PlayGame {

private static Scanner sc;
private static ObjectInputStream ois;

public static void main(String[] args) throws Exception {
sc = new Scanner(System.in);
System.out.println("Enter 1 For New Game, 2 For Resuming Previous One : ");
int ch=sc.nextInt();
System.out.println("Horizontal Move : ");
int x=sc.nextInt();
System.out.println("Vertical Move : ");
int y=sc.nextInt();
System.out.println("Diagonal Move : ");
int z=sc.nextInt();
Game g=null;

if(ch==1){
g=new Game();
}else{
FileInputStream fis=new FileInputStream("E:\\C\\merge.txt");
ois = new ObjectInputStream(fis);
g=(Game) ois.readObject();

}

g.moveH(x); g.moveV(y);g.move(z);
g.showPos();

System.out.println("Saving Game Instance ..");
FileOutputStream fos=new FileOutputStream("E:\\C\\merge.txt");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(g);
oos.close(); fos.close();
System.out.println("Closing Game ..");





}
}

