/*
GroupLayout: is a layout manager that was developed for the use by GUI builder tools,
but it can be used manually. It works with horizontal and vertical layout separately...
*/

import javax.swing.*;
import java.awt.*;
public class index extends Frame{
    Label lbl_fn, lbl_sn, lbl_res;
    Button btn_add;
    TextField txt_fn, txt_sn, txt_res;

    public index(){
        setSize(800,200);
        lbl_fn = new Label("First number: ");
        txt_fn = new TextField(20);
        lbl_sn = new Label("Second number: ");
        txt_sn = new TextField(20);
        lbl_res = new Label("Sum = ");
        txt_res = new TextField(20);
        btn_add = new Button("Add");
        
        GroupLayout g = new GroupLayout(this);
        setLayout(g);

        GroupLayout.SequentialGroup hGroup = g.createSequentialGroup();
        GroupLayout.ParallelGroup hParallelGroup1 = g.createParallelGroup();
        hParallelGroup1.addComponent(lbl_fn);
        hParallelGroup1.addComponent(lbl_sn);
        hParallelGroup1.addComponent(lbl_res);
        hGroup.addGroup(hParallelGroup1);

        GroupLayout.ParallelGroup hParallelGroup2 = g.createParallelGroup();
        hParallelGroup2.addComponent(lbl_fn);
        hParallelGroup2.addComponent(lbl_sn);
        hParallelGroup2.addComponent(lbl_res);
        hGroup.addGroup(hParallelGroup2);

        GroupLayout.SequentialGroup vGroup = g.createSequentialGroup();
        GroupLayout.ParallelGroup vParallelGroup1 = g.createParallelGroup();
        vParallelGroup1.addComponent(lbl_fn);
        vParallelGroup1.addComponent(txt_fn);
        vGroup.addGroup(vParallelGroup1);
        
        GroupLayout.ParallelGroup vParallelGroup2 = g.createParallelGroup();
        vParallelGroup2.addComponent(lbl_sn);
        vParallelGroup2.addComponent(txt_sn);
        vGroup.addGroup(vParallelGroup2);

        GroupLayout.ParallelGroup vParallelGroup3 = g.createParallelGroup();
        vParallelGroup3.addComponent(lbl_res);
        vParallelGroup3.addComponent(txt_res);
        vGroup.addGroup(vParallelGroup3);

        vGroup.addComponent(btn_add);

        g.setHorizontalGroup(hGroup);
        g.setVerticalGroup(vGroup);

        setVisible(true);
    }
    public static void main(String[] args) {
        new index();
    }
}