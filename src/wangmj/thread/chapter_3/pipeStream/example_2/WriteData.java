package wangmj.thread.chapter_3.pipeStream.example_2;

import java.io.PipedWriter;

public class WriteData {

    public void writeMethod(PipedWriter out){
        try {
            System.out.println("write: ");
            for (int i=0; i<300; i++){
                String outData = "" + (i+1);
                out.write(outData);
                System.out.print(outData + " ");
            }
            System.out.println();
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
