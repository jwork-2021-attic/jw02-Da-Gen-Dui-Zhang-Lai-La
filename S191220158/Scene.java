package S191220158;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Scene {
    public static void main(String[] args) throws IOException {
      Line line = new Line(10);
      Monster []monster=new Monster[10];
        boolean []randomList; 
        randomList=new boolean[10];
        for(int i=0;i<10;i++){
          int radom = (int)(Math.random()*10);
          if(randomList[radom]==false)
            randomList[radom]=true;
          else{
             while(randomList[radom]!=false)
             radom = (int)(Math.random()*10);
             randomList[radom]=true;
          }
          int r=(int)(Math.random()*255);
          int g=(int)(Math.random()*255);
          int b=(int)(Math.random()*255);
          monster[i]=new Monster(r,g,b,String.format("%03d", radom+1));
          line.put(monster[i],i);
        }
        Boss theGeezer = Boss.getTheGeezer();

        Sorter sorter = new InsertSorter();

        theGeezer.setSorter(sorter);

        String log = theGeezer.lineUp(line,monster);

        BufferedWriter writer;

        writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
   }
}