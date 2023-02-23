/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResturantProjectComplete;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author flash
 */
public class SuperClass_Parent {
    
    // MEALS
    public double Filet_O_Fish;
    public double ChickenBurger;
    public double ChickenLegend;
    public double ChickenBurgerM;
    public double BaconCheeseBurger;
    
    
    // DRINKS
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocoMilkShake;
    
    
    
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    
    public double GetAmount() {
        
        Meals = Filet_O_Fish + ChickenBurger + ChickenLegend + ChickenBurgerM + BaconCheeseBurger;
        Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocoMilkShake;
        
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        
        return AllTotalofMD;
    }
    
    
    private JFrame frame;
    
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Resturant Management System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }

// ================PRICE==================
    // MEALS
    public double pFilet_O_Fish = 1000.00;
    public double pChickenBurger = 299.00;
    public double pChickenLegend = 599.00;
    public double pChickenBurgerM = 649.00;
    public double pBaconCheeseBurger = 849.00;
    
    
    // DRINKS
    public double pMilkShake = 390.00;
    public double pVanillaCone = 449.00;
    public double pClasVanilla = 399.00;
    public double pVanMilkShake = 499.00;
    public double pChocoMilkShake = 499.00;
    
// ================TAX / GST =============
    
    public double mcTax = 0.50;
    public double cFindTax(double cAmount) {
        
        double FindTax = cAmount - (cAmount * mcTax);
//          double FindTax = cAmount + mcTax;
             
        return FindTax;
    } 
    
}
