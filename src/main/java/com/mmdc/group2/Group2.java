/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mmdc.group2;

import javax.swing.JFrame;
/**
 *
 * @author enuj
 */
public class Group2 {
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        InventoryUI ui = new InventoryUI();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(ui);
        frame.pack();
        frame.setVisible(true);
    }
}
