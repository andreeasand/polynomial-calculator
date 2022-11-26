import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

public class CalculatorView extends JFrame {

    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JTextField text4;
    private JButton multiplicate;
    private JButton subtract;
    private JButton divide;
    private JButton derivate;
    private JButton add;
    private JButton integrate;
    private JButton unu;
    private JButton doi;
    private JButton trei;
    private JButton patru;
    private JButton cinci;
    private JButton sase;
    private JButton sapte;
    private JButton opt;
    private JButton noua;
    private JButton zero;
    private JButton plus;
    private JButton minus;
    private JButton div;
    private JButton star;
    private JButton putere;
    private JButton punct;
    private JButton x;
    private JButton del;

    public CalculatorView()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,450);
        this.setVisible(true);

        JPanel panel_0= new JPanel();
        JLabel titlu= new JLabel("Polynomial Calculator");
        titlu.setFont(new Font("Calibri", Font.BOLD, 20));
        titlu.setHorizontalAlignment(SwingConstants.CENTER);
        panel_0.add(titlu);
        this.add(panel_0,BorderLayout.NORTH);

        JPanel panel_1=new JPanel();

        panel_1.setLayout(new GridLayout (7 , 2));
        JLabel first = new JLabel(" First Polynomial = ");
        panel_1.add(first);
        text1=new JTextField();
        text1.setColumns(20);
        panel_1.add(text1);
        JLabel second= new JLabel(" Second Polynomial = ");
        panel_1.add(second);
        text2=new JTextField();
        text2.setColumns(20);
        panel_1.add(text2);
        JLabel result= new JLabel(" Result = ");
        panel_1.add(result);
        text3=new JTextField();
        text3.setColumns(20);
        panel_1.add(text3);
        JLabel rest= new JLabel(" Rest = ");
        panel_1.add(rest);
        text4=new JTextField();
        text4.setColumns(20);
        panel_1.add(text4);
        multiplicate= new JButton("Multiplicate");
        panel_1.add(multiplicate);
        subtract= new JButton("Subtract");
        panel_1.add(subtract);
        divide= new JButton("Divide");
        panel_1.add(divide);
        derivate= new JButton("Derivate");
        panel_1.add(derivate);
        add= new JButton("Add");
        panel_1.add(add);
        integrate= new JButton("Integrate");
        panel_1.add(integrate);
        this.add(panel_1,BorderLayout.CENTER);

        JPanel panel_2=new JPanel();
        panel_2.setLayout(new GridLayout(3,6));
        unu= new JButton("1");
        //unu.setBackground(Color.yellow);
        panel_2.add(unu);
        doi= new JButton("2");
        panel_2.add(doi);
        trei= new JButton("3");
        panel_2.add(trei);
        zero= new JButton("0");
        panel_2.add(zero);
        plus= new JButton("+");
        panel_2.add(plus);
        minus= new JButton("-");
        panel_2.add(minus);
        patru= new JButton("4");
        panel_2.add(patru);
        cinci= new JButton("5");
        panel_2.add(cinci);
        sase= new JButton("6");
        panel_2.add(sase);
        div= new JButton("/");
        panel_2.add(div);
        star= new JButton("*");
        panel_2.add(star);
        putere= new JButton("^");
        panel_2.add(putere);
        sapte= new JButton("7");
        panel_2.add(sapte);
        opt= new JButton("8");
        panel_2.add(opt);
        noua= new JButton("9");
        panel_2.add(noua);
        punct= new JButton(".");
        panel_2.add(punct);
        x= new JButton("x");
        panel_2.add(x);
        del= new JButton("del");
        panel_2.add(del);
        this.add(panel_2,BorderLayout.SOUTH);

        this.setVisible(true);

    }

    public String getFirstPolynom(){
        return text1.getText();
    }
    public String getSecondPolynom(){
        return text2.getText();
    }

    void addMultiplicateListener(ActionListener listenMultiplicate)
    {
        multiplicate.addActionListener(listenMultiplicate);
    }

    void addText1Listener(MouseListener listenText1){
        text1.addMouseListener(listenText1);
    }
    void addText2Listener(MouseListener listenText2)
    {
        text2.addMouseListener(listenText2);
    }
    void addSubtractListener(ActionListener listenSubtract)
    {
        subtract.addActionListener(listenSubtract);
    }
    void addDivideListener(ActionListener listenDivide)
    {
        divide.addActionListener(listenDivide);
    }
    void addModuloListener(ActionListener listenModulo)
    {
        derivate.addActionListener(listenModulo);
    }
    void addAddListener(ActionListener listenAdd)
    {
        add.addActionListener(listenAdd);
    }
    void addExitListener(ActionListener listenExit)
    {
        integrate.addActionListener(listenExit);
    }
    void addUnuListener(ActionListener listenUnu)
    {
        unu.addActionListener(listenUnu);
    }
    void addDoiListener(ActionListener listenDoi)
    {
        doi.addActionListener(listenDoi);
    }
    void addTreiListener(ActionListener listenTrei)
    {
        trei.addActionListener(listenTrei);
    }
    void addPatruListener(ActionListener listenPatru)
    {
        patru.addActionListener(listenPatru);
    }
    void addCinciListener(ActionListener listenCinci)
    {
        cinci.addActionListener(listenCinci);
    }
    void addSaseListener(ActionListener listenSase)
    {
        sase.addActionListener(listenSase);
    }
    void addSapteListener(ActionListener listenSapte)
    {
        sapte.addActionListener(listenSapte);
    }
    void addOptListener(ActionListener listenOpt)
    {
        opt.addActionListener(listenOpt);
    }
    void addNouaListener(ActionListener listenNoua)
    {
        noua.addActionListener(listenNoua);
    }
    void addZeroListener(ActionListener listenZero)
    {
        zero.addActionListener(listenZero);
    }
    void addPlusListener(ActionListener listenPlus)
    {
        plus.addActionListener(listenPlus);
    }
    void addMinusListener(ActionListener listenMinus)
    {
        minus.addActionListener(listenMinus);
    }
    void addDivListener(ActionListener listenDiv)
    {
        div.addActionListener(listenDiv);
    }
    void addStarListener(ActionListener listenStar)
    {
        star.addActionListener(listenStar);
    }
    void addPutereListener(ActionListener listenPutere)
    {
        putere.addActionListener(listenPutere);
    }
    void addPunctListener(ActionListener listenPunct)
    {
        punct.addActionListener(listenPunct);
    }
    void addXListener(ActionListener listenX)
    {
        x.addActionListener(listenX);
    }
    void addDelListener(ActionListener listenDel)
    {
        del.addActionListener(listenDel);
    }

    public void setResult(String solution)
    {
        text3.setText(solution);
    }
    public void setRest(String solution){
        text4.setText(solution);
    }

    public void setText1(String text1) {
        this.text1.setText(text1);
    }

    public void setText2(String text2) {
        this.text2.setText(text2);
    }
}
