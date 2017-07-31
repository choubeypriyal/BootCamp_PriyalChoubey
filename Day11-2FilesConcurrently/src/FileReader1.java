import java.io.*;

/**
 * Created by choubeyp on 7/31/2017.
 */
public class FileReader1 extends Thread {
    public void run(){                          //reading file 1 in run()
            InputStream fis = null;
            InputStreamReader isr = null;
            BufferedReader br = null;
            try {
                File file = new File("C:\\Users\\choubeyp\\IdeaProjects\\BootCamp_PriyalChoubey\\Day11-2FilesConcurrently\\File1");
                //byte stream
                fis = new FileInputStream(file);
                //char stream
                isr = new InputStreamReader(fis);
                br = new BufferedReader(isr);
                String line = br.readLine();
                while(line != null){
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }finally{
                try{
                    if(br != null){
                        br.close();
                    }
                    if(isr != null){
                        isr.close();
                    }
                    if(fis != null){
                        fis.close();
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
    }
}
