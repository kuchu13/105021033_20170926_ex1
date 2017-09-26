import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
private  Button btnAdd = new Button("add");
private Label lab = new Label("0");
private int n=0;

    public MainFrame(){
        initComp();
    }
private void initComp(){
        this.setBounds(100,120,400,300);
        this.setLayout(null);

    btnAdd.setBounds(150,110,80,30);
    this.add(btnAdd);
    btnAdd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MainFrame.this.setTitle(Integer.toString(++n));
            lab.setText(Integer.toString(n));
        }
    });






    lab.setBounds(150,170,80,30);
    this.add(lab);



        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
}
}
