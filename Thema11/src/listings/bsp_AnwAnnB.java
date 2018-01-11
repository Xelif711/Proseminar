private class GUI extends JFrame{

    private JButton left;
    private JButton right;

    public GUI(){
        super("Buttons klicken!");
        setLayout(new FlowLayout());

        left = new JButton("left");
        right = new JButton("right");
        add(left);
        add(right);

        left.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                doSomethingLeft();
            }
        });

        right.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                doSomethingRight();
            }
        });
}
