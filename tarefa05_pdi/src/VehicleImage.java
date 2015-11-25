
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thiag
 */
public class VehicleImage {

    private String filePath;
    private Byte[] data;
    private ImageIcon plate;

    public VehicleImage(String filePath) {
        this.filePath = filePath;
    }

    public VehicleImage() {
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Byte[] getData() {
        return data;
    }

    public void setData(Byte[] data) {
        this.data = data;
    }

    public ImageIcon getPlate() {
        return plate;
    }

    public void setPlate(ImageIcon plate) {
        this.plate = plate;
    }

    public boolean recognizePlate() {
        

        return false;
    }
    
    public boolean savePlateImgFile(String filePath){
        BufferedImage bi = (BufferedImage) plate.getImage();
        File outputfile = new File("saved.png");
        try { 
            ImageIO.write(bi, "png", outputfile);
        } catch (IOException ex) {
            Logger.getLogger(VehicleImage.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return true;
    }
}
