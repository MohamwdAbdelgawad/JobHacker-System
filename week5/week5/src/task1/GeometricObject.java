/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;
import java.util.Date;

public class GeometricObject {
    private String colorName;
    private boolean isFilled;
    private Date creationDate;

    public GeometricObject(String colorName, boolean isFilled) {
        this.colorName = colorName;
        this.isFilled = isFilled;
        this.creationDate = new Date();
    }

    

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String toString() {
        return "Color: " + colorName + ", Filled: " + isFilled + ", Creation Date: " + creationDate;
    }
}
