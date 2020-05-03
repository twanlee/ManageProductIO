import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Save {
    public static void main(String[] args) {
        Product[] product = new Product[3];
        product[0] = new Product("A1","111","Ford",20);
        product[1] = new Product("B1","112","Ford",30);
        product[2] = new Product("C1","113","Ford",40);
        try{
            FileOutputStream os = new FileOutputStream("product.txt");
            for (int i=0; i<product.length; i++){
                byte[] bytes = product[i].show().getBytes();
                byte[] line = "\n".getBytes();
                os.write(bytes);
                os.write(line);
            }
            System.out.println("Done!");
            os.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            File file = new File("D:\\Code Gym\\Git\\Module 2\\Java\\ManageProductIO\\product.txt");
            BufferedReader bf = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line=bf.readLine())!= null){
                String[] products = line.split(".");
                System.out.println(products.toString());
            }
            bf.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

